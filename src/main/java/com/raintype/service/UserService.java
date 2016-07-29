package com.raintype.service;

import com.raintype.domain.UserVO;
import com.raintype.dto.LoginDTO;

/**
 * Created by raintype on 2016. 7. 28..
 */
public interface UserService {
    UserVO login(LoginDTO dto) throws Exception;
}
