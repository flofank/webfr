package ch.fhnw.webfr.hello.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/counter")
public class CounterController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String count(Model model, HttpSession session) {
		int times = session.getAttribute("times") != null ? (int) session.getAttribute("times") : 0;
		times++;
		session.setAttribute("times", times);
		model.addAttribute("count", times);
		return "/count";
	}
}
