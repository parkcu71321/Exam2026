package kr.ac.kopo.pcu.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Chap05_01Controller {

    @GetMapping("/chap0501")
    public String requestMethod(@RequestParam("id") String userId, @RequestParam("pwd") String userPwd, Model model) {

        model.addAttribute("userId", userId);
        model.addAttribute("userPwd", userPwd);

        return "viewPage05_01";
    }
}
