CREATE TABLE member(
    id VARCHAR2(50),
    pw VARCHAR2(100),
    name VARCHAR2(50),
    age NUMBER(4),
    gender CHAR(4),
    email VARCHAR2(100)
);

-- Connection : sql devleoper 실행하고 사용 하는 사람
-- PreparedStatement
Select * from member;
-- executeUpdate : ctrl+enter -> 반환값 숫자
-- executeQuery : ctrl+enter -> 테이블

-- ResultSet : 쿼리 실행 결과

--테이블 생성
create table bbs(
    idx number(6,0) primary key,
    user_name nvarchar2(25) not null,
    subject nvarchar2(50) not null,
    content nvarchar2(200) not null,
    bhit number(4) default 0,
    reg_date date default sysdate
);

--시퀀스 추가
create sequence bbs_seq;

--데이터 입력
insert into bbs (idx, user_name, subject, content, bhit) values(bbs_seq.NEXTVAL, 'tester21', '테스트 제목20', '테스트 메시지 내용20', 0);
commit;

select * from bbs;

select idx,user_name,subject, bhit, reg_date from bbs;

update bbs set bhit=bhit+1 where idx=1;
commit;

create table photo(
    fileidx NUMBER(6,0) PRIMARY KEY,
    idx NUMBER(6,0) NOT NULL,
    oriFileName VARCHAR2(50),
    newFileName VARCHAR2(400),
    CONSTRAINT fk_photo_idx FOREIGN KEY (idx) REFERENCES bbs(idx) ON DELETE CASCADE
);


create SEQUENCE photo_seq;

select * from photo;

select b.idx, b.subject, b.user_name, b.content, p.oriFileName, p.newFileName from bbs b , photo p where b.idx = p.idx(+) and b.idx=41;