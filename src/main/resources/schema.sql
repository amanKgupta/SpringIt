DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `created_by` varchar(255) DEFAULT NULL,
    `creation_date` datetime DEFAULT NULL,
    `last_modified_by` varchar(255) DEFAULT NULL,
    `last_modified_date` datetime DEFAULT NULL,
    `body` varchar(255) DEFAULT NULL,
    `link_id` bigint(20) DEFAULT NULL,
    primary key (`id`),
    KEY `FKoutxw6g1ndh1t6282y0fwvami`(`link_id`)
)  ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `link`;
CREATE TABLE `link`(
                          `id` bigint(20) NOT NULL AUTO_INCREMENT,
                          `created_by` varchar(255) DEFAULT NULL,
                          `creation_date` datetime DEFAULT NULL,
                          `last_modified_by` varchar(255) DEFAULT NULL,
                          `last_modified_date` datetime DEFAULT NULL,
                          `title` varchar(255) DEFAULT NULL,
                          `url` varchar(255) DEFAULT NULL,
                          primary key (`id`)
)  ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




