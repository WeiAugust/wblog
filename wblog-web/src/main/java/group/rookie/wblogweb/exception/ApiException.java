package group.rookie.wblogweb.exception;

import group.rookie.wblogweb.constant.ExceptionCode;
import group.rookie.wblogweb.service.StatusCode;
import lombok.Getter;

/**
 * @ClassName ApiException
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 13:26
 * @Version 1.0
 **/
@Getter
public class ApiException extends RuntimeException {
    private int code;
    private String msg;

    // 手动设置异常
    public ApiException(StatusCode statusCode, String message) {
        // message用于用户设置抛出错误详情，例如：当前价格-5，小于0
        super(message);
        // 状态码
        this.code = statusCode.code();
        // 状态码配套的msg
        this.msg = statusCode.msg();
    }

    // 默认异常使用APP_ERROR状态码
    public ApiException(String message) {
        super(message);
        this.code = ExceptionCode.APP_ERROR.code();
        this.msg = ExceptionCode.APP_ERROR.msg();
    }
}
