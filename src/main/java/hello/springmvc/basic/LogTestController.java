package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());
    //Lombok 사용시 @Slf4j으로 사용가능

    @RequestMapping("/log-test")
    public String logTest(){
        String test = "Spring Logger Test";
        System.out.println(test);

        //Log Level
        //application.properties에서 로그레벨 설정가능
        //log.trace("trace_test "+ test)=> 사용금지(연산 : trace_test Spring Logger Test})
        //Java에서는 먼저 괄호안의 문자열 연산을 먼저하기 때문에 사용하지 않아도 메모리를 사용하게됨!!

        log.trace("trace_test :{}", test);
        log.debug("debug_test :{}", test);
        log.info("info_test :{}", test);
        log.warn("warn_test :{}", test);
        log.error("error_test :{}", test);
        return "OK";
    }
}
