package spring.bean.factory.event;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Draw Event occured.";
	}

}
