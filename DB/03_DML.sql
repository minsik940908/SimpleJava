-- 1.데이터 삽입
-- INSERT INTO [테이블] ([컬럼 명, ...]) VALUES ([해당값, ...]);
-- 테이블 생성시 ORA-01950 이 나타날 경우
-- GRANT UNLIMITED TABLESPACE TO [유저이름];
INSERT INTO emplyees(
    emp_no, first_name, family_name, email, mobile, salary, depart_no, commission
) VALUES(
    111, '민식', '박', 'alstlr448@naver.com', '01092776842', 99999999, 'dev_01', 90
);

--항목과 값의 개수가 일치 하지 않으면 에러 발생
INSERT INTO emplyees(
    emp_no, first_name, family_name, email, mobile, salary
) VALUES(
    112, '지훈', '김', 'daum@naver.com', '01012345678', 99999999
);

INSERT INTO emplyees(
    emp_no,  family_name, email, mobile, salary
) VALUES(
    113, '상훈',  'daum@naver.com', '01012345678', 99999999
);

SELECT * FROM emplyees;

-- 2. 데이터 수정
-- UPDATE [테이블] SET [컬럼] = [값] WHERE [조건];
UPDATE emplyees SET depart_no = 'dev_02' WHERE depart_no IS NULL;
UPDATE emplyees SET salary = 5000000 WHERE depart_no = 'dev_001';

-- commission 이 null 인 값을 50으로 변경
UPDATE emplyees SET commission = 50 WHERE commission IS NULL;

SELECT * FROM emplyees;

-- 3. 데이터 삭제
-- DELETE FROM [테이블 명] WHERE [조건];
DELETE FROM emplyees WHERE first_name IS NULL;

SELECT * FROM emplyees;

--MERGE 테스트를 위해 데이터 추가

INSERT INTO emplyees(emp_no, first_name, family_name, email, mobile, salary, depart_no)
    VALUES (113, '길동', '김', 'emai@naver.com', '01022223333', 5000000, 'dev_001');

INSERT INTO emplyees(emp_no, first_name, family_name, email, mobile, salary, depart_no)
    VALUES(114, '길동', '고', 'email@naver.com', '01022223333', 5000000, 'dev_002');
    
INSERT INTO emplyees(emp_no, first_name, family_name, email, mobile, salary, depart_no)
    VALUES (115, '길동', '나', 'emai@naver.com', '01022223333', 5000000, 'dev_002');

INSERT INTO emplyees(emp_no, first_name, family_name, email, mobile, salary, depart_no)
    VALUES (116, '길동', '라', 'emai@naver.com', '01022223333', 5000000, 'dev_002');

INSERT INTO emplyees(emp_no, first_name, family_name, email, mobile, salary, depart_no)
    VALUES (117, '길동', '마', 'emai@naver.com', '01022223333', 5000000, 'dev_002');

SELECT * FROM emplyees;

/*
MERGE INTO ([테이블명] USING ([서브쿼리]) ON [조건])
    WHEN MACHED THEN
        UPDATE SET [column] = [value], ...
        DELETE WHERE ([조건])
    WHEN NOT MATCHED THEN
        INSERT ([column, ...]) VALUES([values, ...])
*/

-- 하나의 테이블만 사용

/*
depart_no = 'dev_001' 인 데이터가 있으면 commission을 10으로 변경
UPDATE emplyees SET commissioon = 10 WHERE depart_no = 'dev_001';
이렇게 수정만 하는 구문에는 경쟁력이 없다
*/

-- DUAL : oracle에서 제공해주는 더미테이블
MERGE INTO emplyees USING DUAL ON (depart_no = 'dev_001')
    WHEN MATCHED THEN UPDATE SET commission = 10;
    
/*
depart_no = 'dev_03' 인 데이터가 있으면 commission을 20으로 변경
없으면 데이터를 넣는다.
*/

MERGE INTO emplyees USING DUAL ON (depart_no = 'dev_03')
    WHEN MATCHED THEN 
            UPDATE SET commission = 20
    WHEN NOT MATCHED THEN
            INSERT(emp_no, first_name, family_name, email, mobile, salary, depart_no, commission)
            VALUES(118, '길동', '박', 'eamil@naver.com', '01011112222', 40000000, 'dev_03', 5);
            
/*
depart_no = 'dev_002' 인 데이터가 있으면 commission을 10으로 변경
그리고 emp_no가 117인 데이터는 삭제
*/

MERGE INTO emplyees USING DUAL ON (depart_no = 'dev_002')
    WHEN MATCHED THEN
        UPDATE SET commission = 10
        DELETE WHERE (emp_no = 117);


SELECT * FROM emplyees;







