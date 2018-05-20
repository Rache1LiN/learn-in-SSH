

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

INSERT INTO newscat VALUES (1, '国内', '国内', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (2, '国际', '国际', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (3, '军事', '军事', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (4, '体育', '体育', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (5, '娱乐', '娱乐', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (6, '社会', '社会', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (7, '财经', '财经', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (8, '科技', '科技', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (9, '健康', '健康', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:08','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (10, '汽车', '汽车', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (11, '教育', '教育', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (12, '房产', '房产', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (13, '家居', '家居', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (14, '旅游', '旅游', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (15, '文化', '文化', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (16, '探索', '探索', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (17, '另类', '另类', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (18, '其它', '其它', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (19, '类目19', '类目19', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (20, '类目20', '类目20', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (21, '国内21', '类目21', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (22, '国际22', '类目22', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (23, '类目23', '类目23', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (24, '类目24', '类目24', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (25, '类目25', '类目25', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (26, '类目26', '类目26', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (27, '类目27', '类目27', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (28, '类目28', '类目28', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (29, '类目29', '类目29', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (30, '类目30', '类目30', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (31, '国内31', '类目31', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (32, '国际32', '类目32', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (33, '类目33', '类目33', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (34, '类目34', '类目34', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (35, '类目35', '类目35', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (36, '类目36', '类目36', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (37, '类目37', '类目37', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (38, '类目38', '类目38', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO newscat VALUES (39, '类目39', '类目39', 0, '', '', 0, 0, 0, 0, to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'), to_date('2018-04-09 15:01:10','YYYY-MM-DD HH24:MI:SS'));
