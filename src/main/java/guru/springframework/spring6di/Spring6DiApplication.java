package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext runCtx = SpringApplication.run(Spring6DiApplication.class, args);
		MyController controller = runCtx.getBean(MyController.class);

		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
	}

}
