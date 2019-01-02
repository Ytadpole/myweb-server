package pers.yangs.myweb.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.yangs.myweb.annotations.UserLoginToken;
import pers.yangs.myweb.common.BaseResponse;
import pers.yangs.myweb.common.ResponseKit;
import pers.yangs.myweb.entity.User;
import pers.yangs.myweb.entity.VO.LoginVo;
import pers.yangs.myweb.service.IUserService;
import pers.yangs.myweb.utils.JWTUtils;

/**
 * 用户
 *
 * @author yangs
 * @since 2019-01-02
 */
@RestController
@RequestMapping("user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @PostMapping("login")
    public BaseResponse login(@RequestBody User user){
        log.info("用户请求登录获取Token");
        String userName = user.getUserName();
        String password = user.getPassword();

        User userModel = userService.getUserByName(userName);

        if( null == userModel){
            return ResponseKit.authFail("用户不存在");
        }

        if(!password.equals(userModel.getPassword())){
            return ResponseKit.authFail("密码错误");
        }

        String token = JWTUtils.generateToken(userModel);
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);
        loginVo.setUser(userModel);

        return ResponseKit.success(loginVo);
    }

    @UserLoginToken
    @GetMapping("getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}

