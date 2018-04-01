package spring.bean.factory.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("childcircle");
		circle.draw();
	}

}
