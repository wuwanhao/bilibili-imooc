package com.imooc.bilibili.service.handler;

import com.imooc.bilibili.domain.Exception.ConditionException;
import com.imooc.bilibili.domain.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 通用全局异常处理
 * 返回自定义json响应
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE) // 此注解表示该全局异常处理器的优先级是最高的
public class CommonGlobalExceptionHandler {


    /**
     * 通用异常返回处理器
     * 可返回conditionException和Exception
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResponse<String> commonExceptionHandler(HttpServletRequest request, Exception e){
        String errorMsg = e.getMessage();
        if (e instanceof ConditionException) {
            String errCode = ((ConditionException) e).getCode();
            return new JsonResponse<>(errCode, errorMsg);
        } else {
            return new JsonResponse<>("500", errorMsg);
        }
    }

}
