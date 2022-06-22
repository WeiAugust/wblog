package group.rookie.wblogweb.common;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import group.rookie.wblogweb.constant.ResultCode;
import group.rookie.wblogweb.exception.ApiException;
import group.rookie.wblogweb.vo.ResultVo;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



/**
 * @ClassName ControllerExceptionAdvice
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 11:17
 * @Version 1.0
 **/

@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler({BindException.class})
    public ResultVo methodArgumentNotValidExceptionHandler(BindException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
    }

    public ResultVo apiExceptionHandler(ApiException e) {
        return new ResultVo(e.getCode(), e.getMsg(), e.getMessage());
    }
}
