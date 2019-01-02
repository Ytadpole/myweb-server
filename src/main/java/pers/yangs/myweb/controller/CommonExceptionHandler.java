package pers.yangs.myweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pers.yangs.myweb.common.BaseResponse;
import pers.yangs.myweb.common.ResponseKit;

/**
 * @author yangs
 */
@RestControllerAdvice
public class CommonExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public BaseResponse error(Exception e){
        log.error("error", e);
        return ResponseKit.authFail("服务器开小差了，请稍后再尝试");
    }

}
