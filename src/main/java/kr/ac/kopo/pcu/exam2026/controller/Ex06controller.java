package kr.ac.kopo.pcu.exam2026.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Ex06controller {
    //@GetMapping("/exam06")
//    public String requestMethod(Model model){
//        model.addAttribute("title1", "Model 유형연습1");
//        model.addAttribute("title2", "문자열값 또는 객체참조값 전달 가능");
//        return "viewPage";
//    }

    @GetMapping("/exam06")
    public String requestMethod(Model model){
        model.addAttribute("title1", "Model 유형연습1");
        model.addAttribute("title2", "문자열값 또는 객체참조값 전달 가능");
        return "view06";
    }
}
