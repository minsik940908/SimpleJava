-- View 는 여러 테이블을 묶어서 만든 가상 테이블이다.
-- View 는 특정한 옵션없이는 수정/삭제가 불가능 하다.

-- 1) View 제한 조건
-- 테이블에 데이터가 NULL 인 컬럼은 View에 포함될수 없다.
-- WITH CHECK OPTION 을 설정한 View 는 view 조건에 해당되는 데이터만 수정할 수 있다.
-- 하지만 ROWID, ROWNUM, NEXTVAL, CURRVAL 같은 가상컬럼에 대한 참조를 포함하고 있는 View는 
-- 어떠한 데이터도 INSERT 할 수 없다.

-- 2) View 생성 문법
-- CREATE [OR REPLACE] [FORCE|NOFORCE] VIEW [view_name] AS [서브쿼리]
-- [WHERE 조건 WITH CHECK OPTION] [WITH READ ONLY]
-- OR REPLACE : 뷰의 구조를 재사용하여 수정한다.(없을 경우 뷰를 삭제하고 다시 만든다.)
-- FORCE : 실제하는 테이블이 없더라도 무조건 VIEW를 만들도록 한다.

-- 3) View 생성
CREATE OR REPLACE VIEW name_ary AS SELECT e.ename, d.deptname FROM emp e, dept d WHERE e.deptno = d.deptno;
-- ORA-01031 : 권한이 불충분합니다. (뷰를 만들려면 관리자에게 권한을 받아야 한다.) -> grant create view C##web_user;
-- 뷰 확인
SELECT * FROM name_ary;

-- 4) WITH CHECK OPTION : 뷰의 조건식을 만족하는 컬럼은 UPDATE가 가능
CREATE OR REPLACE VIEW check_option AS SELECT ename, job, deptno FROM emp WHERE deptno =1 with check option;

select * from check_option;

update check_option set job='manager' where ename='lee';
-- 수정 됨
update check_option set deptno=2 where ename='lee';
-- ORA-01402: 뷰의 WITH CHECK OPTION의 조건에 위배 됩니다

-- 5) WITH READ ONLY : SELECT 만 가능 하도록 한다.
CREATE OR REPLACE VIEW read_only AS SELECT ename, job, deptno FROM emp WHERE deptno =2 WITH READ ONLY;

select * from read_only;

update read_only set ename='ahn' where job='assistant';
-- SQL 오류: ORA-42399: 읽기 전용 뷰에서는 DML 작업을 수행할 수 없습니다.

-- view 를 사용하는 이유 :
-- 1. 복잡한 쿼리를 여러번 수행할 필요가 없다.
-- 2. 개발자의 실수로 데이터 수정/삭제 방지
-- 3. 보안적 이슈(뷰 사용자는 뷰가 어떤 테이블들이 어떤 조건으로 형성되엇는지 알 수 없다.)

-- 뷰 조회
select * from user_views;

-- 뷰 삭제
drop view name_ary;

















