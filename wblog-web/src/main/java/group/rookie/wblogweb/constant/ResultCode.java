package group.rookie.wblogweb.constant;

import group.rookie.wblogweb.service.StatusCode;

/**
 * @ClassName ResultCode
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 10:34
 * @Version 1.0
 **/

public enum ResultCode implements StatusCode {
    SUCCESS(1000, "SUCCESS"),
    FAILED(1001, "FAILED"),
    VALIDATE_ERROR(1002, "validate error"),
    RESPONSE_PACK_ERROR(1003, "response pack error"),
    ;

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
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
