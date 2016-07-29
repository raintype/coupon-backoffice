package com.raintype.controller;


import com.raintype.domain.UserVO;
import com.raintype.dto.LoginDTO;
import com.raintype.interceptor.LoginInterceptor;
import com.raintype.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("auth")
public class AuthController {
    private static final String LOGIN = "login";
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Inject
    private UserService service;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public void loginGet(@ModelAttribute("dto") LoginDTO dto){

    }

    @RequestMapping(value="/loginPost", method = RequestMethod.POST)
    public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception{
        UserVO vo = service.login(dto);

        if (vo == null) {
            return;
        }

        model.addAttribute("userVO", vo);

    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        if(session.getAttribute(LOGIN) != null) {
            logger.info("clear login data before");
            session.removeAttribute(LOGIN);
        }

        return "redirect:/auth/login";

    }

}
