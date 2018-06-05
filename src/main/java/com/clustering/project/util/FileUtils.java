package com.clustering.project.util;

import java.text.SimpleDateFormat;

/**
 * 업로드 파일의 유효성을 체크하기 위한 클래스이다.
 * 
 */
public class FileUtils {

    /**
     * 생성자
     */
    public FileUtils() {
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
            if (FileUtils.getFileExtention(fileExtName).contains(token.nextToken())) {

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
            if (FileUtils.getFileExtention(fileExtName).contains(token.nextToken())) {
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
}
