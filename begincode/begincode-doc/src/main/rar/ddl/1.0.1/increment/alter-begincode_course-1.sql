ALTER TABLE `begincode_course`
	CHANGE COLUMN `delete_flag_1` `delete_flag` CHAR(1) NOT NULL AFTER `begincode_navigation_id`;