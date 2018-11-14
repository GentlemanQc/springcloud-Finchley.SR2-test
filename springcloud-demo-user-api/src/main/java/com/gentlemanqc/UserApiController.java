package com.gentlemanqc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: GentlemanQcc
 * @date: 2018/10/22
 */
@RestController
public class UserApiController {

    @RequestMapping("/info")
    public String testA() throws InterruptedException {
//        Thread.sleep(3000);
        return "hello I am is service User-API"; //测试代码直接返回一个字符串，不再调用service层等等。
    }
}