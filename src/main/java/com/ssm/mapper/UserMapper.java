/**
 * 
 */
package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.pojo.User;
/**
 * @author 作者
 * @data 2019年7月31日 
 */
@Mapper
public interface UserMapper {
	List<User> getAllUser() throws Exception;
}
