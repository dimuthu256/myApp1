package com.lk.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lk.service.UserFunctionService;
import com.lk.test.CommonTest;
import com.lk.test.REST_CONTROLLER_URL;
import com.lk.test.RequestTest;
import com.lk.test.ResponseTest;

@RestController
public class TestRest implements UserFunctionService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lname;
	private String sucesses;
	private CommonTest commonTest;
	private ResponseTest responseTest;
	

	/*@Override
	@RequestMapping(value = "/findUsers", method = RequestMethod.POST)
	public @ResponseBody CommonTest findUserLastName(@RequestBody String fname) {
		if(fname.equals("dimuthu")){
			lname = "Weerarathne";
		}
		else lname = "no found";
		return commonTest;
	}*/
	
	@Override
	@RequestMapping(value = REST_CONTROLLER_URL.FIND_USER_NAME, method = RequestMethod.POST)
	public @ResponseBody ResponseTest findUserLastName(boolean hasPermission,
			@RequestBody RequestTest requestTest) {
		if(requestTest.getFname().equals("dimuthu")){
			//lname = "Weerarathne";
			responseTest.setLname("Weerarathne");
		}
		else responseTest.setLname("no found");
		return responseTest;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public CommonTest getCommonTest() {
		return commonTest;
	}

	public void setCommonTest(CommonTest commonTest) {
		this.commonTest = commonTest;
	}

	public String getSucesses() {
		return sucesses;
	}

	public void setSucesses(String sucesses) {
		this.sucesses = sucesses;
	}

	public ResponseTest getResponseTest() {
		return responseTest;
	}

	public void setResponseTest(ResponseTest responseTest) {
		this.responseTest = responseTest;
	}

	
}
