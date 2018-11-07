package com.lk.service;

import java.io.Serializable;

import org.springframework.security.access.prepost.PreAuthorize;

import com.lk.test.CommonTest;
import com.lk.test.RequestTest;
import com.lk.test.ResponseTest;

public interface UserFunctionService extends Serializable{
	
	//public CommonTest findUserLastName(String fname);
	@PreAuthorize("#hasPermission")
	public ResponseTest findUserLastName(boolean hasPermission,RequestTest requestTest);

	public void test();
}	
