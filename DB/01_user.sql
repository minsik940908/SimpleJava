-- 유저 생성 하기(12g 이상 부터는 공통 유저 생성시 C##을 계정명 앞에 붙인다.)
CREATE USER C##web_user IDENTIFIED BY pass;
CREATE USER C##dba_user IDENTIFIED BY pass;
CREATE USER C##USER02 IDENTIFIED BY pass3;
CREATE USER C##study_user IDENTIFIED BY pass;

-- 생성된 유저 확인
SELECT * FROM DBA_USERS;

-- 비밀번호 수정
-- ALTER USER C##[유저이름] IDENTIFIED BY [변경할 패스워드];
ALTER USER C##USER02 IDENTIFIED BY pass;

--사용자 삭제
--DROP USER C##[유저이름];
DROP USER C##USER02;

--권한 부여
-- GRANT [권한] TO [대상유저]
GRANT CONNECT,RESOURCE,DBA TO C##web_user;
GRANT CONNECT,DBA TO C##dba_user;
grant create view to C##web_user;

GRANT CONNECT,RESOURCE,DBA TO C##study_user;
--권한 회수
-- REVOKE [권한] FROM [대상유저]
REVOKE DBA FROM C##web_user;

-- 권한 확인
SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTEE='C##WEB_USER';
SELECT * FROM DBA_ROLE_PRIVS WHERE GRANTEE='C##study_user';
