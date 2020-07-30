create table student(
    st_no NUMBER(2),
    st_name NVARCHAR2(5),
    st_age NUMBER(2),
    st_phone VARCHAR2(13),
    st_dept NVARCHAR2(20)
);

create table class(
    st_no NUMBER(2),
    cls_name NVARCHAR2(20),
    cls_pro NVARCHAR2(10)
);

drop table class;
alter table student add constraint pk_st_no PRIMARY key(st_no);
alter table class add constraint pk_cls_no primary key(cls_no);
alter table class add constraint fk_st_no foreign key (st_no) references student(st_no);