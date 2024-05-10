-- Supprimer la table cards si elle existe
DROP TABLE IF EXISTS cards;

-- Créer la table cards
CREATE TABLE `cards` (
    `card_id` INT NOT NULL AUTO_INCREMENT,
    `card_number` VARCHAR(100) NOT NULL,
    `customer_id` int NOT NULL,
    `card_type` VARCHAR(100) NOT NULL,
    `total_limit` INT NOT NULL,
    `amount_used` int NOT NULL,
    `available_amount` VARCHAR(100) NOT NULL,
    `create_dt` date  DEFAULT NULL,
    PRIMARY KEY ('card_id')
);


INSERT INTO `cards` (`card_number`,`customer_id`,`card_type`,`total_limit`,`amount_used`,`available_amount` ,`create_dt`)
VALUES ('4545XXXXXX45445','1','Credit', 10000, 500 , 9500, CURDATE());

INSERT INTO `cards` (`card_number`,`customer_id`,`card_type`,`total_limit`,`amount_used`,`available_amount` ,`create_dt`)
VALUES ('4545XXXXXX45445','1','Credit', 7500, 600, 6900, CURDATE());

INSERT INTO `cards` (`card_number`,`customer_id`,`card_type`,`total_limit`,`amount_used`,`available_amount` ,`create_dt`)
VALUES ('4545XXXXXX45445','1','Credit', 20000, 4000, 16000, CURDATE());
