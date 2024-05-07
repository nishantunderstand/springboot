package restfulWebServicesBy28Minutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * {@link HelloWorldController}
 * You cannot linked to Different project.
 * That is the limitation
 */
@RestController
public class HelloController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Testing Wiill it work or not";
	}
}
