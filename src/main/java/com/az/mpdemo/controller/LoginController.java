package com.az.mpdemo.controller;

import com.az.mpdemo.dto.LoginDTO;
import com.az.mpdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private AccountService accountService;

    @PostMapping("login")
    public String login(String username, String password, HttpSession session, RedirectAttributes attributes) {
        LoginDTO loginDTO = accountService.login(username, password);
        String error = loginDTO.getError();
        if (error == null) {
            session.setAttribute("account", loginDTO.getAccount());
        } else {
            attributes.addFlashAttribute("error", error);
        }
        return loginDTO.getPath();
    }

    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
