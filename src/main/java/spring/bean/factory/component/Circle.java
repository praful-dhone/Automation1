package spring.bean.factory.component;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	private List<Point> centre;

	public List<Point> getPoints() {
		return centre;
	}
	
	//@Required
	//@Autowired
	//@Qualifier("circleRelated")
	@Resource
	public void setCentre(List<Point> centre) {
		this.centre = centre;
	}
	
	public void draw(){
		for(Point point : centre){
			System.out.println("Points " + point.getX() + "," + point.getY());
		}
	}
	
	@PostConstruct
	public void intializeCircle(){
		System.out.println("Called intializeCircle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Called destroyCircle");
	}
}
