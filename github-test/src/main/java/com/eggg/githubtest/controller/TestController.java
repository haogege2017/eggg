package com.eggg.githubtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能详细描述〉
 *
 * @author 18041609
 * @date 2021/4/7
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello world222222";
    }

    @GetMapping("/test1")
    public String test1() {
        return "hello world11111122222233333";
    }

}
