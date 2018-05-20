create table petinfo(
pet_id number primary key,
pet_name varchar2(50) not null,
pet_sex char(1) not null,
pet_strength int not null,
pet_cute int not null,
pet_love int not null,
pet_intro varchar2(500),
pet_owner_name varchar2(50) not null,
pet_owner_email varchar2(100),
pet_pass varchar2(30) not null,
pet_pic varchar(300) not null,
pet_type char(1) not null
);

create sequence seq_pet_id;
