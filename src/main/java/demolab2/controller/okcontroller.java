package demolab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b1")
public class okcontroller {
	@RequestMapping("/ok")
	public String ok() {
		return "ok";
	}
	@RequestMapping("/ok1")
	public String m1 () {
		return "ok";
	}
	@RequestMapping("/ok1")
	public String m2 () {
		return "ok";
	}
	@RequestMapping("/")
	public String m3 () {
		return "ok";
	}
}
