package tutorial1.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("tutorial1/dependencyinjection/Config.xml");
		
		Person personObject=(Person)appContext.getBean("ExampleBean1");
		
		Person personObject2=(Person)appContext.getBean("ExampleBean2");
		
		Person personObject3=(Person)appContext.getBean("ExampleBean3");
		
		System.out.println("************************************");
		//To Print the class name
		System.out.println("Class Name : "+personObject.getClass());
		
		
		//Values get by Getter Methods and XML File is used to set the values in Setter Methods
		System.out.println("Get Name By Getter Methods : "+personObject2.getName());
		System.out.println("Get Address By Getter Methods : "+personObject2.getAddress());
		
		System.out.println("************************************");
		
		//By Constructors
		//we overrided the toString() method to print the values in the personObject otherwise it will print reference of the object
		System.out.println("Get BY Constructor: "+personObject);
		
		System.out.println("************************************");		

		//Bean 3
		System.out.println("Get Name By Getter Methods : "+personObject3.getName());
		System.out.println("Get Address By Getter Methods : "+personObject3.getAddress());
		
		System.out.println("************************************");
		
		((AbstractApplicationContext) appContext).close();
	}

}
