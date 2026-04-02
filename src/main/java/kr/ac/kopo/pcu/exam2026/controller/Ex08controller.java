package kr.ac.kopo.pcu.exam2026.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Ex08controller {
    @GetMapping("/exam08")
    public ModelAndView requestMethod(){
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("title1", "ModelAndView 연습");
        modelView.addObject("title2", "ModelAndView는 addObject()와 setViewName()를 사용");
        modelView.setViewName("viewPage");
        return modelView;
    }
}
