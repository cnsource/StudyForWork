CREATE TABLE `user` (
                        `id` varchar(50) NOT NULL,
                        `name` varchar(255) DEFAULT NULL,
                        `sex` varchar(255) DEFAULT NULL,
                        `age` int(11) DEFAULT NULL,
                        `phone` varchar(255) DEFAULT NULL,
                        `birth` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('49aeb044', '张三', '男', 20, '18674593851', '2000-12-9');
INSERT INTO `user` VALUES ('4fb86c25', '李四', '男', 19, '18569736541', '2004-06-12');