package pers.yangs.myweb.common;

/**
 * @author yangs
 */
public class ResponseKit {
    public static final int SUCCESS_CODE = 200;
    public static final int AUTH_FAIL = 401;//认证失败
    public static final int PARAM_ERR = 101;

    public static BaseResponse success(Object object){
        BaseResponse response = new BaseResponse<>(
                true, SUCCESS_CODE, "请求成功", object
        );
        return response;
    }

    public static BaseResponse error(int code, String msg){
        BaseResponse response = new BaseResponse<>(
                false, code, msg, null
        );
        return response;
    }

    public static BaseResponse authFail( String msg){
        return error(AUTH_FAIL, msg);
    }
}
