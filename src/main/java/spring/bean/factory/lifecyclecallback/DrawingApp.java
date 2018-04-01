package spring.bean.factory.lifecyclecallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
		//context.registerShutdownHook();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}

}

