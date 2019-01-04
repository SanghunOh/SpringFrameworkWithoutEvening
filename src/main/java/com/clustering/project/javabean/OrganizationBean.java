/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.javabean;

public class OrganizationBean {
	// 조직 일련번호
	String ORGANIZATION_SEQ;  //(50) NOT NULL COMMENT '조직 일련번호',
	// 명칭
	String NAME;  //(1000) NOT NULL COMMENT '명칭',
	// 대표 전화번호
	String TELEPHONE;  //(40) COMMENT '대표 전화번호',
	// 정렬순서 
	int ORDER_NUMBER;	//decimal COMMENT '순서',
	// 상위 조직 일련번호
	String PARENT_ORGANIZATION_SEQ;  //(50) COMMENT '상위 조직 일련번호',
	// DI Test property
	String DI_SEQ;
	
	public String getORGANIZATION_SEQ() {
		return ORGANIZATION_SEQ;
	}
	public void setORGANIZATION_SEQ(String oRGANIZATION_SEQ) {
		ORGANIZATION_SEQ = oRGANIZATION_SEQ;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getTELEPHONE() {
		return TELEPHONE;
	}
	public void setTELEPHONE(String tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}
	public int getORDER_NUMBER() {
		return ORDER_NUMBER;
	}
	public void setORDER_NUMBER(int oRDER_NUMBER) {
		ORDER_NUMBER = oRDER_NUMBER;
	}
	public String getPARENT_ORGANIZATION_SEQ() {
		return PARENT_ORGANIZATION_SEQ;
	}
	public void setPARENT_ORGANIZATION_SEQ(String pARENT_ORGANIZATION_SEQ) {
		PARENT_ORGANIZATION_SEQ = pARENT_ORGANIZATION_SEQ;
	}

}
