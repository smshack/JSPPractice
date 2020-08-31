-- 테이블 생성
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	phone varchar2(20)
);
-- 테이블 삭제
drop table member;
-- 테이블 검색
select * from tab;

-- 테이블 컬럼 정보 확인
desc member;

-- 레코드 추가
insert into member (id, pw, name, phone) values ('abc', '123', '홍길동', '010-1234-5678');

-- 커밋
commit;

-- 레코드 검색
select * from member;
select id, pw from member;

-- 레코드 수정
update member set name ='박용만' where name='용만';
-- 레코드 삭제
delete from member where name='홍길동';





-- 더미 데이터 생성
insert into member (id, pw, name, phone) values ('abc', '123', '홍길동', '010-1234-5678');
insert into member (id, pw, name, phone) values ('asd', '456', '서명석', '010-1234-4567');
insert into member (id, pw, name, phone) values ('sdf', '789', '임은주', '010-4568-7564');
insert into member (id, pw, name, phone) values ('dfg', '147', '장영인', '010-4532-5432');
insert into member (id, pw, name, phone) values ('xcv', '852', '호대현', '010-4876-4562');
insert into member (id, pw, name, phone) values ('bvc', '963', '호대진', '010-3654-4531');
insert into member (id, pw, name, phone) values ('dfas', '563', '김민주', '010-8654-5432');
insert into member (id, pw, name, phone) values ('dsfd', '864', '용만', '010-8543-5243');



-- 레코드 삭제
delete from member where name='홍길동';
commit;
select * from member;