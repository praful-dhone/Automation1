package spring.bean.factory.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("In After intialization BeanName : " + beanName);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("In Before intialization BeanName : " + beanName);
		return bean;
	}
}
