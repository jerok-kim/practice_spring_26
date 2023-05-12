package kim.jerok.practice_spring_26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan  // 서블릿 자동 등록
@SpringBootApplication
public class PracticeSpring26Application {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpring26Application.class, args);
    }

}
