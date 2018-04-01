package spring.bean.factory.injectingobject;

public class Triangle {
	
	private Point A;
	private Point B;
	private Point C;
	
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	public void draw(){
		System.out.println("Point A : " + A.getX() + "," + A.getY());
		System.out.println("Point B : " + B.getX() + "," + B.getY());
		System.out.println("Point C : " + C.getX() + "," + C.getY());
	}
}
