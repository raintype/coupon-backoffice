package com.raintype;

import com.raintype.domain.UserVO;
import com.raintype.dto.LoginDTO;
import com.raintype.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CouponBackofficeApplication.class)
@WebAppConfiguration
public class LoginTest {

    @Autowired
    private UserService userService;

    @Test
    public void validLogin()throws Exception{
        String userid = "raintype";
        String userpw = "test12";

        LoginDTO loginDTO = new LoginDTO(userid, userpw);

        UserVO vo = userService.login(loginDTO);

        assertThat(vo.getUser_id(), is(userid));
    }

    @Test
    public void invalidLogin() throws Exception{
        String userid = "raintype";
        String userpw = "1234";

        LoginDTO loginDTO = new LoginDTO(userid, userpw);

        UserVO vo = userService.login(loginDTO);

        System.out.println(vo);


        assertThat(vo, is(nullValue()));

        loginDTO.setUser_pw("test1");
        UserVO vo1 = userService.login(loginDTO);
        assertThat(vo1, is(nullValue()));

        loginDTO.setUser_pw("");
        UserVO vo2 = userService.login(loginDTO);
        assertThat(vo2, is(nullValue()));

        loginDTO.setUser_id("");
        UserVO vo3 = userService.login(loginDTO);
        assertThat(vo3, is(nullValue()));
    }

    @Test
    public void loginDTOisNull() throws Exception{
        UserVO vo = userService.login(null);
        assertThat(vo, is(nullValue()));
    }

}
