CREATE TABLE parentTable(
    userID VARCHAR2(20),
    userName VARCHAR2(20),
    userPhone VARCHAR2(20),
    userAddr VARCHAR2(100),
    CONSTRAINT pk_userId primary key (userID)
);


-- 1. 참조 제약 조건 FOREIGN KEY(  남의 기본키를 가져다가 사용)
-- 1) 테이블 생성시 만들기 
CREATE TABLE childTable(
    orderID number,
    userID VARCHAR2(20), -- 외래키로 쓸 예정
    productName VARCHAR2(20),
    price NUMBER,
    qty NUMBER
   --  CONSTRAINT fk_userId FOREIGN KEY (userID) REFERENCES parentTable(userID)
);
-- 2) 테이블 생성 후 만들기
-- ALTER TABLE [대상 테이블 이름] ADD CONSTRAINT [제약조건 이름] ([적용할 컬럼]) REFERENCES [참조 테이블] ([참조 컬럼]);
ALTER TABLE childTable ADD CONSTRAINT fk_userId FOREIGN KEY(userID) REFERENCES parentTable(userID);

-- 특정 테이블에 설정된 제약조건 확인
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME='CHILDTABLE' OR TABLE_NAME='PARENTTABLE';

-- 부모의 PK를 자식의 PK로 사용한 경우 : 식별관계(실선)
-- 부모의 PK를 자식이 FK로 사용한 경우 : 비식별관계(점선)

-- 부모 테이블
CREATE TABLE supplier(
    supplier_id NUMBER(10) NOT NULL,
    supplier_name VARCHAR2(50) NOT NULL,
    phone VARCHAR2(13),
    CONSTRAINT pk_supplier_id PRIMARY KEY (supplier_id)
);

-- 자식 테이블
CREATE TABLE products(
    product_id NUMBER(10),
    supplier_id NUMBER(10) NOT NULL, -- FK가 될 예정
    productPrice NUMBER(10),
    CONSTRAINT fk_supplier_id FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id)
    ON DELETE CASCADE -- 참조 무결성 제약 조건 
);

INSERT INTO supplier(supplier_id, supplier_name, phone) 
    VALUES(1, '김철수', '010-1234-1234');
INSERT INTO supplier(supplier_id, supplier_name, phone) 
    VALUES(2, '홍길동', '010-5678-0078');
INSERT INTO supplier(supplier_id, supplier_name, phone) 
    VALUES(3, '박영수', '010-3233-3234');
    
INSERT INTO products(product_id, supplier_id, productPrice)
    VALUES(1111, 1, 6000);
INSERT INTO products(product_id, supplier_id, productPrice)
    VALUES(1112, 2, 7000);
INSERT INTO products(product_id, supplier_id, productPrice)
    VALUES(1113, 3, 8000);



-- 기타 제약 조건
-- 무결성 == 논리적으로 말이 맞는것 
--1) 연계 참조 무결성 제약 조건(중요)
-- 자식 데이터가  있는 상태에서 부모 데이터가 지워지지 않는다.
-- 부모 데이터를 지우면 연관된 자식 데이터도 함께 지워 진다.
DELETE FROM supplier WHERE supplier_id = 1;

select * from supplier;
select * from products;

--ORA-02449 : 외래 키에 의해 참조되는 고유/기본 키가 테이블에 있습니다
drop table supplier; -- 부모 테이블 삭제
-- 정 지우고 싶다면...
-- 1) 자식 테이블을 먼저 지우고 부모 테이블을 지운다.
-- 2) CASCADE 속성을 이용해 삭제
DROP TABLE supplier CASCADE CONSTRAINTS;

--2) 유니크 제약 조건
-- 중복을 허용하지 않는다.
-- unique + not null = primary key
-- unique는 생성 제한 갯수가 없다(테이블 당 무제한)
ALTER TABLE childTable ADD CONSTRAINT uq_productname UNIQUE(productname);

--3) 체크 제약 조건
-- 조건에 맞지 않으면 아예 DB에 받지 않는다.
-- 쓸데 없는 오류 발생 여지가 있어서 잘 사용 하지 않음
-- 예외로 사용하는 체크 제약 조건 : NOT NULL
-- check 제약 조건은 체크할 조건이 들어간다.
-- check 은 어떤 조건인지 알기 위해서 테이블을 열어 해당 조건을 찾아봐야 한다.
-- 차라리 프로그래밍 단에서 처리하는것이 유지보수상 좋다.
ALTER TABLE products ADD CONSTRAINT chk_productPrice CHECK(productPrice BETWEEN 5000 AND 10000);
INSERT INTO products(product_id, supplier_id, productPrice)
    VALUES(1114, 2, 9000);
INSERT INTO products(product_id, supplier_id, productPrice)
    VALUES(1115, 3, 18000);









