package spring.bean.factory.annotations;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}
	
	//@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		for(Point point : points){
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
