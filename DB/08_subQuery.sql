-- 서브쿼리는 '쿼리안의 쿼리'
-- 이전에 추출된 쿼리의 내용을 재검색 하거나
-- 검색된 내용으로 가상의 컬럼을 만들어 추가할 수 있다.
CREATE TABLE dept(
    deptno VARCHAR2(10),
    deptname VARCHAR2(20),
    loc VARCHAR2(10)
);

CREATE TABLE emp(
    ename VARCHAR2(20),
    deptno VARCHAR2(10),
    job VARCHAR2(10),
    hiredate DATE
);

INSERT INTO dept(deptno, deptname, loc) VALUES(1, 'sales', 'NEWYORK');
INSERT INTO dept(deptno, deptname, loc) VALUES(2, 'dev01', 'LA');
INSERT INTO dept(deptno, deptname, loc) VALUES(3, 'personnel', 'NEWYORK');
INSERT INTO dept(deptno, deptname, loc) VALUES(4, 'delevery', 'BOSTON');

-- 모든 속성에 모두 값을 집어 넣을 경우 속성 생략 가능
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('kim',1,  'manager', to_date('16/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('lee', 1, 'staff', to_date('15/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('han', 1, 'staff', to_date('16/03/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('kim', 1, 'assistant', to_date('15/09/22', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('ahn', 2, 'staff', to_date('15/11/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('hwang', 2, 'manager', to_date('15/08/12', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('cha', 2, 'assistant', to_date('12/03/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('hong', 2, 'staff', to_date('14/08/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('gang', 2, 'staff', to_date('16/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, deptno, job, hiredate) VALUES ('nam,', 4, 'leader', to_date('10/01/02', 'YY/MM/DD'));

ALTER TABLE dept  ADD CONSTRAINT pk_deptno PRIMARY KEY(deptno);

ALTER TABLE emp  ADD CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES dept(deptno);

-- 문제1> 'han' 의 근무 부서는 어디인가? (emp에서 한의 deptno를 알아내고 dept에서 deptno로 한의 부서를 조회한다.)
-- emp에서 han의 deptno를 찾는다.
select * from emp where ename='han';
-- 알아낸 deptno 로 deptname 을 찾는다.
select * from dept where deptno=1;

--SELECT deptno FROM emp WHERE ename='han';
SELECT deptname FROM dept WHERE deptno = (SELECT deptno FROM emp WHERE ename='han');

-- 문제 2> 부서위치가 LA 나 BOSTON 인 부서에 속한 사람들의 이름과 직책
-- deptno 테이블에서 LA와BOSTON에 근무하는 직원의 deptno를 뽑아낸다.
-- emp테이블에서 뽑아낸 deptno를 조회해서 직원의 이름과 직책을 조회한다.
-- 서브쿼리에서 OR가 많으면 IN을 사용
SELECT ename, job FROM emp WHERE deptno IN (SELECT deptno FROM dept WHERE loc='LA' or loc ='BOSTON');

-- 문제 3> 직책(job)이 MANAGER인 사원들 보다 입사일이 빠른 직원의 이름과 직책 입사일?
-- 1. 직책이 MANAGER 중에서 입사일이 제일 빠른(작은) 사원의 데이터 조회
-- 2. 1번의 사원 보다 입사일이 빠른 직원의 이름과 직책 입사일 조회

-- 1.
SELECT hiredate FROM emp WHERE job='manager' ORDER BY hiredate ASC;
SELECT MIN(hiredate) FROM emp WHERE job='manager' ORDER BY hiredate ASC;

-- 2.
SELECT ename, hiredate FROM emp WHERE hiredate < '15/08/1z2' ORDER BY hiredate ASC;

-- 3. 서브쿼리
SELECT ename, job, hiredate FROM emp WHERE hiredate < (SELECT MIN(hiredate) FROM emp WHERE job='manager') ORDER BY hiredate ASC;

-- ANY : 메인쿼리의 비교 조건이 서브쿼리 결과중 하나라도 일치하면 참
-- = ANY : IN 과 같은 효과
-- IN 과 다른 점 : 최대값이나 최소값 비교가 가능
-- > ANY : 최소값 보다 크면
-- < ANY : 최대값 보다 작으면

-- 직책이 manager 인 직원의 입사일이 가장 빠른(가장 작은) 직원보다 늦은 직원의 정보
-- 최소값 보다 큰 내용을 뽑아라
-- 15/08/12 보다 큰놈 찾기
select ename, job, hiredate from emp where hiredate > ANY(select hiredate from emp where job='manager');
--16/01/02 보다 작은놈 찾기
select ename, job, hiredate from emp where hiredate < ANY(select hiredate from emp where job='manager');

-- 문제 4> sales 부서에 근무하는 이름, 직책 찾기
-- 1. dept 테이블에서 sales 부서에서 근무하는 사원 번호 조회
-- 2. 1에서 조회한 사원 번호를 emp 테이블에서 조회해  그에 맞는 이름, 직책 찾기

-- 1
select deptno from dept where deptname='sales';
-- 2
select ename, job from emp where deptno=1;
-- 3. 서브 쿼리
select ename, job from emp where deptno IN (select deptno from dept where deptname='sales');

-- 문제 5> 부서별로 직원이 몇명인지 데이터 가져오기
-- 예) sales, newyork, 3[팀명, 위치, 부서원 수]
-- 1. dept 테이블에  loc deptname조회
SELECT deptno, deptname, loc FROM dept;

--2. emp 테이블에서 부서별 인원수 조회 
SELECT ename FROM emp WHERE deptno=1; --4명
SELECT ename FROM emp WHERE deptno=2; --5명
SELECT ename FROM emp WHERE deptno=3; --0명
SELECT ename FROM emp WHERE deptno=4; --1명

SELECT COUNT(deptno) AS 인원수 FROM emp WHERE deptno=1 ;

-- 추출한 쿼리를 하나의 컬럼으로 보여준다.
-- 이런 형태를 상하 관계 쿼리
SELECT deptno, deptname, loc, (SELECT COUNT(deptno) AS 인원수 FROM emp WHERE deptno=d.deptno) AS cnt FROM dept d; --컬럼에 별칭 사용, 테이블에 별칭사용(dept -> d)

