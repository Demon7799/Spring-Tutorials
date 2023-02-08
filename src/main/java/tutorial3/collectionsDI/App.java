package tutorial3.collectionsDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext appCon=new ClassPathXmlApplicationContext("tutorial3/collectionsDI/Config.xml");
		
		Example exObj=(Example)appCon.getBean("Example1");
		
		System.out.println("Name : "+exObj.getStudentName());
		System.out.println("Adresses : "+exObj.getStudentAddresses());
		System.out.println("Contacts : "+exObj.getStudentContatcs());
		System.out.println("Courses : "+exObj.getCourseDuration());
		((AbstractApplicationContext) appCon).close();
		
	}

}
