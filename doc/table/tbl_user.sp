drop table tbl_user;

create table tbl_user (
	userno int not null auto_increment,
    userid	varchar(50)	not null,
    userpw varchar(200)	not null,
    username varchar(200) not null,
    regdate timestamp not null default now(),
    updatedate timestamp not null default now(),
    primary key(userno)
);

insert into tbl_user(userid, userpw, username)
values ( 'raintype', 'test12', 'raintype');
