package kim.jerok.practice_spring_26.web.frontcontroller.v3.controller;

import kim.jerok.practice_spring_26.domain.member.Member;
import kim.jerok.practice_spring_26.domain.member.MemberRepository;
import kim.jerok.practice_spring_26.web.frontcontroller.ModelView;
import kim.jerok.practice_spring_26.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}
