package com.db.employeemanagementsystem.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.dao.LoginDAOImpl;

class LoginServiceImplTest {

	@Test
	void testAuthenticate() {
		LoginBean loginBean=new LoginBean("admin","root");
		Assertions.assertEquals(new LoginServiceImpl().authenticate(loginBean), true,"authentication of username and password");


	}

}
