package com.raintype.persistence;

import com.raintype.domain.UserVO;
import com.raintype.dto.LoginDTO;
import org.apache.ibatis.annotations.Param;

/**
 * Created by raintype on 2016. 7. 27..
 */
public interface UserMapper {
    UserVO login(LoginDTO loginDTO) throws Exception;

}
