package tutorial5.beanlifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("tutorial5/beanlifecycle/Config.xml");
		
		System.out.println("*************************************");
		
		Car cObj=(Car)appCon.getBean("Bean1");		
		System.out.println("Price Of Car Is : "+cObj.getPrice()+"$");
		
		Bike  bObj=(Bike)appCon.getBean("Bean2");
		System.out.println("Price Of Bike Is : "+bObj.getPrice()+"$");
		
		AirJet aObj=(AirJet)appCon.getBean("Bean3");
		System.out.println("Price Of AirJet Is : "+aObj.getPrice()+"$");
		
		
//		System.out.printf("%-15s%20d%n","Price Of AirJet Is : ",aObj.getPrice());
		
		System.out.println("*************************************");
		appCon.registerShutdownHook();
		
		appCon.close();
	}

}
