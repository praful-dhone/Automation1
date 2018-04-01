package spring.bean.factory.interfacecode;

import java.util.List;

public class Circle implements Shape{

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		for(Point point : points){
			System.out.println("Points " + point.getX() + "," + point.getY());
		}
	}
}
