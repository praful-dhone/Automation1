package spring.bean.factory.appcontextaware;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){		
		System.out.println("Point A : " + pointA.getX() + "," + pointA.getY());
		System.out.println("Point B : " + pointB.getX() + "," + pointB.getY());
		System.out.println("Point C : " + pointC.getX() + "," + pointC.getY());
	}


	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}


	public void setBeanName(String beanName) {
		System.out.println("Bean Name is : " + beanName);
	}
}