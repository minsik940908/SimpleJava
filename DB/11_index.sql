-- CREATE [INDEX 종류] [인덱스 이름]  ON 적용 테이블(적용 컬럼);


-- 1) bitmap index
/*
각 컬럼에 대해서 적은 종류의 독특한 값이 있을 경우(ex : 남|여, 1|0, true/false)
데이터가 어디있는지 bit로 표시해준다. 컬럼이 추가되면 다시 만든다.
데이터가 매우 많지만 수정/변경이 잘 일어나지 않는 곳에 적합하다.
standard edition 버전에서만 가능
*/
CREATE BITMAP INDEX emp_idx_deptno ON emp(deptno);

-- 2) Unique index
-- 중복되지 않는 데이터를 인덱스로 지정
-- PK 나 UNIQUE 설정시 자동으로 생성되는 인덱스
CREATE UNIQUE INDEX emp_ename_idx ON emp(deptno);
-- ORA-01452: 중복 키가 있습니다. 유일한 인덱스를 작성할 수 없습니다

-- 3) non-unique index
-- 중복된 데이터를 인덱스로 지정
-- UNIQUE 만 빼주면 된다.
CREATE INDEX emp_ename_idx ON emp(ename);
-- 4) combin index
-- 결합 인덱스는 1개 이상의 컬럼을 조합해서 만들 수 있다.(16개 까지)
-- 이 경우도 허용하고 싶다면 UNIQUE 를 빼면 된다.
CREATE UNIQUE INDEX emp_combi_idx ON emp(ename, job);

-- 인덱스 확인
select * from user_indexes;

-- 인덱스 삭제
drop index emp_ename_idx;
drop index emp_combi_idx;

-- create나 drop로 변경하는건 rollback이 안된다.















