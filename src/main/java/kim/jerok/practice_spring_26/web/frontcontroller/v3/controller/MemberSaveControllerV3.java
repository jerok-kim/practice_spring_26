package kim.jerok.practice_spring_26.web.frontcontroller.v3.controller;

import kim.jerok.practice_spring_26.domain.member.Member;
import kim.jerok.practice_spring_26.domain.member.MemberRepository;
import kim.jerok.practice_spring_26.web.frontcontroller.ModelView;
import kim.jerok.practice_spring_26.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
