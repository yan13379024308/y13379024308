/**
 * @filename MemberService.java
 * @author lg
 * @date 2019年12月30日 下午12:20:47
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.imti.citic.service;

import com.imti.citic.bean.MemberInfo;

/**
 *@comment 客户业务接口
 *@author lg
 *@date 2019年12月30日 下午12:20:53
 *@modifyUser lg
 *@modifyDate 2019年12月30日 下午12:20:53
 *@modifyDesc  TODO
 *@version TODO
 */
public interface MemberService {
	  /**
	    * @comment 客户注册
	    * @param memb 客户对象
	    * @return true 成功
	    * @version 1.0
	    */
		public boolean regMemb(MemberInfo memb);
}
