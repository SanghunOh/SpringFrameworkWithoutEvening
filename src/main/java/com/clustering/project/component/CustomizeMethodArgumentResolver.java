package com.clustering.project.component;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.clustering.project.util.FileUtil;


/**
 * Controller 클래스가 로드되기 전 파라미터 값에 따른 파일 업로드를 수행하기 위한 클래스.
 * 
 * @param <E>
 */
public class CustomizeMethodArgumentResolver implements HandlerMethodArgumentResolver {

	@Autowired
	private FileUtil fileUtil;

	@Override
	public boolean supportsParameter(MethodParameter methodParameter) {
		// Auto-generated method stub
		return MapParamCollector.class.isAssignableFrom(methodParameter
				.getParameterType());
	}

	@Override
	public Object resolveArgument(MethodParameter methodParameter,
			ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
			WebDataBinderFactory binderFactory) throws Exception {
		Class<?> clazz = methodParameter.getParameterType();
		String paramName = methodParameter.getParameterName();

        if (clazz.equals(MapParamCollector.class)) {
        	MapParamCollector requestMap = new MapParamCollector();
//			HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
            HttpServletRequest request = (HttpServletRequest)webRequest.getNativeRequest();
            Enumeration<?> enumeration = request.getParameterNames();

            while (enumeration.hasMoreElements()) {
                String key = (String)enumeration.nextElement();
                String[] values = request.getParameterValues(key);
                if (values != null) {
                    requestMap.put(key, (values.length > 1) ? values : values[0]);
                }
            }

			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				multipartRequest.getFileNames();
				requestMap.put("attachFileList", (List<Object>)fileUtil.setMultipartList(multipartRequest));
			}
            return requestMap;
        }
        return WebArgumentResolver.UNRESOLVED;
	}
}
