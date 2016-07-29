drop table tbl_user;

create table tbl_user (
	user_no int not null auto_increment,
    user_id	varchar(50)	not null,
    user_pw varchar(200)	not null,
    user_name varchar(200) not null,
    reg_date timestamp not null default now(),
    update_date timestamp not null default now(),
    primary key(user_no)
);

insert into tbl_user(user_id, user_pw, user_name)
values ( 'raintype', 'test12', 'raintype');