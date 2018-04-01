package spring.bean.factory.injectingobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle triangle = (Triangle) context.getBean("t1");
		triangle.draw();
	}

}
