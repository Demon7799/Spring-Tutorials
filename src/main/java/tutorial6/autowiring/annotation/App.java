package tutorial6.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext= new ClassPathXmlApplicationContext("tutorial6/autowiring/annotation/Config.xml");
	
		Example1 obj=appContext.getBean("Bean",Example1.class);
		
		System.out.println("[ Name : "+obj.getExObj3().getName()+", City : "+obj.getExObj2().getCity()+", Country : "+obj.getExObj2().getCountry()+", Phone : "+obj.getPhone()+" ]");
		
		appContext.close();
	}

}
