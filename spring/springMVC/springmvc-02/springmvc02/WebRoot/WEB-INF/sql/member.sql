create table member(
UserId number(18) primary key,
UserName varchar2(20) unique NOT NULL,
UserPass varchar2(32) NOT NULL,
NickName varchar2(20) unique NOT NULL,
Email varchar2(32) unique NOT NULL,
Mobile varchar2(20),
MyId varchar2(50),
MyIdKey varchar2(50),
RegIp varchar2(50),
RegDate date DEFAULT sysdate,
LastLoginIp varchar2(50),
LastLoginTime date,
Salt varchar2(6) DEFAULT 'Liuvei',
Secques varchar2(8),
Status varchar2(20),
Remark varchar2(200),
SortNum number(18),
IsDeleted number(18),
CreateBy number(18),
UpdateBy number(18),
CreateOn date DEFAULT sysdate,
UpdateOn date DEFAULT sysdate
)

INSERT INTO member VALUES (1, 'admin', '123', '超管', 'admin@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei', '', '', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (2, 'user', '123', '用户', 'user@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei', '', '', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (3, 'guest', '123', '游客', 'guest@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei', '', '', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (4, 't1', '123', '刘明', 't1@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null,'Liuvei', '', 'Teacher', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (5, 't2', '123', '李玉', 't2@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null,'Liuvei', '', 'Teacher', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (6, 't3', '123', '周生', 't3@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null,'Liuvei', '', 'Teacher', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (7, 'stu1', '123', '张三', 'stu1@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei','', 'Student', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (8, 'stu2', '123', '李四', 'stu2@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei','', 'Student', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO member VALUES (9, 'stu3', '123', '王五', 'stu3@liuvei.com', '', '', '', '',to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),'0',null, 'Liuvei','', 'Student', '', 0, 0, 0, 0,to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'),to_date('2018-04-09 15:00:57','YYYY-MM-DD HH24:MI:SS'));
