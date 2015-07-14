ALTER TABLE `begincode_user`
	ADD COLUMN `delete_flag` CHAR(1) NULL DEFAULT NULL AFTER `user_source_id`,
	ADD COLUMN `invite_code` VARCHAR(20) NULL DEFAULT NULL AFTER `delete_flag`,
	DROP COLUMN `frozen`;
