package com.gyojincompany.study130;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/")//단순하게 login.jsp를 실행시켜주는 역할만 함
	public String login() {
		
		return "login";
	}
	
	// 1번 문제 model 로 전달
//	@RequestMapping(value = "/checkId")//단순하게 login.jsp를 실행시켜주는 역할만 함
//	public String checkId(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("id");
//		String mpw = request.getParameter("pw");
//		
//		if((mid.equals("admin")) && (mpw.equals("12345"))) {
//			model.addAttribute("usercheck", "관리자");			
//		} else if((mid.equals("user")) && (mpw.equals("12345"))) {
//			model.addAttribute("usercheck", "사용자");	
//		} else {
//			model.addAttribute("usercheck", "비회원");
//		}
//		
//		return "idCheck";
//	}
	
	//2번 문제 view 이름으로 전달
	@RequestMapping(value = "/checkId")//단순하게 login.jsp를 실행시켜주는 역할만 함
	public String checkId(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("id");
		String mpw = request.getParameter("pw");
		
		if((mid.equals("admin")) && (mpw.equals("12345"))) {
			model.addAttribute("id", mid);
			return "admin";			
		} else if((mid.equals("user")) && (mpw.equals("12345"))) {
			model.addAttribute("id", mid);
			return "user";	
		} else {
			model.addAttribute("id", mid);
			return "noMember";
		}	
		
	}
	
}
