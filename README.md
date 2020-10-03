auto-example的测试项目，关于auto-example的详细介绍参考该项目的README.md，项目地址：
https://github.com/Miles-Hu/auto_example

由于涉及到数据库访问，运行本项目前，需要先建立数据库数据，执行下面SQL，且在application.yaml中正确配置数据库连接

CREATE TABLE `resource` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(10) unsigned NOT NULL,
  `name` varchar(64) NOT NULL,
  `chinese_name` varchar(64) DEFAULT NULL,
  `parent_id` int(10) NOT NULL,
  `description` varchar(128) DEFAULT NULL,
  `deleted` int(11) NOT NULL,
  `owner_id` int(10) unsigned NOT NULL,
  `owner_email` varchar(64) NOT NULL,
  `update_person` varchar(64) DEFAULT '',
  `special` int(10) NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `extra` varchar(64) DEFAULT '',
  `template` varchar(64) DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='resource_table';

INSERT INTO `beexiao`.`resource` (`id`, `type`, `name`, `chinese_name`, `parent_id`, `deleted`, `owner_id`, `owner_email`, `update_person`, `special`, `create_time`, `update_time`, `extra`, `template`) 
VALUES ('1', '3', 'fm:user-history:51190', 'fm:user-history:51190', '650', '0', '146', 'adam@gmail.com', 'jacob@gmail.com', '1', '2019-06-21 17:02:46', '2019-06-21 17:03:29', '', '')
,('2', '3', 'mappFreeClasses:appointment:117281', 'mappFreeClasses:appointment:117281', '85', '0', '146', 'adam@gmail.com', 'jacob@gmail.com', '0', '2019-06-21 17:02:46', '2019-06-21 17:03:04', '', '')
,('3', '2', 'conf:mathematics', 'conf:mathematics', '1', '0', '146', 'adam@gmail.com', 'jacob@gmail.com', '0', '2019-06-21 17:02:46', '2019-06-21 17:02:46', '', '')
,('4', '3', 'math:class:mount', 'math:class:mount', '56', '0', '146', 'adam@gmail.com', 'jacob@gmail.com', '0', '2019-06-21 17:02:46', '2019-06-21 17:02:49', '', '')
,('5', '1', 'granary', 'granary', '-1', '0', '146', 'adam@gmail.com', 'jacob@gmail.com', '0', '2019-06-21 17:02:46', '2019-06-21 17:03:09', '', '');