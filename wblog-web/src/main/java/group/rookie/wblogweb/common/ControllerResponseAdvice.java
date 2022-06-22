package group.rookie.wblogweb.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import group.rookie.wblogweb.annotation.NotControllerResponseAdvice;
import group.rookie.wblogweb.constant.ResultCode;
import group.rookie.wblogweb.exception.ApiException;
import group.rookie.wblogweb.vo.ResultVo;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @ClassName ControllerResponseAdvice
 * @Description TODO
 * @Author wzg
 * @Date 2022/6/22 11:22
 * @Version 1.0
 **/

@RestControllerAdvice(basePackages = {"group.rookie.wblogweb.controller"})
public class ControllerResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return !methodParameter.getParameterType().isAssignableFrom(ResultVo.class) &&
                methodParameter.hasMethodAnnotation(NotControllerResponseAdvice.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (methodParameter.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(new ResultVo(o));
            } catch (JsonProcessingException e) {
                throw new ApiException(ResultCode.RESPONSE_PACK_ERROR, e.getMessage());
            }
        }
        return new ResultVo(o);
    }
}
