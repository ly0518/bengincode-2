-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.23-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 begincode 的数据库结构
DROP DATABASE IF EXISTS `begincode`;
CREATE DATABASE IF NOT EXISTS `begincode` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `begincode`;


-- 导出  表 begincode.begincode_code 结构
DROP TABLE IF EXISTS `begincode_code`;
CREATE TABLE IF NOT EXISTS `begincode_code` (
  `begincode_code_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `code_info` varchar(400) NOT NULL,
  `code_content` text NOT NULL,
  `code_download_url` varchar(500) DEFAULT NULL,
  `prohibition_message` char(1) NOT NULL,
  `begincode_keys` varchar(100) DEFAULT NULL,
  `view_count` int(11) NOT NULL,
  `begincode_navigation_id` int(11) DEFAULT NULL,
  `bc_navigation_id` int(11) DEFAULT NULL,
  `create_datetime` datetime DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `good_count` int(11) NOT NULL,
  `bad_count` int(11) NOT NULL,
  `code_type_id` int(11) DEFAULT NULL,
  `release_state` char(1) NOT NULL,
  `check_flag` char(1) NOT NULL,
  `code_type_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`begincode_code_code_id`),
  KEY `Refbegincode_navigation14` (`begincode_navigation_id`),
  KEY `Refcode_type17` (`code_type_id`),
  CONSTRAINT `Refbegincode_navigation14` FOREIGN KEY (`begincode_navigation_id`) REFERENCES `begincode_navigation` (`begincode_navigation_id`),
  CONSTRAINT `Refcode_type17` FOREIGN KEY (`code_type_id`) REFERENCES `code_type` (`code_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_code 的数据：~0 rows (大约)
DELETE FROM `begincode_code`;
/*!40000 ALTER TABLE `begincode_code` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_code` ENABLE KEYS */;


-- 导出  表 begincode.begincode_course 结构
DROP TABLE IF EXISTS `begincode_course`;
CREATE TABLE IF NOT EXISTS `begincode_course` (
  `begincode_course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) NOT NULL,
  `course_pic_url` varchar(200) NOT NULL,
  `introduction` varchar(200) NOT NULL,
  `recommend` char(1) DEFAULT NULL,
  `course_label_id` int(11) DEFAULT NULL,
  `attention_count` int(11) DEFAULT NULL,
  `course_type_id` int(11) DEFAULT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `producer_introduction` varchar(500) DEFAULT NULL,
  `completion_status` char(1) NOT NULL,
  `begincode_navigation_id` int(11) DEFAULT NULL,
  `delete_flag_1` char(1) NOT NULL,
  `course_type_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`begincode_course_id`),
  KEY `Refbegincode_user9` (`begincode_user_id`),
  KEY `Refbegincode_navigation13` (`begincode_navigation_id`),
  KEY `Refcourse_label2` (`course_label_id`),
  KEY `Refcourse_type6` (`course_type_id`),
  CONSTRAINT `Refbegincode_navigation13` FOREIGN KEY (`begincode_navigation_id`) REFERENCES `begincode_navigation` (`begincode_navigation_id`),
  CONSTRAINT `Refbegincode_user9` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`),
  CONSTRAINT `Refcourse_label2` FOREIGN KEY (`course_label_id`) REFERENCES `course_label` (`course_label_id`),
  CONSTRAINT `Refcourse_type6` FOREIGN KEY (`course_type_id`) REFERENCES `course_type` (`course_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_course 的数据：~0 rows (大约)
DELETE FROM `begincode_course`;
/*!40000 ALTER TABLE `begincode_course` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_course` ENABLE KEYS */;


-- 导出  表 begincode.begincode_info 结构
DROP TABLE IF EXISTS `begincode_info`;
CREATE TABLE IF NOT EXISTS `begincode_info` (
  `begincode_info_id` int(11) NOT NULL AUTO_INCREMENT,
  `begincode_info_content` text,
  PRIMARY KEY (`begincode_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_info 的数据：~0 rows (大约)
DELETE FROM `begincode_info`;
/*!40000 ALTER TABLE `begincode_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_info` ENABLE KEYS */;


-- 导出  表 begincode.begincode_manager 结构
DROP TABLE IF EXISTS `begincode_manager`;
CREATE TABLE IF NOT EXISTS `begincode_manager` (
  `begincode_manager_id` int(11) NOT NULL AUTO_INCREMENT,
  `manager_pic_url` varchar(200) DEFAULT NULL,
  `manger_introduce` text,
  `delete_flag` char(1) NOT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`begincode_manager_id`),
  KEY `Refbegincode_user25` (`begincode_user_id`),
  CONSTRAINT `Refbegincode_user25` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_manager 的数据：~0 rows (大约)
DELETE FROM `begincode_manager`;
/*!40000 ALTER TABLE `begincode_manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_manager` ENABLE KEYS */;


-- 导出  表 begincode.begincode_navigation 结构
DROP TABLE IF EXISTS `begincode_navigation`;
CREATE TABLE IF NOT EXISTS `begincode_navigation` (
  `begincode_navigation_id` int(11) NOT NULL AUTO_INCREMENT,
  `nav_name` varchar(200) DEFAULT NULL,
  `nav_url` varchar(200) DEFAULT NULL,
  `up_nav_id` int(11) DEFAULT NULL,
  `nav_word` varchar(100) DEFAULT NULL,
  `nav_memo` varchar(100) DEFAULT NULL,
  `delete_flag_1` char(1) DEFAULT NULL,
  PRIMARY KEY (`begincode_navigation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_navigation 的数据：~0 rows (大约)
DELETE FROM `begincode_navigation`;
/*!40000 ALTER TABLE `begincode_navigation` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_navigation` ENABLE KEYS */;


-- 导出  表 begincode.begincode_project 结构
DROP TABLE IF EXISTS `begincode_project`;
CREATE TABLE IF NOT EXISTS `begincode_project` (
  `begincode_project_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(100) NOT NULL,
  `project_intro` varchar(4000) NOT NULL,
  `create_datetime` datetime NOT NULL,
  `delete_flag` char(1) NOT NULL,
  `begincode_navigation_id` int(11) DEFAULT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`begincode_project_id`),
  KEY `Refbegincode_navigation20` (`begincode_navigation_id`),
  KEY `Refbegincode_user21` (`begincode_user_id`),
  CONSTRAINT `Refbegincode_navigation20` FOREIGN KEY (`begincode_navigation_id`) REFERENCES `begincode_navigation` (`begincode_navigation_id`),
  CONSTRAINT `Refbegincode_user21` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_project 的数据：~0 rows (大约)
DELETE FROM `begincode_project`;
/*!40000 ALTER TABLE `begincode_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_project` ENABLE KEYS */;


-- 导出  表 begincode.begincode_user 结构
DROP TABLE IF EXISTS `begincode_user`;
CREATE TABLE IF NOT EXISTS `begincode_user` (
  `begincode_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(50) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  `nickname` varchar(50) NOT NULL,
  `cdate` datetime NOT NULL,
  `sex` char(1) DEFAULT NULL,
  `tel_phone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `receive_email` char(1) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `check_flag` char(1) DEFAULT NULL,
  `gag` char(1) NOT NULL,
  `frozen` char(1) NOT NULL,
  `course` varchar(5) DEFAULT NULL,
  `open_id` varchar(32) DEFAULT NULL,
  `access_token` varchar(32) DEFAULT NULL,
  `user_source_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`begincode_user_id`),
  KEY `Refuser_source1` (`user_source_id`),
  CONSTRAINT `Refuser_source1` FOREIGN KEY (`user_source_id`) REFERENCES `user_source` (`user_source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_user 的数据：~0 rows (大约)
DELETE FROM `begincode_user`;
/*!40000 ALTER TABLE `begincode_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `begincode_user` ENABLE KEYS */;


-- 导出  表 begincode.begincode_version 结构
DROP TABLE IF EXISTS `begincode_version`;
CREATE TABLE IF NOT EXISTS `begincode_version` (
  `begincode_version_id` int(11) NOT NULL AUTO_INCREMENT,
  `version` varchar(10) NOT NULL,
  PRIMARY KEY (`begincode_version_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.begincode_version 的数据：~0 rows (大约)
DELETE FROM `begincode_version`;
/*!40000 ALTER TABLE `begincode_version` DISABLE KEYS */;
INSERT INTO `begincode_version` (`begincode_version_id`, `version`) VALUES
	(1, '1.0');
/*!40000 ALTER TABLE `begincode_version` ENABLE KEYS */;


-- 导出  表 begincode.code_comment 结构
DROP TABLE IF EXISTS `code_comment`;
CREATE TABLE IF NOT EXISTS `code_comment` (
  `code_comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `code_comment_content` varchar(1000) NOT NULL,
  `create_datatime` datetime NOT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `comment_status` char(1) NOT NULL,
  `begincode_code_code_id` int(11) DEFAULT NULL,
  `order_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`code_comment_id`),
  KEY `Refbegincode_code15` (`begincode_code_code_id`),
  KEY `Refbegincode_user16` (`begincode_user_id`),
  CONSTRAINT `Refbegincode_code15` FOREIGN KEY (`begincode_code_code_id`) REFERENCES `begincode_code` (`begincode_code_code_id`),
  CONSTRAINT `Refbegincode_user16` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.code_comment 的数据：~0 rows (大约)
DELETE FROM `code_comment`;
/*!40000 ALTER TABLE `code_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `code_comment` ENABLE KEYS */;


-- 导出  表 begincode.code_type 结构
DROP TABLE IF EXISTS `code_type`;
CREATE TABLE IF NOT EXISTS `code_type` (
  `code_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `code_type_name` varchar(20) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`code_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.code_type 的数据：~0 rows (大约)
DELETE FROM `code_type`;
/*!40000 ALTER TABLE `code_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `code_type` ENABLE KEYS */;


-- 导出  表 begincode.course_comment 结构
DROP TABLE IF EXISTS `course_comment`;
CREATE TABLE IF NOT EXISTS `course_comment` (
  `course_comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_comment_content` varchar(1000) NOT NULL,
  `create_datatime` datetime NOT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `comment_status` char(1) NOT NULL,
  `video_course_chapter_id` int(11) DEFAULT NULL,
  `check_flag` char(1) NOT NULL,
  PRIMARY KEY (`course_comment_id`),
  KEY `Refbegincode_user8` (`begincode_user_id`),
  KEY `Refvideo_course_chapter11` (`video_course_chapter_id`),
  CONSTRAINT `Refbegincode_user8` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`),
  CONSTRAINT `Refvideo_course_chapter11` FOREIGN KEY (`video_course_chapter_id`) REFERENCES `video_course_chapter` (`video_course_chapter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.course_comment 的数据：~0 rows (大约)
DELETE FROM `course_comment`;
/*!40000 ALTER TABLE `course_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_comment` ENABLE KEYS */;


-- 导出  表 begincode.course_keynote 结构
DROP TABLE IF EXISTS `course_keynote`;
CREATE TABLE IF NOT EXISTS `course_keynote` (
  `course_keynote_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_keynote_content` text,
  `video_course_chapter_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`course_keynote_id`),
  KEY `Refvideo_course_chapter26` (`video_course_chapter_id`),
  CONSTRAINT `Refvideo_course_chapter26` FOREIGN KEY (`video_course_chapter_id`) REFERENCES `video_course_chapter` (`video_course_chapter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.course_keynote 的数据：~0 rows (大约)
DELETE FROM `course_keynote`;
/*!40000 ALTER TABLE `course_keynote` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_keynote` ENABLE KEYS */;


-- 导出  表 begincode.course_label 结构
DROP TABLE IF EXISTS `course_label`;
CREATE TABLE IF NOT EXISTS `course_label` (
  `course_label_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_type_name` varchar(20) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `label_course_count` int(11) DEFAULT NULL,
  `delete_flag_1` char(1) DEFAULT NULL,
  PRIMARY KEY (`course_label_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.course_label 的数据：~0 rows (大约)
DELETE FROM `course_label`;
/*!40000 ALTER TABLE `course_label` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_label` ENABLE KEYS */;


-- 导出  表 begincode.course_type 结构
DROP TABLE IF EXISTS `course_type`;
CREATE TABLE IF NOT EXISTS `course_type` (
  `course_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_type_name` varchar(20) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  PRIMARY KEY (`course_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.course_type 的数据：~0 rows (大约)
DELETE FROM `course_type`;
/*!40000 ALTER TABLE `course_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_type` ENABLE KEYS */;


-- 导出  表 begincode.project_stage 结构
DROP TABLE IF EXISTS `project_stage`;
CREATE TABLE IF NOT EXISTS `project_stage` (
  `project_stage_id` int(11) NOT NULL AUTO_INCREMENT,
  `stage_name` varchar(1000) NOT NULL,
  `stage_abstract` varchar(1000) NOT NULL,
  `video_url` varchar(200) NOT NULL,
  `create_datetime` datetime NOT NULL,
  `begincode_project_id` int(11) DEFAULT NULL,
  `view_count` int(11) NOT NULL,
  `release_state` char(1) NOT NULL,
  `good_count` int(11) DEFAULT NULL,
  `bad_count` int(11) DEFAULT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `project_name` varchar(100) NOT NULL,
  PRIMARY KEY (`project_stage_id`),
  KEY `Refbegincode_project19` (`begincode_project_id`),
  KEY `Refbegincode_user22` (`begincode_user_id`),
  CONSTRAINT `Refbegincode_project19` FOREIGN KEY (`begincode_project_id`) REFERENCES `begincode_project` (`begincode_project_id`),
  CONSTRAINT `Refbegincode_user22` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.project_stage 的数据：~0 rows (大约)
DELETE FROM `project_stage`;
/*!40000 ALTER TABLE `project_stage` DISABLE KEYS */;
/*!40000 ALTER TABLE `project_stage` ENABLE KEYS */;


-- 导出  表 begincode.project_stage_comment 结构
DROP TABLE IF EXISTS `project_stage_comment`;
CREATE TABLE IF NOT EXISTS `project_stage_comment` (
  `project_stage_comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `create_datetime` datetime NOT NULL,
  `comment_memo` varchar(400) NOT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `comment_status` char(1) NOT NULL,
  `order_number` int(11) DEFAULT NULL,
  `begincode_user_id` int(11) DEFAULT NULL,
  `project_stage_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`project_stage_comment_id`),
  KEY `Refbegincode_user23` (`begincode_user_id`),
  KEY `Refproject_stage24` (`project_stage_id`),
  CONSTRAINT `Refbegincode_user23` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`),
  CONSTRAINT `Refproject_stage24` FOREIGN KEY (`project_stage_id`) REFERENCES `project_stage` (`project_stage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.project_stage_comment 的数据：~0 rows (大约)
DELETE FROM `project_stage_comment`;
/*!40000 ALTER TABLE `project_stage_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `project_stage_comment` ENABLE KEYS */;


-- 导出  表 begincode.project_stage_detail 结构
DROP TABLE IF EXISTS `project_stage_detail`;
CREATE TABLE IF NOT EXISTS `project_stage_detail` (
  `project_stage_content_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_stage_content` text NOT NULL,
  `project_stage_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`project_stage_content_id`),
  KEY `Refproject_stage28` (`project_stage_id`),
  CONSTRAINT `Refproject_stage28` FOREIGN KEY (`project_stage_id`) REFERENCES `project_stage` (`project_stage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.project_stage_detail 的数据：~0 rows (大约)
DELETE FROM `project_stage_detail`;
/*!40000 ALTER TABLE `project_stage_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `project_stage_detail` ENABLE KEYS */;


-- 导出  表 begincode.user_course_relation 结构
DROP TABLE IF EXISTS `user_course_relation`;
CREATE TABLE IF NOT EXISTS `user_course_relation` (
  `user_course_relation_id` int(11) NOT NULL AUTO_INCREMENT,
  `begincode_user_id` int(11) DEFAULT NULL,
  `begincode_course_id` int(11) DEFAULT NULL,
  `delete_flag` char(1) NOT NULL,
  PRIMARY KEY (`user_course_relation_id`),
  KEY `Refbegincode_user3` (`begincode_user_id`),
  KEY `Refbegincode_course4` (`begincode_course_id`),
  CONSTRAINT `Refbegincode_course4` FOREIGN KEY (`begincode_course_id`) REFERENCES `begincode_course` (`begincode_course_id`),
  CONSTRAINT `Refbegincode_user3` FOREIGN KEY (`begincode_user_id`) REFERENCES `begincode_user` (`begincode_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.user_course_relation 的数据：~0 rows (大约)
DELETE FROM `user_course_relation`;
/*!40000 ALTER TABLE `user_course_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_course_relation` ENABLE KEYS */;


-- 导出  表 begincode.user_source 结构
DROP TABLE IF EXISTS `user_source`;
CREATE TABLE IF NOT EXISTS `user_source` (
  `user_source_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_source_name` varchar(10) DEFAULT NULL,
  `delete_flag_1` char(1) DEFAULT NULL,
  PRIMARY KEY (`user_source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.user_source 的数据：~0 rows (大约)
DELETE FROM `user_source`;
/*!40000 ALTER TABLE `user_source` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_source` ENABLE KEYS */;


-- 导出  表 begincode.video_course_chapter 结构
DROP TABLE IF EXISTS `video_course_chapter`;
CREATE TABLE IF NOT EXISTS `video_course_chapter` (
  `video_course_chapter_id` int(11) NOT NULL AUTO_INCREMENT,
  `video_course_chapter_memo` varchar(100) NOT NULL,
  `chapter_video_url` varchar(200) NOT NULL,
  `view_count` int(11) NOT NULL,
  `video_course_chapter_order` varchar(10) NOT NULL,
  `begincode_keys` varchar(100) DEFAULT NULL,
  `prohibition_message` char(1) DEFAULT NULL,
  `begincode_course_id` int(11) DEFAULT NULL,
  `good_count` int(11) DEFAULT NULL,
  `bad_count` int(11) DEFAULT NULL,
  `delete_flag_1` char(1) DEFAULT NULL,
  `chapter_code_down_url` varchar(200) DEFAULT NULL,
  `release_state` char(1) NOT NULL,
  `course_name` varchar(100) NOT NULL,
  PRIMARY KEY (`video_course_chapter_id`),
  KEY `Refbegincode_course5` (`begincode_course_id`),
  CONSTRAINT `Refbegincode_course5` FOREIGN KEY (`begincode_course_id`) REFERENCES `begincode_course` (`begincode_course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  begincode.video_course_chapter 的数据：~0 rows (大约)
DELETE FROM `video_course_chapter`;
/*!40000 ALTER TABLE `video_course_chapter` DISABLE KEYS */;
/*!40000 ALTER TABLE `video_course_chapter` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
