/**
 * 
 */
package com.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.redis.UserRedis;
import com.ssm.service.UserService;

/**
 * @author 作者
 * @data 2019年7月31日 
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserRedis userRedis;
	
	@Override
	public List<User> getAllUser() throws Exception {
		String allUser = null;
		if(( allUser =userRedis.get("AllUser")) == null) { //如果缓存中不存在，就走mybatis
			try {
				List<User> list = userMapper.getAllUser();
				userRedis.set("AllUser", JSONObject.toJSONString(list), 50000);
				
				return list;
			} catch (Exception e) {
				 TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
		}else { //缓存中存在，缓存中的JSON转成List对象
			return  (List<User>) JSONObject.parseObject(allUser, new TypeReference<List<User>>() {});
		}
		return null;
	}
	
}
