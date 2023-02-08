package tutorial4.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{	
	public static void main(String[] args) 
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("tutorial4/constructorinjection/Config.xml");
		Example1 ex=(Example1)appContext.getBean("bean2");
		
		System.out.print("\t****************************\n \tConstructor Injection Example \n");
		
		ex.display();
		
		
		System.out.println("*****************************");
		System.out.println("Direct Calling the method of Example2 Class \n Name : "+ex.obj.name);
		ex.obj.display();
		((AbstractApplicationContext) appContext).close();
	}

}
