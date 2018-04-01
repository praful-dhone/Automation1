package spring.bean.factory.interfacecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
