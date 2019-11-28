package roem.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import roem.springframework.didemo.controllers.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"roem.services", "roem.springframework.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());
 	}

}
