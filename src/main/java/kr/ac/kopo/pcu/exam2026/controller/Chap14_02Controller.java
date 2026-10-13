package kr.ac.kopo.pcu.exam2026.controller;

import domain.Member3;
import kr.ac.kopo.pcu.exam2026.repository.Member3Repository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam14_02")
public class Chap14_02Controller {

    @Autowired
    Member3Repository2 repository;

    // 모든 레코드 조회 출력
    @GetMapping
    public String viewHomePage(Model model) {
        Iterable<Member3> memberList = repository.selectMembers();
        model.addAttribute("memberList", memberList);
        return "viewPage03";
    }

    // 삽입 뷰 페이지 출력
    @GetMapping("/new")
    public String newMethod(Model model) {
        Member3 member = new Member3();
        model.addAttribute("member", member);
        return "viewPage03_new";
    }

    // 삽입 수행
    @PostMapping("/insert")
    public String insertMethod(@ModelAttribute("member") Member3 member) {
        repository.insertMember(member.getName(), member.getAge(), member.getEmail());
        return "redirect:/exam14_02";
    }

    // 수정 뷰 페이지 출력
    @GetMapping("/edit/{id}")
    public String editMethod(@PathVariable(name = "id") int id, Model model) {
        Member3 member = repository.selectById(id);
        model.addAttribute("member", member);
        return "viewPage03_edit";
    }

    // 수정 수행
    @PostMapping("/update")
    public String updateMethod(@ModelAttribute("member") Member3 member) {
        repository.updateMember(member.getName(), member.getAge(), member.getEmail(),
                member.getId());
        return "redirect:/exam14_02";
    }

    // 삭제 수행
    @GetMapping("/delete/{id}")
    public String deleteMethod(@PathVariable(name = "id") int id) {
        repository.deleteById(id);
        return "redirect:/exam14_02";
    }
}
