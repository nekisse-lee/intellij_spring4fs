package survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @RequestMapping(method = RequestMethod.GET)
    public String form(Model model) {
        List<Question> questions = createQuestion();
        model.addAttribute("questions", questions);
        return "survey/surveyForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(@ModelAttribute("ansData") AnsweredData data) {
        return "survey/submitted";
    }



    private List<Question> createQuestion() {
        Question q1 = new Question("당신의 역할은 무엇입니까?"
                , Arrays.asList("서버", "프론트", "풀스택"));

        Question q2 = new Question("사용하는 개발 도구는 무엇입니까?"
                , Arrays.asList("이클립스", "인텔리J", "서브라임"));

        Question q3 = new Question("하고 싶은 말을 적어 주세요");

        return Arrays.asList(q1, q2, q3);
    }


}
