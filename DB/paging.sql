-- 5개씩 나누고 싶지만 기준이 없다.
select idx, user_name, subject, bhit from bbs;

-- 각 행을 세어주는 가상의 컬럼(rownum)을 추가(오라클의 방법)
select rownum as rnum, idx, user_name, subject, bhit from bbs order by idx desc;

-- 그런게 rownum 사용시 idx의 내림차순과 맞지 않게 된다.
-- 그래서 rownum을 정렬해 주는 row_number() over() 를 사용 한다.
select row_number() over(order by idx desc) as rnum,idx,user_name,subject,bhit from bbs;

-- rnum을 기준으로 1~5까지 가져 온다.
-- 그런데 rnum 은 가상컬럼 이기 때문에 조건문으로 사용 할 수가 없다.
select row_number() over(order by idx desc) as rnum,idx,user_name,subject,bhit from bbs where rnum between 1 and 5;

-- 서브쿼리를 활용하여 해결 한다.
select  rnum,idx,user_name,subject,bhit,reg_date from (select row_number() over(order by idx desc) as rnum,idx,user_name,subject,bhit,reg_date from bbs) where rnum between 1 and 5;


select count(idx) from bbs;