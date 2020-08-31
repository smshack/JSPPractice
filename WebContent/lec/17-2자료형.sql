-- 테이블 생성
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	phone varchar2(20)
);

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

