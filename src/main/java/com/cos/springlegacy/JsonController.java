package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

@Controller
public class JsonController {
	
	//스프링은 form의 name값 혹은 쿼리스트링만 오브젝트로 자동변환! 제이슨은 안해줌,, 겟리더써야함
	@RequestMapping(value="/jsonTest", method= RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonHome(@RequestBody RequestJsonDto requestJsonDto) {
		//리퀘스트 바디의 역할: 버퍼드리더, 
		// 오브젝트로 바꿔야함. //스프링은 폼,쿼리스트링만 변환해줌 //잭슨 라이브러리 받아야 제이슨도 변환해줌
		
		//메소드 앞에 리스폰스바디 적으면 뷰리졸버가 관여못해서 뷰가 아닌 객체로 리턴할 수 있다. 
		// 그리고 잭슨 라이브러리가 객체를 리턴할때 제이슨형태로 바꿔줌
		// 그래서 제이슨으로 주고받고 가능해짐. 해당 프로젝트에서 각각의 오브젝트로 변환해주기만하면됨
		System.out.println(requestJsonDto.getId());
		return requestJsonDto;
	}
	
	//http://localhost:8080/springlegacy/jsonHome/4 
	//http://localhost:8080/springlegacy/jsonHome/안녕
	//등등 다 얘가 호출됨. {num}은 변수이고 페이징할때 많이 씀 
	@RequestMapping(value="/jsonHome/{num}", method= RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		
		System.out.println("num:"+num);
		return "jsonHome";
	}
}
