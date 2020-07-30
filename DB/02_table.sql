-- 1.테이블 생성
/*
--CREATE TABLE [테이블 이름](
--[컬럼 명] [데이터 타입] [사이즈],
-- ...
--[컬럼 명] [데이터 타입] [사이즈] -  마지막 문장에는 ,가 있으면 안된다.
);
*/

/*
데이터 타입 종류 
1) 문자타입(검색속도는 문자 타입이 가장 빠르다.)
- 고정형
CHAR(바이트 수)
NCHAR(글자 수)<- 글자당 3Byte

-가변형
VARCHAR2(바이트)
NVARCHAR2(글자수)<- 글자당 3byte

2) 숫자타입(my,maria sql에서는 살짝 다르다)
NUMBER(전체 자릿수, 소숫점자리수)
NUMBER(자릿수)
NUMBER <- 오라클이 알아서 해줌

3)날짜타입
Date <- 7Byte (yyyy-mm-dd hh:mm:ss)
TIMESTAMP <- DATE TYPE과 같지만 10억분의 1초까지 저장
*/

CREATE TABLE testtable(
    username NVARCHAR2(25),
    age NUMBER(3,0),
    mobile VARCHAR(15),
    reg_date DATE DEFAULT SYSDATE
);

--테이블 구조 확인
DESC testtable;

--테이블 리스트 확인
SELECT * FROM USER_TABLES;

/*
테이블을 아래와 같이 만들어 보자
테이블 명 : emplyees
emp_no : 숫자형 3자리
first_name 문자열 8자
last_name 문자열 2자
email 문자열 50자
mobile 문자열 11자
salary 숫자형  8자
reg_date 날짜 기본으로 SYSDATE 된다.
*/

CREATE TABLE emplyees(
    emp_no NUMBER(3),
    first_name NVARCHAR2(8),
    last_name NVARCHAR2(2),
    email VARCHAR2(50),
    mobile VARCHAR2(11),
    salary NUMBER(8),
    reg_date DATE DEFAULT SYSDATE
);

DESC emplyees;

-- 테이블 삭제
DROP TABLE testtable;


-- 테이블 수정
-- ALTER TABLE [테이블 명] 

-- 1) 컬럼 이름(기존 데이터가 삭제 된다.)
-- ALTER TABLE [테이블 명] RENAME COLUMN [변경전 이름] TO [변경 후 이름]
ALTER TABLE emplyees RENAME COLUMN last_name TO family_name;
DESC emplyees;

-- 2) 컬럼 추가
-- ALTER TABLE [테이블 명] ADD ([컬럼명]  [데이터 타입]);
ALTER TABLE emplyees ADD (depart_no VARCHAR2(10));
ALTER TABLE emplyees ADD (commission VARCHAR2(10));
ALTER TABLE emplyees ADD (etc VARCHAR2(100));
DESC emplyees;

-- 3) 컬럼 속성
-- ALTER TABLE [테이블 명] MODIFY ([컬럼 명] [데이터 타입]);
-- 속성 변경시 해당 컬럼이 비어있어야 한다.
ALTER TABLE emplyees MODIFY (commission NUMBER(3,0));
DESC emplyees;

-- 4) 컬럼 삭제
-- -- ALTER TABLE [테이블 명] DROP COLUMN [컬럼 명];
ALTER TABLE emplyees DROP COLUMN etc;
DESC emplyees;





