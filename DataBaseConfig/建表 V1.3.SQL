/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/11/22 16:20:12                          */
/* Created by:     rgzhang		                     */
/*==============================================================*/


drop table if exists Apply;

drop table if exists BBSInfo;

drop table if exists BBSTalk;

drop table if exists CheckOutPoint;

drop table if exists CheckPoint;

drop table if exists FreedomMode;

drop table if exists Guardian;

drop table if exists Student;

/*==============================================================*/
/* Table: Apply                                                 */
/*==============================================================*/
create table Apply
(
   guardianID           int not null,
   studentID            int not null,
   applyDate            datetime,
   applySubmit          bool,
   primary key (guardianID, studentID)
);

/*==============================================================*/
/* Table: BBSInfo                                               */
/*==============================================================*/
create table BBSInfo
(
   bbsID                int not null,
   studentID            int not null,
   postDate             datetime,
   theme                varchar(50),
   primary key (bbsID)
);

/*==============================================================*/
/* Table: BBSTalk                                               */
/*==============================================================*/
create table BBSTalk
(
   talkID               int not null,
   studentID            int not null,
   bbsID                int not null,
   talkTo               int,
   likeCount            int,
   BBSTalkMessage       varchar(200),
   primary key (talkID)
);

/*==============================================================*/
/* Table: CheckOutPoint                                         */
/*==============================================================*/
create table CheckOutPoint
(
   checkOutPointID      int not null,
   studentID            int not null,
   toalTime             time,
   program              varchar(500),
   primary key (checkOutPointID)
);

/*==============================================================*/
/* Table: CheckPoint                                            */
/*==============================================================*/
create table CheckPoint
(
   checkPointID         int not null,
   checkPointName       varchar(20),
   checkPointLevel      int,
   checkPointCate       int,
   primary key (checkPointID)
);

/*==============================================================*/
/* Table: FreedomMode                                           */
/*==============================================================*/
create table FreedomMode
(
   freeModeID           int not null,
   program              varchar(500),
   source               varchar(40),
   primary key (freeModeID)
);

/*==============================================================*/
/* Table: Guardian                                              */
/*==============================================================*/
create table Guardian
(
   guardianID           int not null,
   guardianName         varchar(30),
   guardianPassword     varchar(30),
   guardianEmail        varchar(30),
   primary key (guardianID)
);

/*==============================================================*/
/* Table: Student                                               */
/*==============================================================*/
create table Student
(
   studentID            int not null,
   studentName          varchar(30),
   studentPassword      varchar(30),
   studentGender        varchar(1),
   studentAccount      varchar(30) unique,
   primary key (studentID)
);



alter table Apply add constraint  foreign key (guardianID)
      references Guardian (guardianID) on delete restrict on update restrict;

alter table Apply add constraint  foreign key (studentID)
      references Student (studentID) on delete restrict on update restrict;

alter table BBSInfo add constraint  foreign key (studentID)
      references Student (studentID) on delete restrict on update restrict;

alter table BBSTalk add constraint  foreign key (bbsID)
      references BBSInfo (bbsID) on delete restrict on update restrict;

alter table BBSTalk add constraint foreign key (studentID)
      references Student (studentID) on delete restrict on update restrict;
      
alter table CheckOutPoint add constraint foreign key (studentID)
      references Student (studentID) on delete restrict on update restrict;

SET FOREIGN_KEY_CHECKS=0;

ALTER TABLE `code`.`student`
CHANGE COLUMN `studentID` `studentID` INT(11) NOT NULL AUTO_INCREMENT ;

/*==============================================================*/
/* 2019.3.10  rgzhang增加：关卡的描述信息                         */
/*==============================================================*/
ALTER TABLE `code`.`checkpoint` 
ADD COLUMN `checkpointMessage` VARCHAR(300) NULL DEFAULT NULL AFTER `checkPointCate`;

/*==============================================================*/
/* 2019.4.5  rgzhang增加：一些缺失的时间信息，和一些已有的时间信息修正                         */
/*==============================================================*/
ALTER TABLE `code`.`bbstalk` 
ADD COLUMN `bbstalkTime` INT NULL DEFAULT NULL AFTER `BBSTalkMessage`;

ALTER TABLE `code`.`bbstalk` 
CHANGE COLUMN `bbstalkTime` `bbstalkTime` DATETIME NULL DEFAULT NULL ;

ALTER TABLE `code`.`freedommode` 
ADD COLUMN `freeModeSaveTime` DATETIME NULL AFTER `source`;

ALTER TABLE `code`.`checkoutpoint` 
CHANGE COLUMN `saveTime` `saveTime` DATETIME NULL ;



