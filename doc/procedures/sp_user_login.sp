USE `CouponDB`;
DROP procedure IF EXISTS `sp_user_login`;

DELIMITER $$
USE `CouponDB`$$
CREATE DEFINER=`coupon_user`@`%` PROCEDURE `sp_user_login`(
	IN user_id varchar(50),
    IN user_pw varchar(200)
)
BEGIN
	select userno, userid, username, regdate, updatedate
    from tbl_user
    where userid = user_id and userpw = user_pw;
END$$

DELIMITER ;

