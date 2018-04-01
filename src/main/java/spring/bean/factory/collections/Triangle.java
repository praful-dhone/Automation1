package spring.bean.factory.collections;

import java.util.List;

public class Triangle {
	
	private List<Point> p1;
	
	public List<Point> getP1() {
		return p1;
	}
	
	public void setP1(List<Point> p1) {
		this.p1 = p1;
	}

	public void draw(){		
		for (Point point : p1){
			System.out.println("Point  :" + point.getX() + "," + point.getY());
		}
	}
}