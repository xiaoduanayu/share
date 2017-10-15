package cn.cjc.share.controller;

import cn.cjc.share.domain.User;
import cn.cjc.share.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author chenjc
 * @since 2017-10-14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        return userService.getUser();
    }

}
