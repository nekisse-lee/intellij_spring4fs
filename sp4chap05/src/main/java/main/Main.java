package main;

import config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.MemberInfoPrinter;
import spring.MemberRegisterService;
import spring.RegisterRequest;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        MemberRegisterService regSvc =
                ctx.getBean("memberRegSvc", MemberRegisterService.class);
        MemberInfoPrinter infoPrinter =
                ctx.getBean("infoPrinter", MemberInfoPrinter.class);


        RegisterRequest regReq = new RegisterRequest();
        regReq.setEmail("nekisse@nekisse.com");
        regReq.setName("이선호");
        regReq.setPassword("aaaa");
        regReq.setConfirmPassword("aaaa");
        regSvc.regist(regReq);

        infoPrinter.printMemberInfo("nekisse@nekisse.com");
    }

}
