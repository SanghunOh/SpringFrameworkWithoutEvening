package com.clustering.project.component;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.clustering.project.util.CommonUtil;
import com.clustering.project.util.FileUtils;


/**
 * Controller 클래스가 로드되기 전 파라미터 값에 따른 파일 업로드를 수행하기 위한 클래스.
 * 
 * @param <E>
 */
public class CustomizeMapParamResolver implements HandlerMethodArgumentResolver {

	@Autowired
	private CommonUtil commonUtil;

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
		MapParamCollector requestMap = new MapParamCollector();

		if (clazz.equals(MapParamCollector.class)) {

			HttpServletRequest request = webRequest
					.getNativeRequest(HttpServletRequest.class);

			Enumeration<?> enumeration = request.getParameterNames();

			while (enumeration.hasMoreElements()) {
				String key = (String) enumeration.nextElement();
				String[] values = request.getParameterValues(key);
				if (values != null) {
					requestMap.put(key, (values.length > 1) ? values
							: values[0]);
				}
			}

			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				multipartRequest.getFileNames();
				requestMap.put("attachFileList", setMultipartList(multipartRequest));
			}
		}

		return requestMap;
	}

	private List<Object> setMultipartList(
			MultipartHttpServletRequest multipartRequest) {
		Map<Object, Object> fileMap = null;
		List<Object> fileList = new ArrayList<Object>();

		int attachFileSize = 0;
		String filePath = "";

		String filePathRoot = "/Users/ohsanghun/Downloads/";
		String filePathSub = "";
		filePath = filePathRoot + filePathSub;

		MultipartFile multiFile = null;

		Iterator<String> multiFileList = multipartRequest.getFileNames();

		while (multiFileList.hasNext()) {
			fileMap = new HashMap<Object, Object>();

			String fileName = multiFileList.next();

			multiFile = multipartRequest.getFile(fileName);

			// limit file size
			if (multiFile.getSize() > attachFileSize) {
				// return UNRESOLVED;
			}

			// original filename (ex. neopets.jpg)
			String originalFileName = multiFile.getOriginalFilename().trim();

			if (originalFileName == "" || originalFileName.isEmpty()) {
				continue;
			}

			// convert original filename with FileUtils.java to virtual
			// filename to upload in ftp
			String multiFileName = null;

			multiFileName = FileUtils.getNewFileName(originalFileName);

			// file 저장경로 + fileName
			String attachFileName = filePath + multiFileName;

			// file size (ex. 1KByte -> 1048)
			String fileSize = multiFile.getSize() + "";

			// get ContentType (ex. jpg(original file type) -> images/JPEG
			// ...)
			String fileContentType = multiFile.getContentType();

			try {
				// file 저장위치에 이동
				String uniqueSequence = commonUtil.getUniqueSequence();

				multiFile.transferTo(new File(attachFileName));
				fileMap.put("ATTACHFILE_SEQ", uniqueSequence);
				fileMap.put("ORGINALFILE_NAME", originalFileName);
				fileMap.put("PHYSICALFILE_NAME", multiFileName);
				fileMap.put("ATTACHFILE_TYPE", fileContentType);
				fileMap.put("ATTACHFILE_SIZE", fileSize);
				fileMap.put("ATTACHFILE_PATH", filePathSub);
				fileMap.put("THUMBNAIL_NAME", "");
				fileMap.put("ATTACHFILE_HEIGHT", 0);
				fileMap.put("ATTACHFILE_WIDTH", 0);

				fileList.add(fileMap);

			} catch (Exception e) {
				File file = new File(attachFileName);
				file.delete();
				e.printStackTrace();
			}
		}
		return fileList;
	}
}
