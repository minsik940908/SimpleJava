-- sequence
-- UNIQUE 한 값을 생성해주는 오라클 객체
-- 순차적으로 증가하는 컬럼을 자동으로 생성한다.
-- 보통 pk 값으로 많이 활용 된다.
-- 메모리에 cache 되었을때 액세스 효율이 증가 한다.


-- 1) 시퀀스 생성
CREATE SEQUENCE seq_no; --기본적인 시퀀스 생성 방법
-- CREATE SEQUENCE [sequence name] [Start WHITH n] [INCREMENT BY N]
-- [MAXVALUE n | NOMAXVALUE] [MINVALUE N | NOMINVALUE]
-- [CYCLE | NOCYCLE] [CACHE n | NOCACHE]

-- 8000 부터 시작하고 1씩 증가, 다음번호 20개 까지는 저장해 놓고 있는다.
CREATE SEQUENCE seq_no START WITH 8000 INCREMENT BY 1 CACHE 20;

SELECT seq_no.NEXTVAL FROM DUAL; -- DUAL 은 가상 테이블 , 증가
SELECT seq_no.CURRVAL FROM DUAL; -- DUAL 은 가상 테이블 , 현재

-- 10 까지만 증가 한다.(이대로 쓰면 10 이상 증가시 에러 발생)
CREATE SEQUENCE seq_test_max MAXVALUE 10;

select seq_test_max.NEXTVAL FROM DUAL;
-- ORA-08004: 시퀀스 SEQ_TEST_MAX.NEXTVAL exceeds MAXVALUE은 사례로 될 수 없습니다
select seq_tset_max.CURRVAL FROM DUAL;
-- 시퀀스 삭제
drop sequence seq_test_max;

CREATE SEQUENCE seq_test_max MAXVALUE 10 CYCLE CACHE 5;
select seq_test_max.NEXTVAL FROM DUAL;

-- MIN VALUE :  5부터 시작, 10까지 증가 후에 5로 다시 돌아온다.
CREATE SEQUENCE seq_test_min START WITH 5 MINVALUE 5 MAXVALUE 10 CYCLE CACHE 5;

select seq_test_min.nextval from dual;

-- 시퀀스 활용 방법
select * from employees;

insert into employees (emp_no, emp_name, emp_salary) values(seq_no.nextval, '김지훈', 1000);







