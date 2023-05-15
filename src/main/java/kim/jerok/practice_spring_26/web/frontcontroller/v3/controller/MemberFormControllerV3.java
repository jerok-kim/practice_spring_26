package kim.jerok.practice_spring_26.web.frontcontroller.v3.controller;

import kim.jerok.practice_spring_26.web.frontcontroller.ModelView;
import kim.jerok.practice_spring_26.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
