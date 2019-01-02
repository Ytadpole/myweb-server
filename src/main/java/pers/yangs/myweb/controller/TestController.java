package pers.yangs.myweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangs
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("errorTest")
    public String errorTest() throws Exception {
        throw new Exception("bad");
    }
}
