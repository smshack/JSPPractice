-- ���̺� ����
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	phone varchar2(20)
);
-- ���̺� ����
drop table member;
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

-- ���ڵ� ����
update member set name ='�ڿ븸' where name='�븸';
-- ���ڵ� ����
delete from member where name='ȫ�浿';





-- ���� ������ ����
insert into member (id, pw, name, phone) values ('abc', '123', 'ȫ�浿', '010-1234-5678');
insert into member (id, pw, name, phone) values ('asd', '456', '����', '010-1234-4567');
insert into member (id, pw, name, phone) values ('sdf', '789', '������', '010-4568-7564');
insert into member (id, pw, name, phone) values ('dfg', '147', '�念��', '010-4532-5432');
insert into member (id, pw, name, phone) values ('xcv', '852', 'ȣ����', '010-4876-4562');
insert into member (id, pw, name, phone) values ('bvc', '963', 'ȣ����', '010-3654-4531');
insert into member (id, pw, name, phone) values ('dfas', '563', '�����', '010-8654-5432');
insert into member (id, pw, name, phone) values ('dsfd', '864', '�븸', '010-8543-5243');



-- ���ڵ� ����
delete from member where name='ȫ�浿';
commit;
select * from member;