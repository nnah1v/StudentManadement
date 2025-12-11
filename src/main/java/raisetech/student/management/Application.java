package raisetech.student.management;

import io.micrometer.common.util.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

  @GetMapping("/Natsuka")
  public String hello(){
    return "Hello, Happy";
  }

}