/*==============================================================*/
/* 2019.4.13  rgzhang增加：学生登录表，记录登录信息，包括IP、日期、注册日期、登录日期、昵称、账户、密码       */
/* 2019.4.13  rgzhang增加：监护人登录表，记录登录信息，包括IP、日期、注册日期、登录日期、昵称、账户、密码   */
/* 2019.4.13  rgzhang修改：学生表，修改为学校、姓名、性别、学号、年龄、班级、电话、邮箱、其他信息等字段                         */
/* 2019.4.13  rgzhang修改：监护人表，修改为姓名、性别、年龄、电话、地址、邮箱、其他信息                       */
/*==============================================================*/
CREATE TABLE `code`.`studentloginmessage` (
  `studentID` INT NOT NULL,
  `studentAccount` VARCHAR(30) NOT NULL,
  `studentPassword` VARCHAR(20) NULL,
  `loginIP` VARCHAR(20) NULL,
  `loginData` DATETIME NULL,
  `loginCounts` INT NULL DEFAULT 0,
  `registerData` DATETIME NULL,
  PRIMARY KEY (`studentID`),
  UNIQUE INDEX `studentAccount_UNIQUE` (`studentAccount` ASC));
ALTER TABLE `code`.`studentloginmessage` 
ADD COLUMN `nickname` VARCHAR(45) NULL AFTER `studentPassword`;

ALTER TABLE `code`.`studentloginmessage` 
RENAME TO  `code`.`studentlogin` ;

ALTER TABLE `code`.`studentlogin` 
DROP COLUMN `registerData`;


CREATE TABLE `code`.`guardianlogin` (
  `guardianID` INT NOT NULL,
  `guardianAccount` VARCHAR(30) CHARACTER SET 'utf8' NOT NULL,
  `guardianPassword` VARCHAR(20) NULL,
  `nickname` VARCHAR(45) NULL,
  `loginIP` VARCHAR(20) NULL,
  `loginData` DATETIME NULL,
  `loginCounts` INT NULL,
  `registerData` DATETIME NULL,
  PRIMARY KEY (`guardianID`),
  UNIQUE INDEX `guardianAccount_UNIQUE` (`guardianAccount` ASC));

ALTER TABLE `code`.`guardianlogin` 
DROP COLUMN `registerData`;


ALTER TABLE `code`.`guardian` 
ADD COLUMN `guardianAge` INT NULL DEFAULT 0 AFTER `guardianEmail`,
ADD COLUMN `guardianPhone` VARCHAR(15) NULL AFTER `guardianAge`,
ADD COLUMN `guardianAddress` VARCHAR(80) NULL AFTER `guardianPhone`,
ADD COLUMN `guardianRemark` VARCHAR(45) NULL AFTER `guardianAddress`,
CHANGE COLUMN `guardianPassword` `guardianGender` VARCHAR(2) NULL DEFAULT NULL ;

ALTER TABLE `code`.`guardian` 
ADD COLUMN `guardianRegisterTime` DATETIME NULL AFTER `guardianRemark`;


ALTER TABLE `code`.`student` 
ADD COLUMN `studentPhone` VARCHAR(15) NULL AFTER `studentAge`,
ADD COLUMN `studentSchool` VARCHAR(45) NULL AFTER `studentPhone`,
ADD COLUMN `studentNumber` VARCHAR(20) NULL AFTER `studentSchool`,
ADD COLUMN `studentGrade` VARCHAR(10) NULL AFTER `studentNumber`,
ADD COLUMN `studentRemark` VARCHAR(100) NULL AFTER `studentGrade`,
CHANGE COLUMN `studentGender` `studentGender` VARCHAR(2) NULL DEFAULT NULL AFTER `studentName`,
CHANGE COLUMN `studentPassword` `studentEmail` VARCHAR(30) NULL DEFAULT NULL ,
CHANGE COLUMN `studentAccount` `studentAge` INT NULL ,
DROP INDEX `studentAccount_UNIQUE` ;

ALTER TABLE `code`.`student` 
ADD COLUMN `studentRegisterTime` DATETIME NULL AFTER `studentRemark`;



/*==============================================================*/
/* 2019.4.13  rgzhang增加： 管理员信息表                         */
/* 2019.4.13  rgzhang增加： 一些表中增加备注字段                  */
/*==============================================================*/
ALTER TABLE `code`.`checkpoint` 
ADD COLUMN `checkpointData` DATETIME NULL AFTER `checkpointCode`,
ADD COLUMN `checkpointRemark` VARCHAR(45) NULL AFTER `checkpointData`,
CHANGE COLUMN `checkpointMessage` `checkpointCode` VARCHAR(1000) NULL DEFAULT NULL ;

CREATE TABLE `code`.`admin` (
  `adminID` INT NOT NULL,
  `adminAccount` VARCHAR(45) NULL,
  `adminPassword` VARCHAR(20) NULL,
  `adminLeval` INT NULL,
  `adminMessage` VARCHAR(100) NULL,
  PRIMARY KEY (`adminID`));


