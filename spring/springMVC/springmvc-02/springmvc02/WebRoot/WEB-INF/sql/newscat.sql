

CREATE TABLE newscat (
CatId number(18) primary key,
CatName varchar2(20) unique NOT NULL,
CatDesc varchar2(32),
ParentId number(18) NOT NULL,
Status varchar2(20),
Remark varchar2(200),
SortNum number(18) DEFAULT 0,
IsDeleted number(18) DEFAULT 0,
CreateBy number(18) DEFAULT 0,
UpdateBy number(18) DEFAULT 0,
CreateOn date DEFAULT sysdate,
 UpdateOn date DEFAULT sysdate
)

INSERT INTO newscat VALUES (1, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (2, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (3, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (4, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (5, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (6, '���', '���', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (7, '�ƾ�', '�ƾ�', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (8, '�Ƽ�', '�Ƽ�', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (9, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (10, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (11, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (12, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (13, '�Ҿ�', '�Ҿ�', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (14, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (15, '�Ļ�', '�Ļ�', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (16, '̽��', '̽��', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (17, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (18, '����', '����', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (19, '��Ŀ19', '��Ŀ19', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (20, '��Ŀ20', '��Ŀ20', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (21, '����21', '��Ŀ21', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (22, '����22', '��Ŀ22', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (23, '��Ŀ23', '��Ŀ23', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (24, '��Ŀ24', '��Ŀ24', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (25, '��Ŀ25', '��Ŀ25', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (26, '��Ŀ26', '��Ŀ26', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (27, '��Ŀ27', '��Ŀ27', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (28, '��Ŀ28', '��Ŀ28', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (29, '��Ŀ29', '��Ŀ29', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (30, '��Ŀ30', '��Ŀ30', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (31, '����31', '��Ŀ31', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (32, '����32', '��Ŀ32', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (33, '��Ŀ33', '��Ŀ33', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (34, '��Ŀ34', '��Ŀ34', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (35, '��Ŀ35', '��Ŀ35', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (36, '��Ŀ36', '��Ŀ36', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (37, '��Ŀ37', '��Ŀ37', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (38, '��Ŀ38', '��Ŀ38', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (39, '��Ŀ39', '��Ŀ39', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
