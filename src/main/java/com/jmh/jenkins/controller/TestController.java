package com.jmh.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by jiangmenghui
 * @version [版本号, 2019/5/13]
 * @Classname TestController
 * @Description TODO
 * @Date 2019/5/13
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "hello jenkins";
    }
}
