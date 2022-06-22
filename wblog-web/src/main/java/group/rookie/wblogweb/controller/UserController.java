package group.rookie.wblogweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/19 8:14
 * @Version 1.0
 **/

@RestController
@RequestMapping(value = "/wblog/user/api")
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
