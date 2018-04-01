package spring.bean.factory.messagesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring11.xml");
		//abscontext.registerShutdownHook();
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		shape = (Shape) context.getBean("triangle");
		shape.draw();
		System.out.println(context.getMessage("greetings", null, "Default Hello", null));
	}

}
