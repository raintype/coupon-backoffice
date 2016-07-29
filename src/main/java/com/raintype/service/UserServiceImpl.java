package com.raintype.service;

import com.raintype.domain.UserVO;
import com.raintype.dto.LoginDTO;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

import com.raintype.persistence.UserMapper;
/**
 * Created by raintype on 2016. 7. 28..
 */
@Service
public class UserServiceImpl implements UserService {
    @Inject
    private UserMapper userMapper;

    public UserVO login(LoginDTO dto) throws Exception{
        if (dto == null) {
            return null;
        }

        UserVO userVO = userMapper.login(dto);
        return userVO;
    }

}
