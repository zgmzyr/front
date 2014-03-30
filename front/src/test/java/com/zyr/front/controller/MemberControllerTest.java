package com.zyr.front.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author guangming.zhou
 * 创建时间: 2014-3-30 下午6:19:39
 */
@ContextConfiguration("classpath:spring-context.xml")
public class MemberControllerTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private MemberController memberController;
	
	@Test
	public void save() {
		memberController.save();
	}
	
	
}
