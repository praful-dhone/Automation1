package spring.bean.factory.lifecyclecallback;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	

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
	
	public void myInit(){
		System.out.println("myInit called");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy called");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Circle: Initializing Bean method init called after properties set.");
		
	}


	public void destroy() throws Exception {
		System.out.println("Circle: Cleaning the beans using disposable bean");
		
	}
}
