ALTER TABLE `begincode_code`
	DROP COLUMN `bc_navigation_id`;
ALTER TABLE `begincode_code`
	CHANGE COLUMN `begincode_code_code_id` `begincode_code_id` INT(11) NOT NULL AUTO_INCREMENT FIRST;