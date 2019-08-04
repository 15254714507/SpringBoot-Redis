/**
 * 
 */
package com.ssm.service;
import java.util.List;
import com.ssm.pojo.User;
/**
 * @author 作者
 * @data 2019年7月31日 
 */
public interface UserService {
		List<User> getAllUser() throws Exception;
}
