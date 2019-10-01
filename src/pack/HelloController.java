package pack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class HelloController {
//	@RequestMapping("hello.do")
//	public ModelAndView handleRequest() { // get, post 요청 모두 접수
	
	@RequestMapping(value = "hello.do", method = RequestMethod.GET)
	public ModelAndView handleRequesthelloget() { // get 요청 접수
		System.out.println("HelloController - GET 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view1");
		modelAndView.addObject("key1", "안녕 - GET");
		return modelAndView;
	}
	
	@RequestMapping(value = "hello.do", method = RequestMethod.POST)
	public ModelAndView handleRequesthellopost() { // post 요청 접수
		System.out.println("HelloController - POST 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view1");
		modelAndView.addObject("key1", "안녕 - POST");
		return modelAndView;
	}
}