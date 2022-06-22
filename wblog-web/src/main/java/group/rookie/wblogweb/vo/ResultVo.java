package group.rookie.wblogweb.vo;

import group.rookie.wblogweb.constant.ResultCode;
import group.rookie.wblogweb.service.StatusCode;
import lombok.Data;

/**
 * @ClassName ResultVo
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 10:38
 * @Version 1.0
 **/
@Data
public class ResultVo {

    private int code;
    private String msg;
    private Object data;

    public ResultVo(StatusCode statusCode, Object data) {
        this.code = statusCode.code();
        this.msg = statusCode.msg();
        this.data = data;
    }
    public ResultVo(StatusCode statusCode) {
        this.code = statusCode.code();
        this.msg = statusCode.msg();
    }
    public ResultVo(int code, String message, Object data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }
    public ResultVo(Object data) {
        this.code = ResultCode.SUCCESS.code();
        this.msg = ResultCode.SUCCESS.msg();
        this.data = data;
    }
    public static ResultVo SuccessResultVo(Object data) {
        ResultVo resultVo = new ResultVo(ResultCode.SUCCESS, data);
        return resultVo;
    }
}
