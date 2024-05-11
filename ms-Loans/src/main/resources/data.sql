-- Supprimer la table cards si elle existe
DROP TABLE IF EXISTS loans;

-- Créer la table cards
CREATE TABLE `loans` (
            `loan_number` INT NOT NULL AUTO_INCREMENT,
            `customer_id` INT NOT NULL,
            `start_dt` date  NOT NULL,
            `loan_type` VARCHAR(100) NOT NULL,
            `total_loan` INT NOT NULL,
            `amount_paid` int NOT NULL,
            `outstanding_amount` int NOT NULL,
            `create_dt` date  DEFAULT NULL,
            PRIMARY KEY (`loan_number`)
);

INSERT INTO `loans` (`customer_id`, `start_dt`,`loan_type`,`total_loan`,`amount_paid`,`outstanding_amount` ,`create_dt`)
VALUES (1,CURDATE()-250,'Home', 200000, 50000 , 150000,CURDATE()-250);

INSERT INTO `loans` (`customer_id`, `start_dt`,`loan_type`,`total_loan`,`amount_paid`,`outstanding_amount` ,`create_dt`)
VALUES (1,CURDATE()-376,'Vehicle', 40000, 10000 , 30000,CURDATE()-376);

INSERT INTO `loans` (`customer_id`, `start_dt`,`loan_type`,`total_loan`,`amount_paid`,`outstanding_amount` ,`create_dt`)
VALUES (1,CURDATE()-200,'Home', 50000, 10000 , 4000,CURDATE()-200);

INSERT INTO `loans` (`customer_id`, `start_dt`,`loan_type`,`total_loan`,`amount_paid`,`outstanding_amount` ,`create_dt`)
VALUES (1,CURDATE()-122,'Personal', 10000, 3500 , 6500,CURDATE()-122);
