package tutorial6.autowiring.qualifier;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext= new ClassPathXmlApplicationContext("tutorial6/autowiring/qualifier/Config.xml");
	
		Example1 obj=appContext.getBean("Bean3",Example1.class);
		
		System.out.println("[ City : "+obj.getExObj().getCity()+", Country : "+obj.getExObj().getCountry()+" ]");
		
		appContext.close();
	}

}
