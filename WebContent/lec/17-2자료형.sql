-- ���̺� ����
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	phone varchar2(20)
);

-- ���̺� �˻�
select * from tab;

-- ���̺� �÷� ���� Ȯ��
desc member;

-- ���ڵ� �߰�
insert into member (id, pw, name, phone) values ('abc', '123', 'ȫ�浿', '010-1234-5678');

-- Ŀ��
commit;

-- ���ڵ� �˻�
select * from member;
select id, pw from member;

