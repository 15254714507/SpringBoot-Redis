/**
 * 
 */
package com.ssm.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.pojo.User;
import com.ssm.service.UserService;

/**
 * @author 作者
 * @data 2019年8月1日 
 */
@Controller
public class UserController {
		@Autowired
		private UserService userService;
		@RequestMapping("findAll")
		public String findAll(Model model, HttpServletRequest request) throws Exception {
			List<User> list = userService.getAllUser();
			model.addAttribute("list",list);			
			request.getSession().setAttribute("55", "55");

			return "index";
			
		}
}
