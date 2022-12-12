create table userChat(
    username varchar2(15) primary key,
    password varchar2(30),
    LastName varchar2(15),
    FirstName varchar2(15)
);
create table conversations(
    message varchar(400),
    Sender varchar2(15),
    Receiver varchar2(15),
    constraint Sender_user foreign key(Sender) references userChat(username),
    constraint Receiver_user foreign key(Receiver) references userChat(username)
);
create table contact(
    owner varchar(15),
    Contact varchar(15),
    constraint pk1_user foreign key(owner) references userChat(username),
    constraint pk2_user foreign key(Contact) references userChat(username)
);
alter table conversations add time_con date default sysdate;
