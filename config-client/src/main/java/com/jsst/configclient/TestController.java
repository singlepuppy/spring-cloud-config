package com.jsst.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {


    @Value("${tag}")
    String tag;
    @RequestMapping(value = "/hi")
    public String hi(){
        return tag;
    }

//    @RequestMapping(value = "test")
//    public void getTag(){
//        TestDomain testDomain = new TestDomain();
//        testDomain.setId(1);
//        testDomain.setTag("test!!!!!");
//        testDomainService.insert(testDomain);
//    }
}
