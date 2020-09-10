package hh.swd20.demoprojekti.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// Shift +ctrl + O päivittää importit minttiin

@Controller
@ResponseBody
public class HelloController {
	
	//hello on URL:n endpoint
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping("/hi")
	public String sayHi(@RequestParam(name = "firstname") String firstname, @RequestParam(name = "lastname") String lastname) {
		return "Hi" + firstname + " " + lastname + " !" ;
	}
}
