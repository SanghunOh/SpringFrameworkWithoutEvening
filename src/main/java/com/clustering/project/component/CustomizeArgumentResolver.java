package com.clustering.project.component;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
/**
 * Controller 클래스가 로드되기 전 파라미터 값에 따라 특정 작업을 수행하기 위한 클래스이다.
 * 
 */
public class CustomizeArgumentResolver implements WebArgumentResolver {

    @Override
    public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {

        Class<?> clazz = methodParameter.getParameterType();
        String paramName = methodParameter.getParameterName();

        if (clazz.equals(Map.class) && paramName.equals("paramArgMap")) {
            Map<String, Object> requestMap = new HashMap<String, Object>();
            HttpServletRequest request = (HttpServletRequest)webRequest.getNativeRequest();
            Enumeration<?> enumeration = request.getParameterNames();

            while (enumeration.hasMoreElements()) {
                String key = (String)enumeration.nextElement();
                String[] values = request.getParameterValues(key);
                if (values != null) {
                    requestMap.put(key, (values.length > 1) ? values : values[0]);
                }
            }

            return requestMap;
        }
        return UNRESOLVED;
    }

}