/*==============================================================*/
/* 2019.4.14  rgzhang增加： 代码部分索引，用于增快检索速度          */
/* 2019.4.14  rgzhang增加： 将IP信息、登录日期信息提取出来，减少冗余          */
/*==============================================================*/
ALTER TABLE `code`.`checkoutpoint`
ADD COLUMN `checkpointID` INT NULL AFTER `studentID`;
ALTER TABLE `code`.`checkoutpoint`
ADD INDEX `studentLevel`(`studentID`,`checkpointID`);

CREATE TABLE `code`.`studentloginmessage` (
  `studentLoginID` VARCHAR(45) NOT NULL,
  `studentID` INT NULL,
  `loginIP` VARCHAR(45) NULL,
  `loginData` DATETIME NULL,
  `loginMessage` VARCHAR(100) NULL,
  PRIMARY KEY (`studentLoginID`),
  UNIQUE INDEX `studentID_UNIQUE` (`studentID` ASC));

  CREATE TABLE `code`.`guardianloginmessage` (
  `guardianloginID` INT NOT NULL,
  `guardianID` VARCHAR(45) NULL,
  `loginIP` VARCHAR(45) NULL,
  `loginData` DATETIME NULL,
  `loginMessage` VARCHAR(100) NULL,
  PRIMARY KEY (`guardianloginID`),
  UNIQUE INDEX `guardianID_UNIQUE` (`guardianID` ASC));
ALTER TABLE `code`.`studentlogin`
DROP COLUMN `loginCounts`,
DROP COLUMN `loginData`,
DROP COLUMN `loginIP`;
ALTER TABLE `code`.`guardianlogin`
DROP COLUMN `loginCounts`,
DROP COLUMN `loginData`,
DROP COLUMN `loginIP`;


/*==============================================================*/
/* 2019.4.14  rgzhang增加： 自增列。                 */
/* 注：student表不要自增主键，而是通过studentlogin表得到的主键加进去，防止冗余          */
/*==============================================================*/
ALTER TABLE `code`.`studentlogin`
CHANGE COLUMN `studentID` `studentID` INT(11) NOT NULL AUTO_INCREMENT ;
SET FOREIGN_KEY_CHECKS=0;
ALTER TABLE `code`.`student`
CHANGE COLUMN `studentID` `studentID` INT(11) NOT NULL ;
ALTER TABLE `code`.`guardianlogin`
CHANGE COLUMN `guardianID` `guardianID` INT(11) NOT NULL AUTO_INCREMENT ;
ALTER TABLE `code`.`admin`
CHANGE COLUMN `adminID` `adminID` INT(11) NOT NULL AUTO_INCREMENT ;
ALTER TABLE `code`.`studentloginmessage`
CHANGE COLUMN `studentLoginID` `studentLoginID` INT NOT NULL AUTO_INCREMENT ;
ALTER TABLE `code`.`guardianloginmessage`
CHANGE COLUMN `guardianloginID` `guardianloginID` INT(11) NOT NULL AUTO_INCREMENT ;
ALTER TABLE `code`.`studentloginmessage`
DROP INDEX `studentID_UNIQUE` ;
ALTER TABLE `code`.`guardianloginmessage`
DROP INDEX `guardianID_UNIQUE` ;
;


/*==============================================================*/
/* 2019.5.25  rgzhang增加： 自增列。                 */
/* 修改CheckoutPoint表 和 freedomMod表 结构      */
/* 修改CheckoutPoint表 新增getpass字段，        */
/*==============================================================*/
ALTER TABLE `code`.`freedommode`
ADD COLUMN `studentID` INT NOT NULL AFTER `freeModeID`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`freeModeID`, `studentID`);
;
ALTER TABLE `code`.`checkoutpoint`
DROP COLUMN `checkOutPointID`,
CHANGE COLUMN `checkpointID` `checkpointID` INT(11) NOT NULL ,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`studentID`, `checkpointID`);
;
ALTER TABLE `code`.`checkoutpoint`
CHANGE COLUMN `toalTime` `toalTime` INT NULL DEFAULT NULL ;
ALTER TABLE `code`.`checkoutpoint`
ADD COLUMN `isSuccess` INT(1) NULL DEFAULT 0 AFTER `saveTime`;
ALTER TABLE `code`.`freedommode`
ADD COLUMN `toaltime` INT NULL AFTER `freeModeSaveTime`;
ALTER TABLE `code`.`freedommode`
CHANGE COLUMN `freeModeID` `freeModeID` INT(11) NOT NULL AUTO_INCREMENT ;
ALTER TABLE `code`.`freedommode`
DROP COLUMN `freeModeID`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`studentID`);
;



