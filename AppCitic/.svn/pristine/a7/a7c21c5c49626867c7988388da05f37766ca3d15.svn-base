/**
 * @filename MemberServiceImpl.java
 * @author lg
 * @date 2019年12月30日 下午12:21:34
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.imti.citic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.citic.bean.MemberInfo;
import com.imti.citic.mapper.MemberMapper;
/**
 *@comment 客户业务实现类
 *@author lg
 *@date 2019年12月30日 下午12:24:16
 *@modifyUser lg
 *@modifyDate 2019年12月30日 下午12:24:16
 *@modifyDesc  TODO
 *@version TODO
 */
@Service
public class MemberServiceImpl implements MemberService{
// 注入客户mapper接口
	@Autowired
	MemberMapper memberMapper;
	@Override
	public boolean regMemb(MemberInfo memb) {
		return memberMapper.regMemb(memb)>0;
	}

}
