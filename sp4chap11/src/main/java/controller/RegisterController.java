package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring.AlreadyExistingMemberException;
import spring.MemberRegisterService;
import spring.RegisterRequest;

@Controller
public class RegisterController {

    private MemberRegisterService memberRegisterService;

    public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
        this.memberRegisterService = memberRegisterService;
    }

    @RequestMapping("/register/step1")
    public String handleStep1() {
        return "register/step1";
    }

    @RequestMapping(value = "/register/step2", method = RequestMethod.POST)
    public String handleStep2(@RequestParam(value = "agree", defaultValue = "false")Boolean agree) {
        if (!agree) {
            return "register/step1";
        }
        return "register/step2";
    }

    @RequestMapping(value = "/register/step2",method = RequestMethod.GET)
    public String handleStep2() {
        return "redirect:/register/step1";
        //  return "redirect:step1";    현재 경로를 기준으로 상대경로를 사용한다.
    }

    @RequestMapping(value = "register/step3", method = RequestMethod.POST)
    public String handlestep3(RegisterRequest regReq) {
        try {
            memberRegisterService.regist(regReq);
            return "register/step3";
        } catch (AlreadyExistingMemberException ex) {
            return "register/step2";
        }
    }


}
