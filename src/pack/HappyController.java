package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller @RequestMapping("happy.do")
public class HappyController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView happyGET() {
		ModelAndView modelAndView = new ModelAndView("view3");
		modelAndView.addObject("aaa", "Happy Conn : GET");
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView happyPOST() {
		ModelAndView modelAndView = new ModelAndView("view3");
		modelAndView.addObject("aaa", "Happy Conn : POST");
		
		return modelAndView;
	}
}