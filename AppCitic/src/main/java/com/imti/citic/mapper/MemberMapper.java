/**
 * @filename MemberMapper.java
 * @author lg
 * @date 2019年12月30日 下午12:14:33
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.imti.citic.mapper;

import org.apache.ibatis.annotations.Insert;

import com.imti.citic.bean.MemberInfo;

/**
 *@comment 客户映射接口
 *@author lg
 *@date 2019年12月30日 下午12:14:40
 *@modifyUser lg
 *@modifyDate 2019年12月30日 下午12:14:40
 *@modifyDesc  TODO
 *@version TODO
 */
public interface MemberMapper {
   /**
    * @comment 客户注册
    * @param memb 客户对象
    * @return 大于0成功,否则失败
    * @version 1.0
    */
	@Insert("INSERT INTO `member_info`(`phone`,`memb_pwd`,`card_num`) VALUES (#{phone},#{membPwd},#{cardNum})")
	public int regMemb(MemberInfo memb);
}
