package kr.ac.kopo.pcu.exam2026.controller;

import domain.Member3;
import kr.ac.kopo.pcu.*;
import kr.ac.kopo.pcu.exam2026.repository.Member3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam14_01")
public class Chap14_01Controller {
    @Autowired
    Member3Repository repository;
    //    Read(select)
    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList = repository.findAll();
        model.addAttribute("memberList", memberList);
        return "viewPage02";
    }
    //    Create를 위한 입력 화면
    @GetMapping("/new")
    public String newInputMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "viewPage02_new";
    }

    //    Create(insert) 실행
    @PostMapping("/insert")
    public String insertMember3(@ModelAttribute("member") Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }

    //    Update(update)할 내용 입력
    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable(name = "id")int id, Model model){
        Optional<Member3> member3 =  repository.findById(id);
        model.addAttribute("member", member3);
        return "viewPage02_edit";
    }

    @PostMapping("/update")
    public String updateMember(@ModelAttribute("member")Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable(name = "id")int id){
        repository.deleteById(id);
        return "redirect:/exam14_01";
    }
}