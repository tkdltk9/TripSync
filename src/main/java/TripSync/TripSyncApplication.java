package TripSync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class TripSyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripSyncApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "thymeleaf/index";
	}
	
}
