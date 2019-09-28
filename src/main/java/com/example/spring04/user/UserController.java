package com.example.spring04.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class UserController {

	@GetMapping("/user/info")
	public String getUserInfo(Model model) {
		User user = new User();
		user.setId("minki");
		user.setName("dd");
		user.setEmail("windzxc@naver.com");
		
		model.addAttribute(user);
		return "user";
	}
	
//aaa
	//ㅠㅠㅠ
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello","hello");
		return "hello";
	}
	//아니 왜 로컬에 커밋만 했는데 깃허브에 올라기지???
	//이제는 업데이트를 해봐야겠지?
	//된다
}
