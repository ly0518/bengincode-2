ALTER TABLE `begincode_navigation`
	CHANGE COLUMN `delete_flag_1` `delete_flag` CHAR(1) NULL DEFAULT NULL AFTER `nav_memo`;
