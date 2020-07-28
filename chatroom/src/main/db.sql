create database chatroom;

use chatroom;

-- 创建用户表


drop table if exists user;
create table user (
    userId int primary key auto_increment,-- 用户id
    name varchar(50) unique,-- 用户名
    password varchar(50),-- 用户密码
    nickName varchar(50),-- 昵称(聊天时显示的名字)
    lastLogout datetime-- lastLogout 表示上次退出的时间. 用来实现历史记录功能.
)ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 创建频道表
drop table if exists channel;
create table channel (
    channelId int primary key auto_increment,
    channelName varchar(50)
);

-- 创建消息表
drop table if exists message;
create table message (
    messageId int primary key auto_increment,
    userId int, -- 谁发送的消息.
    channelId int,  -- 频道id
    content text,  -- 消息正文
    sendTime datetime -- 消息的发送时间.
);