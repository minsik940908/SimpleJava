-- 제약조건
--1) 테이블 생성시 함께 생성
-- PRIMARY KEY : NULL(X), 중복 허용 (X), 테이블에 오직 한개만 존재
CREATE TABLE pkTestName(
    firstCol NVARCHAR2(8) NOT NULL, -- null 허용 X
    secondCol NVARCHAR2(4),
    CONSTRAINT pk_code PRIMARY KEY (firstCol) --기본키 추가
);

CREATE TABLE pkTest(
    firstCol NVARCHAR2(8) PRIMARY KEY, -- PK 이름이 임의로 설정됨
    secondCol NVARCHAR2(4) NOT NULL
    
);

-- 2) 기존 테이블에 기본키 추가
--ALTER TABLE [table] ADD CONSTRINT [제약조건 이름] [type] (column);
ALTER TABLE emplyees ADD CONSTRAINT pk_emp_no PRIMARY KEY (emp_no);

/* 기본키 제약 조건 (PRIMARY KEY) NULL(X), 중복(X), 테이블에 오직 1개만 존재
PK 는 1개 이상의 컬럼으로 구성 가능(최대 16개)
pk에 1개 컬럼 이상이 사용되면 >> 복합키
*/

CREATE TABLE pkTwoTest(
    firstCol NVARCHAR2(8),
    secondCOl NVARCHAR2(4),
    thirdCol DATE,
    CONSTRAINT pk_two PRIMARY KEY(firstCol, secondCol) -- 기본키 추가 (2개 컬럼 조합)
);

/*
NOT NULL 의 경우는 컬럼 속성으로 취급 한다.
NOT NULL 은 일반적으로 테이블 생성시 함께 만든다.
*/
-- ALTER TABLE [table] MODIFY column datatype NOT NULL;
ALTER TABLE pktestname DROP CONSTRAINT pk_code;

-- 3) 제약조건 삭제
--ALTER TABLE teble DROP CONSTRAINT name;
ALTER TABLE pktestname DROP CONSTRAINT pk_code;
ALTER TABLE pktest DROP CONSTRAINT SYS_C007302;

--제약조건 확인
SELECT * FROM USER_CONSTRAINTS;


-- 4) 참조 제약 조건
-- FORIGN KEY(외래키, 참조키) >> 외부에서 가져온다.
-- 부모 테이블
CREATE TABLE parenttable(
    userID VARCHAR2(30),
    userName VARCHAR2(30),
    userPhone VARCHAR2(30),
    userAddr VARCHAR2(100),
    CONSTRAINT parent_pk PRIMARY KEY (userID)
);

-- 자식 테이블
-- CONSTRAINT fk_userID REFERENCES parenttable(userId)
CREATE TABLE childtable(
    orderID VARCHAR2(30) PRIMARY KEY,
    userID VARCHAR2(30), 
    produnctName VARCHAR2(30),
    price VARCHAR2(10),
    qty NUMBER(5)
);

-- 외래키 추가(기존 제약조건 추가 방식 + 참조할 테이블과 컬럼)
ALTER TABLE childtable ADD CONSTRAINT fk_userID FOREIGN KEY (userID) REFERENCES parenttable(userID);