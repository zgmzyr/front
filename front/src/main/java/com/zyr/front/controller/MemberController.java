package com.zyr.front.controller;

import com.zyr.backservice.commons.entity.Member;
import com.zyr.backservice.commons.service.MemberService;
import com.zyr.backservice.commons.utils.Result;

/**
 * @author guangming.zhou
 * 创建时间: 2014-3-30 下午6:03:30
 */
public class MemberController {

	private MemberService memberServiceClient;
	

	public void setMemberServiceClient(MemberService memberServiceClient) {
		this.memberServiceClient = memberServiceClient;
	}


	public String save() {
		Member member = new Member();
		Result<Member> result = memberServiceClient.save(member);
		
		return null;
	}
}
