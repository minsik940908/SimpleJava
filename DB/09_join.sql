-- JOIN
-- 둘 이상의 테이블을 연결하여 데이터를 검색하는 방법
-- 두개의 테이블이 조인 하려면 적어도 하나의 컬럼이 두개 테이블 사이에서 공유 되어야 한다.
-- 일반적으로 pk-fk 값을 이용하여 조인한다.

-- JOIN의 방법
-- Outter Join(LEFT JOIN, RIGHT JOIN, FULL JOIN)
-- Equi Join(등가 조인, NATURAL JOIN, INNER JOIN)
-- Self Join
-- Cross Join, Non-Equi Join

-- 1. CROSS JOIN
-- 카다시안 곱 수행한다.
-- emp(10) * dept(4) = 40
-- FROM [tableA] CROSS JOIN [tableB]
SELECT e.deptno, e.ename, d.deptname FROM emp e CROSS JOIN dept d;
-- CROSS JOIN 은 생략 가능 하다.
SELECT e.deptno, e.ename, d.deptname FROM emp e, dept d;
--CROSS JOIN 은 두 테이블의 모든 컬럼을 연결해서 보여주므로 크게 의미있는 데이터를 뽑기 어렵다.
-- 그래서 특정 조건을 주어 Equi 조인을 수행 한다.

-- 1) Equi JOIN(등가 조인) *****
-- 가장 일반적으로 사용하는 = 의한 조인이다.
SELECT e.deptno, e.ename, d.deptname FROM emp e, dept d WHERE e.deptno = d.deptno;

-- 2) INNER JOIN(내부 조인) ****
-- JOIN의 조건이 ON 절 뒤에 붙는다.
SELECT e.deptno, e.ename, d.deptname FROM emp e INNER JOIN dept d ON e.deptno = d.deptno;
-- INNER 는 생략이 가능
SELECT e.deptno, e.ename, d.deptname FROM emp e JOIN dept d ON e.deptno = d.deptno;
-- ON 대신 USING 을 사용 할 수 있다.
-- USING 에 사용된 컬럼은 SELECT 문으로 불러올 수 없다,
-- USING 절 안에는 서브쿼리도 사용 가능 하다.
SELECT deptno, e.ename, d.deptname FROM emp e INNER JOIN dept d USING(deptno);

-- 3) NATURAL JOIN **
-- JOIN 이라는 자체가 공통되는 컬럼을 갖는것이기 때문에 조건 절을 사용하지 않는다.
SELECT deptno, e.ename, d.deptname FROM emp e NATURAL JOIN dept d;

INSERT INTO dept VALUES (5, 'dev02', 'FLOIDA');
-- 등가조인은 조인하는 양 테이블에 데이터가 있어야만 보여준다.
-- dept 테이블에 deptno 가 5 인놈이 있지만
-- emp 에는 deptno 5를 사용하는 놈이 없으므로
-- JOIN 에서 dept 5 에 해당하는 값은 보여주지 않는다.
-- 우리가 예상한 상황
-- e.deptno, e.ename, d.deptname
--   (null),       (null),      (dev05)
-- 그래서 우리는 OUTTER JOIN 을 사용 한다.

-- 자기 조인(SELF JOIN)
-- Equi JOIN 과 같다.
-- 얘는 하나의 테이블로 조인을 한다.
-- 자기조인을 하면 두 데이터간 카다시안 곱을 수행한다.
SELECT a.ename, b.ename FROM emp a, emp b;

-- 외부조인(OUTTER JOIN)
-- ANSI SQL, ORACLE SQL
select * from dept;
select * from emp;
-- OUTTER JOIN 연산자 (+)
-- 이 연산자는 오직 ORACLE 에서만 사용 한다.
-- 이 연산자는 또 양쪽에 사용할 수 없으며 데이터가 없는 곳에 붙여 준다.
-- 공통으로 사용하는 deptno 가 dept 테이블에는 1~5 까지 있지만
-- emp 테이블에는 (1,2,4) 만 사용하고 있다.
-- 그래서 부족한 emp 테이블에 (+) 를 추가 하여 null 을 채워 준다.
select DISTINCT(e.deptno) AS e_no, d.deptno AS d_no, d.deptname 
        from emp e, dept d WHERE e.deptno(+) = d.deptno;

-- ANSI SQL : 공통 
-- 데이터가 더 있는놈을 지목
-- FROM [tableA] [LEFT | RIGHT] OUTTER JOIN [tableB]
-- LEFT OUTER JOIN (왼쪽에 더 있다.)
-- RIGHT OUTER JOIN (오른쪽에 더 있다.)
-- FULL OUTER JOIN(양쪽에 각각 없는 값이 있음)
select DISTINCT(e.deptno) AS e_no, d.deptno AS d_no, d.deptname 
        from emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno;
        
select * from emp;





