package com.clustering.project.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 업로드 파일의 유효성을 체크하기 위한 클래스이다.
 * 
 */
@Component
public class FileUtil {

	@Autowired
	private CommonUtil commonUtil;
	
    /**
     * 생성자
     */
    public FileUtil() {
        //default Constructor
    }

    /**
     * 유효하지 않은 파일 확장자 체크
     * 
     * @param fileExtName 파일 확장자명
     * @return 유효하지 않은 파일 여부
     */
    public static boolean checkFileExt(String fileExtName) {
/*        StringTokenizer token = new StringTokenizer(ConfigManager.getProperty("ilogen.deny.file.ext").replaceAll(" ",
                                                                                                                 ""),
                                                    ",");

        while (token.hasMoreElements()) {

            // 파일 업로드 확장자 체크
            if (FileUtil.getFileExtention(fileExtName).contains(token.nextToken())) {

                return false;
            }
        }
*/        return true;
    }

    /**
     * 유효한 파일 확장자 체크
     * 
     * @param fileExtName 파일 확장자명
     * @return 유효하지 않은 파일 여부
     */
    public static boolean checkAllowFileExt(String fileExtName) {
/*        StringTokenizer token = new StringTokenizer(ConfigManager.getProperty("opentok.allow.upload.img.ext")
                                                                 .replaceAll(" ", ""), ",");

        while (token.hasMoreElements()) {

            // 파일 업로드 확장자 체크
            if (FileUtil.getFileExtention(fileExtName).contains(token.nextToken())) {
                return true;
            }
        }
*/        return false;
    }

    /**
     * 파일명을 년월일시를 조합하여 새로 생성한다.
     * 
     * @param fileName 파일명
     * @return 새로운 파일명
     */
    public static String getNewFileName(String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
        return fileName.substring(0, fileName.lastIndexOf(".")) + "_" + dateFormat.format(System.currentTimeMillis());
    }

    /**
     * 파일명을 년월일시를 조합하여 새로 생성한다. (확장자 없는 경우)
     * 
     * @param fileName 파일명
     * @return 새로운 파일명
     */
    public static String getNewFileNameNotExt(String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
        return fileName + "_" + dateFormat.format(System.currentTimeMillis());
    }

    /**
     * 파일의 확장자를 추출한다.
     * 
     * @param fileName 파일명
     * @return 파일의 확장자명
     */
    public static String getFileExtention(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
    
	public Object setMultipartList(MultipartHttpServletRequest multipartRequest) {
		Map<Object, Object> fileMap = null;
		List<Object> fileList = new ArrayList<Object>();

		int attachFileSize = 500000;
		String filePath = "";

		String filePathRoot = "C:\\sts-bundle\\Downloads\\";
//		System.getProperty( "catalina.base" ) C:\sts-bundle\pivotal-tc-server-developer-3.2.9.RELEASE\base-instance
/*		this.getClass().getClassLoader().getResource("").getPath();
		String fullPath = URLDecoder.decode(path, "UTF-8");
		String pathArr[] = fullPath.split("/WEB-INF/classes/");
*/		
		String filePathSub = "";
		filePath = filePathRoot + filePathSub;

		MultipartFile multiFile = null;

		Iterator<String> multiFileList = multipartRequest.getFileNames();

		while (multiFileList.hasNext()) {
			fileMap = new HashMap<Object, Object>();

			String fileName = multiFileList.next();

			multiFile = multipartRequest.getFile(fileName);

			int compareSize = (int) multiFile.getSize();
			if(compareSize > 0) {
				// limit file size
				if (multiFile.getSize() > attachFileSize) {
	//				return WebArgumentResolver.UNRESOLVED;
				}
	
				// original filename (ex. neopets.jpg)
				String originalFileName = multiFile.getOriginalFilename().trim();
	
				if (originalFileName == "" || originalFileName.isEmpty()) {
	//				return WebArgumentResolver.UNRESOLVED;
				}
	
				// convert original filename with FileUtil.java to virtual
				// filename to upload in ftp
				String multiFileName = null;
	
				multiFileName = FileUtil.getNewFileName(originalFileName);
	
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
				} finally {
				}
			}
		}
		return fileList;
	}

	public Object _setMultipartList(MultipartHttpServletRequest multipartRequest) {
		List<Object> fileList = new ArrayList<Object>();
		Iterator<String> multiFileList = multipartRequest.getFileNames();
		while (multiFileList.hasNext()) {
			Map<Object, Object> fileMap = new HashMap<Object, Object>();
			String fileName = multiFileList.next();
			MultipartFile multiFile = multipartRequest.getFile(fileName);
			String multiFileName = FileUtil.getNewFileName(multiFile.getOriginalFilename());
			String attachFileName = "/Users/ohsanghun/Downloads/" + multiFileName;
			// file size (ex. 1KByte -> 1048)
			String fileSize = multiFile.getSize() + "";
			// get ContentType (ex. jpg(original file type) -> images/JPEG
			String fileContentType = multiFile.getContentType();
			try {
				// file 저장위치에 이동
				String uniqueSequence = commonUtil.getUniqueSequence();
				multiFile.transferTo(new File(attachFileName));
				fileMap.put("ATTACHFILE_SEQ", uniqueSequence);
				fileMap.put("PHYSICALFILE_NAME", multiFileName);
				fileMap.put("ATTACHFILE_TYPE", fileContentType);
				fileMap.put("ATTACHFILE_SIZE", fileSize);
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
