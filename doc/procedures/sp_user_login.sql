USE `CouponDB`;
DROP procedure IF EXISTS `sp_user_login`;

DELIMITER $$
USE `CouponDB`$$
CREATE DEFINER=`coupon_user`@`%` PROCEDURE `sp_user_login`(
	IN id varchar(50),
    IN pw varchar(200)
)
BEGIN
	select user_no, user_id, user_name, reg_date, update_date
    from tbl_user
    where user_id = id and user_pw = pw;
END$$

DELIMITER ;

