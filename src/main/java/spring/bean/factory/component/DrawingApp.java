package spring.bean.factory.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext abscontext = new ClassPathXmlApplicationContext("spring10.xml");
		abscontext.registerShutdownHook();
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		Shape shape = (Shape) abscontext.getBean("circle");
		shape.draw();
		
		//shape = (Shape) abscontext.getBean("triangle");
		//shape.draw();
		
	}

}
