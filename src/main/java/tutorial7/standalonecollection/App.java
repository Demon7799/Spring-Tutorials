package tutorial7.standalonecollection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext= new ClassPathXmlApplicationContext("tutorial7/standalonecollection/Config.xml");
		
		Example1 exObj= appContext.getBean("Bean1",Example1.class);
		
		System.out.println(exObj.getCompanies());
		System.out.println(exObj.getCourses());
		System.out.println(exObj.getProperties());
		
		System.out.println("*******************");
		
		System.out.println(exObj.getCompanies().getClass().getName());
		System.out.println(exObj.getCourses().getClass().getName());

		
		appContext.close();
	}

}
