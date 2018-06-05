create table member(
member_id number primary key,
member_name varchar2(20) not null,
member_pass varchar2(30) not null,
real_name varchar2(20) not null,
member_email varchar2(50),
member_address varchar2(100),
member_phone varchar2(20),
member_status int default 1,
member_code varchar2(20)
);
create sequence seq_member_id;

create table top_category(
top_id int primary key,
top_name varchar2(20) not null
);

create table sub_category(
sub_id int primary key,
sub_name varchar2(20) not null,
top_id int not null references top_category(top_id)
);

create table goods(
goods_id number primary key,
goods_name varchar2(20) not null,
goods_price numeric(18,2) not null,
market_price numeric(18,2) not null,
goods_description varchar2(200) not null,
goods_picture varchar2(255) not null,
sub_id int not null references sub_category(sub_id)
);

create sequence seq_goods_id;

create table tbl_order(
order_id number primary key,
order_date date default sysdate,
order_total numeric(18,2) not null,
order_status int default 0,
order_address varchar2(200) not null,
order_phone varchar2(20) not null,
order_reciever varchar2(10) not null,
member_id number not null references member(member_id)
);

create sequence seq_order_id;

create table order_detail(
detail_id number primary key,
goods_id number not null references goods(goods_id),
order_id number not null references tbl_order(order_id),
detail_amount int not null,
detail_price numeric(18,2) not null，
is_settled int not null
);

create sequence seq_detail_id;

create table users(
user_name varchar2(20) not null,
user_pass varchar2(30) not null
);



