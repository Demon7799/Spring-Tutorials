package tutorial4.constructorinjectonambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("tutorial4/constructorinjectonambiguity/Config.xml");
		
		Addition ad=(Addition)appContext.getBean("Example1");
		
		ad.doSum();
		((AbstractApplicationContext) appContext).close();
	}

}
