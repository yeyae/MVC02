������� ���� ���α׷�

EMPLOYEE ���̺�
id varchar2(10) not null -- id (���� �� ��, �� �ƴ�)
pass varchar2(10) not null -- ��й�ȣ
name varchar2(24) -- ��� �̸�
lev char(1) default 'A' -- ��� ���
enter DATE -- �Ի� ��¥
gender char(1) default '1'  --1 �̸� ����, 2�� ����
phone varchar2(30) -- ��ȭ��ȣ
primary key (id)

CREATE TABLE EMPLOYEES (
	id varchar2(10) not null primary key,
	pass varchar2(10) not null,
	name varchar2(24),
	lev char(1) default 'A',
	enter date,
	gender char(1) default '1',
	phone varchar2(30)
);