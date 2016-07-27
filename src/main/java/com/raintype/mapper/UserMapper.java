package com.raintype.mapper;

import com.raintype.domain.UserVO;
import org.apache.ibatis.annotations.Param;

/**
 * Created by raintype on 2016. 7. 27..
 */
public interface UserMapper {
    public UserVO login(@Param("userid")String userid, @Param("userpw")String userpw) throws Exception;

}
