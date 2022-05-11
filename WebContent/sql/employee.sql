사원정보 관리 프로그램

EMPLOYEE 테이블
id varchar2(10) not null -- id (고유 한 값, 널 아님)
pass varchar2(10) not null -- 비밀번호
name varchar2(24) -- 사원 이름
lev char(1) default 'A' -- 사원 등급
enter DATE -- 입사 날짜
gender char(1) default '1'  --1 이면 남자, 2면 여자
phone varchar2(30) -- 전화번호
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