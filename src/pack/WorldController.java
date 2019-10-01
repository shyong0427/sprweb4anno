package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class WorldController {
	@RequestMapping({"kbs/world.do", "nice", "kor*"})
	public ModelAndView handleRequest() {
		System.out.println("WorldController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view2");
		modelAndView.addObject("key2", "반가워");
		modelAndView.addObject("key3", "자주");
		return modelAndView;
	}
}