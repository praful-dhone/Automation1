package spring.bean.factory.messagesource;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	private Point pointA;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getPointA() {
		return pointA;
	}
	
	@Resource(name="points")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw(){
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Circle", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {pointA.getX(), pointA.getY()}, "Default Circle", null));
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
