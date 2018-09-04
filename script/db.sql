CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `location` point DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;