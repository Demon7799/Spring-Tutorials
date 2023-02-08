package tutorial8.stereotype_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("tutorial8/stereotype_annotation/Config.xml");
		
		ComponentClassExample object = appContext.getBean(ComponentClassExample.class);
		
		System.out.println(object);
		
		appContext.close();
	}

}