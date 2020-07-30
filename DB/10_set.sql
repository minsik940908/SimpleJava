-- QRY1 [UNION | UNION ALL | INTERSECT | MINUS] QRY2 -- 속도가 느리다
-- 1.UNION(중복을 제거한 합집합)
-- 동일 컬럼이 존재해야 한다. (그렇지 않으면 제 멋대로 섞인다.)
select deptno from emp
UNION
select deptno from dept;


-- 2. UNION ALL(중복을 제거하지 않은 합집합)
select deptno from emp
union all
select deptno from dept;

-- 3. INTERSECT(교집합)
select deptno from emp
INTERSECT
select deptno from dept;
-- 먼저 오는 쿼리문의 테이블 기준
-- 4. MINUS(차집합)
select deptno from dept
MINUS
select deptno from emp;
