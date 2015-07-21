ALTER TABLE `begincode_code`
	CHANGE COLUMN `code_info` `code_info` VARCHAR(200) NOT NULL AFTER `begincode_code_id`,
	ADD COLUMN `code_abstract` VARCHAR(500) NOT NULL AFTER `code_info`;
ALTER TABLE `begincode_code`
	ADD COLUMN `begincode_user_id` INT NULL DEFAULT NULL AFTER `code_type_name`,
	ADD COLUMN `nickname` VARCHAR(50) NULL DEFAULT NULL AFTER `begincode_user_id`,
	ADD COLUMN `pic` VARCHAR(200) NULL DEFAULT NULL AFTER `nickname`;
