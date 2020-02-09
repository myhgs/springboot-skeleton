package my.project.hong.web.controller;

import my.project.hong.model.Member;
import my.project.hong.model.code.Const;
import my.project.hong.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kiseokhong on 09/02/2020.
 */
@RestController
@RequestMapping(Const.URL_ROOT+"/member")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public List<Member> getMember(){
        return memberService.getMemberList();
    }

}
