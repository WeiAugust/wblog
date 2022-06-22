package group.rookie.wblogweb.constant;

import group.rookie.wblogweb.service.StatusCode;

/**
 * @ClassName ExceptionCode
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 13:23
 * @Version 1.0
 **/
public enum ExceptionCode implements StatusCode {
    APP_ERROR(2000, "业务异常"),
    PRICE_ERROR(2001, "价格异常"),
    ;
    private int code;
    private String msg;

    ExceptionCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    @Override
    public int code() {
        return code;
    }

    @Override
    public String msg() {
        return msg;
    }
}
