/**
 * @filename MenberController.java
 * @author lg
 * @date 2019年12月30日 上午11:08:16
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.imti.citic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.citic.bean.MemberInfo;
import com.imti.citic.service.MemberService;
/**
 *@comment 客户业务管理控制类
 *@author lg
 *@date 2019年12月30日 上午11:09:46
 *@modifyUser lg
 *@modifyDate 2019年12月30日 上午11:09:46
 *@modifyDesc  TODO
 *@version TODO
 */
@Controller
public class MemberController {
	//注入service接口
	@Autowired
	MemberService memberService;
	/**
	 * @comment  登录跳转
	 * @return
	 * @version 1.0
	 */
	@RequestMapping("/tologin")
	public String tologin () {
		return "login";
	}
	/**
	 * @comment 注册跳转
	 * @return
	 * @version 1.0
	 */
	@RequestMapping("/toreg")
	public String toreg () {
		return "register";
	}
	/**
	 * @comment  客户注册
	 * @param memb
	 * @return
	 * @version 1.0
	 */
	@RequestMapping("/reg")
	@ResponseBody
	public String reg (MemberInfo memb,HttpServletRequest req) {
		//获取验证码
		String code=req.getSession().getAttribute("rand01")+"";
		if(!code.equals(memb.getValidateCode())){
			//验证码错误
			return "-1";
		}else{
			boolean f=memberService.regMemb(memb);
			if(f){//注册成功
				return "1";
			}else{//注册失败
				return "0";
			}
		}
	}
}
