package com.lk.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import com.lk.service.UserFunctionService;

public class TestBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
	private String lname;
	//private CommonTest commonTest;
	private RequestTest requestTest;
	private ResponseTest responseTest;
	private UserFunctionService userFunctionService;
	
	@PostConstruct
	public void init(){
		//commonTest = new CommonTest();
		requestTest = new RequestTest();
		fname = "dimuthu";
		requestTest.setFname(fname);
		boolean haspermission = true;
		responseTest = userFunctionService.findUserLastName(haspermission,requestTest);
		lname = responseTest.getLname();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	/*public CommonTest getCommonTest() {
		return commonTest;
	}

	public void setCommonTest(CommonTest commonTest) {
		this.commonTest = commonTest;
	}*/

	public UserFunctionService getUserFunctionService() {
		return userFunctionService;
	}

	public void setUserFunctionService(UserFunctionService userFunctionService) {
		this.userFunctionService = userFunctionService;
	}
}
