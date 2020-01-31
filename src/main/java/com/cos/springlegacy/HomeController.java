package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;

//http://localhost:8080/
// Controller 어노테이션은 페이지를 리턴하는 어노테이션이다.
@Controller
public class HomeController {
	//네이밍 규칙: 함수명은 주소이름과 동일하게
	/*
	 * //1. 데이터 전달 -쿼리스트링 , Form데이터, Json
	 * //2. 데이터 받기 -쿼리스트링 , Form데이터, Json
	 * //3. Pathvariable 사용해보기
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//리턴하는 순간 컨트롤러 어노테이션이 있는 클래스에서 함수가 return하는 순간 
		//ViewResolver가 관여하여 prefix와 suffix를 만들어서 
		//페이지를 return 해준다. 
		
		//데이터 request에 담아서 다음페이지에 전달 => model에 담으면 되는 것으로 정해놈
		String username = "ssar";
		model.addAttribute("username",username); //스트링 - key  오브젝트 - value 
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) { // QuesryString, x-www-formulencoded 만 받을 수 있다. 
		//리턴하는 순간 컨트롤러 어노테이션이 있는 클래스에서 함수가 return하는 순간 
		//ViewResolver가 관여하여 prefix와 suffix를 만들어서 
		//페이지를 return 해준다. 
		System.out.println(id);
		System.out.println(pw);
		
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		return "hello";
	}
	
	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public String goodbye(RequestInfoDto requestInfoDto) {
		//리턴하는 순간 컨트롤러 어노테이션이 있는 클래스에서 함수가 return하는 순간 
		//ViewResolver가 관여하여 prefix와 suffix를 만들어서 
		//페이지를 return 해준다. 
		System.out.println(requestInfoDto.getAddr());
		System.out.println(requestInfoDto.getHobby());
		return "goodbye";
	}
	
}
