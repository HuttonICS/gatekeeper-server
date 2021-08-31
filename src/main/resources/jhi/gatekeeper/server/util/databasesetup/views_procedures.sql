SET FOREIGN_KEY_CHECKS=0;

DROP VIEW IF EXISTS `view_access_request_user_details`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_access_request_user_details` AS select `access_requests`.`id` AS `id`,`users`.`username` AS `username`,`users`.`full_name` AS `full_name`,`users`.`email_address` AS `email_address`,`access_requests`.`created_on` AS `created_on`,`institutions`.`id` AS `institution_id`,`institutions`.`name` AS `name`,`institutions`.`acronym` AS `acronym`,`institutions`.`address` AS `address`,`database_systems`.`system_name` AS `database_system_name`,`database_systems`.`server_name` AS `database_server_name`,`access_requests`.`has_been_rejected` AS `has_been_rejected`,`access_requests`.`needs_approval` AS `needs_approval`,`access_requests`.`activation_key` AS `activation_key` from (((`access_requests` left join `users` on((`users`.`id` = `access_requests`.`user_id`))) left join `institutions` on((`institutions`.`id` = `users`.`institution_id`))) left join `database_systems` on((`database_systems`.`id` = `access_requests`.`database_system_id`))) where (`access_requests`.`has_been_rejected` = 0);

DROP VIEW IF EXISTS `view_counts`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_counts` AS select (select count(1) from `users`) AS `users`,((select count(1) from `unapproved_users` where ((`unapproved_users`.`has_been_rejected` = 0) )) + (select count(1) from `access_requests` where ((`access_requests`.`has_been_rejected` = 0) ))) AS `requests`,(select count(1) from `database_systems`) AS `databases`;

DROP VIEW IF EXISTS `view_unapproved_user_details`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_unapproved_user_details` AS select `unapproved_users`.`id` AS `id`,`unapproved_users`.`user_username` AS `username`,`unapproved_users`.`user_full_name` AS `full_name`,`unapproved_users`.`user_email_address` AS `email_address`,`unapproved_users`.`created_on` AS `created_on`,`unapproved_users`.`institution_id` AS `institution_id`,if(isnull(`unapproved_users`.`institution_id`),`unapproved_users`.`institution_name`,`institutions`.`name`) AS `name`,if(isnull(`unapproved_users`.`institution_id`),`unapproved_users`.`institution_acronym`,`institutions`.`acronym`) AS `acronym`,if(isnull(`unapproved_users`.`institution_id`),`unapproved_users`.`institution_address`,`institutions`.`address`) AS `address`,`database_systems`.`system_name` AS `database_system_name`,`database_systems`.`server_name` AS `database_server_name`,`unapproved_users`.`has_been_rejected` AS `has_been_rejected`,`unapproved_users`.`needs_approval` AS `needs_approval`,`unapproved_users`.`activation_key` AS `activation_key` from ((`unapproved_users` left join `institutions` on((`institutions`.`id` = `unapproved_users`.`institution_id`))) left join `database_systems` on((`database_systems`.`id` = `unapproved_users`.`database_system_id`))) where (`unapproved_users`.`has_been_rejected` = 0);

DROP VIEW IF EXISTS `view_user_details`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_user_details` AS select `users`.`id` AS `id`,`users`.`username` AS `username`,`users`.`full_name` AS `full_name`,`users`.`email_address` AS `email_address`,`users`.`last_login` AS `last_login`,`users`.`created_on` AS `created_on`,`users`.`has_access_to_gatekeeper` AS `gatekeeper_access`,`institutions`.`name` AS `name`,`institutions`.`acronym` AS `acronym`,`institutions`.`address` AS `address` from (`users` left join `institutions` on((`institutions`.`id` = `users`.`institution_id`)));

DROP VIEW IF EXISTS `view_user_permissions`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_user_permissions` AS select `users`.`id` AS `user_id`,`users`.`username` AS `username`,`database_systems`.`id` AS `database_id`,`database_systems`.`system_name` AS `system_name`,`database_systems`.`server_name` AS `server_name`,`user_types`.`id` AS `user_type_id`,`user_types`.`description` AS `user_type` from (((`user_has_access_to_databases` left join `users` on((`users`.`id` = `user_has_access_to_databases`.`user_id`))) left join `user_types` on((`user_types`.`id` = `user_has_access_to_databases`.`user_type_id`))) left join `database_systems` on((`database_systems`.`id` = `user_has_access_to_databases`.`database_id`)));

SET FOREIGN_KEY_CHECKS=1;