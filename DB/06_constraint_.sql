-- 제약조건(특정한 속성을 지정해 주는 것)
-- 테이블에 종속, 추가/삭제만 가능

-- 1. 테이블 생성시 함께 생성
-- 쉬운
CREATE TABLE pkTestName(
    firstCol nchar(8) NOT NULL, --NOT NULL : NULL 이 들어가면 에러
    secondCol NVARCHAR2(20) PRIMARY KEY --기본키
);
-- 어려운
CREATE TABLE pkname(
    firstCol nchar(8),
    secondCol NVARCHAR2(4),
    CONSTRAINT pk_code PRIMARY KEY(firstCol) -- PK에 이름을 줄 수 있다.
);

-- 테이블을 만든 후에 제약조건 추가
CREATE TABLE employees(
    emp_no NUMBER,
    emp_name NVARCHAR2(10),
    emp_salary NUMBER(10)
);
-- 테이블에 추가
ALTER TABLE employees ADD CONSTRAINT pk_emp_no PRIMARY KEY(emp_no);

SELECT * FROM USER_CONSTRAINTS;

ALTER TABLE pktestname DROP CONSTRAINT SYS_C007310;

-- 기본키 제약 조건(PRIMARY KEY)
-- 테이블 당 한개만 존재
-- Unique + NOT NULL 형태
-- 여러개의 컬럼으로도 구성 가능(최대 16개 까지)
CREATE TABLE pkTwoTest(
    firstCol NUMBER,
    secondCol VARCHAR2(10),
    thirdCol DATE,
    CONSTRAINT pk_two PRIMARY KEY(firstCol, secondCol) -- 복합키(두개의 컬럼이 합쳐져서 하나의 키를 생성)
);



