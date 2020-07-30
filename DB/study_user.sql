-- student에 데이터 삽입
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (1,'박민식', 27, '010-1234-5678', '컴퓨터공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (2,'한준필', 25, '010-9101-1121', '생명공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (3,'정기동', 29, '010-3141-5161', '전자공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (4,'고자환', 21, '010-7181-9202', '소방전기과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (5,'길봉한', 20, '010-1222-3242', '컴퓨터공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (6,'최정혁', 23, '010-5262-7282', '기계공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (7,'한상혁', 26, '010-9303-1323', '물리학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (8,'이대영', 22, '010-3343-5363', '신소재공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (9,'최상민', 28, '010-7389-4041', '통계학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (10,'엄하선', 28, '010-4243-4445', '전자공학과');
insert into student(st_no, st_name, st_age, st_phone, st_dept) values (11,'남하란', 24, '010-4647-4849', '건축공학과');

insert into class(st_no, cls_name, cls_pro) values (1, '취업특강', '마민범');
insert into class(st_no, cls_name, cls_pro) values (2, '취업특강', '마밉범');
insert into class(st_no, cls_name, cls_pro) values (10,'취업특강', '마민범');
insert into class(st_no, cls_name, cls_pro) values (5, '창업특강', '이미광');
insert into class(st_no, cls_name, cls_pro) values (8, '창업특강', '이미광');
insert into class(st_no, cls_name, cls_pro) values (6, '창업특강', '이미광');
insert into class(st_no, cls_name, cls_pro) values (1, '논리회로', '임정영');
insert into class(st_no, cls_name, cls_pro) values (3, '논리회로', '임정영');
insert into class(st_no, cls_name, cls_pro) values (7, '논리회로', '임정영');
insert into class(st_no, cls_name, cls_pro) values (1, '통계수학', '강진형');
insert into class( st_no, cls_name, cls_pro) values (9, '통계수학', '강진형');
insert into class(st_no, cls_name, cls_pro) values (4, '전기', '박석윤');
insert into class(st_no, cls_name, cls_pro) values (11, '캐드', '윤백철');

commit;