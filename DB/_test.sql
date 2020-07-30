-- 1번 정답
CREATE TABLE dept(
    deptno VARCHAR2(2),
    deptname VARCHAR2(10),
    loc VARCHAR2(20)
);
Create Table emp(
    ename VARCHAR2(10),
    job VARCHAR2(20),
    deptno VARCHAR2(2),
    hiredate DATE
);

-- 2번 정답
ALTER TABLE dept ADD CONSTRAINT pk_deptno PRIMARY KEY(deptno);

-- 3번 정답
ALTER TABLE emp ADD Constraint fk_deptno FOREIGN KEY(deptno) REFERENCES dept(deptno);

-- 4번 정답
-- dept테이블 데이터 삽입
INSERT INTO dept(deptno, deptname, loc) VALUES (1, 'sales', 'NEWYORK');
INSERT INTO dept(deptno, deptname, loc) VALUES (2, 'dev01', 'LA');
INSERT INTO dept(deptno, deptname, loc) VALUES (3, 'personnel', 'NEWYORK');
INSERT INTO dept(deptno, deptname, loc) VALUES (4, 'delevery', 'BOSTON');
-- emp테이블 데이터 삽입
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('kim', 'manager', 1, TO_DATE('16/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('lee', 'staff', 1, TO_DATE('15/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('han', 'staff', 1, TO_DATE('16/03/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('kim', 'assistant', 1, TO_DATE('15/09/22', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('ahn', 'staff', 2, TO_DATE('15/11/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('hwang', 'manager', 2, TO_DATE('15/08/12', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('cha', 'assistant', 2, TO_DATE('12/03/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('hong', 'staff', 2, TO_DATE('14/08/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('gang', 'staff', 2, TO_DATE('16/01/02', 'YY/MM/DD'));
INSERT INTO emp(ename, job, deptno, hiredate) VALUES('nam', 'leader', 4, TO_DATE('10/01/02', 'YY/MM/DD'));

-- 5번 정답
Desc emp;

-- 6번 정답
SELECT deptname FROM dept WHERE deptno=(SELECT deptno FROM emp Where ename='han');

-- 7번 정답
SELECT ename, job FROM emp WHERE deptno in (Select deptno FROM dept WHERE loc='LA' or loc='BOSTON');

-- 8번 정답
SELECT e.ename, d.deptname FROM emp e, dept d WHERE e.deptno = d.deptno;

-- 9번 정답
SAVEPOINT A;
DELETE FROM emp;
ROLLBACK TO SAVEPOINT A;
COMMIT;









