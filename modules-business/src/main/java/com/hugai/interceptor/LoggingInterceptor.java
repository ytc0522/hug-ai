package com.hugai.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * * @Author: Martin
 * * @Date    2024/4/19 11:29
 * * @Description 💧加油，别放弃！
 **/

@Slf4j
public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        String queryString = request.getQueryString();
        log.info("正在请求:{}", requestURI);
        log.info("queryString:{}", queryString);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
