package tutorial2.referenceDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("tutorial2/referenceDI/Config.xml");
		
		Class_X x_obj=(Class_X)appContext.getBean("ClassXBean");
		
		//By below line we are accessing the method of Class_X
		x_obj.disply();
		System.out.println("***********************************");
		
		//By below line we are accessing the method of Class_Y by using the Object of Class_X
		x_obj.getObj().display();		
		System.out.println("***********************************");
		
		//By below line we are creating an object of Class_Y using the Object of Class_X and getting the value from Class_Y
		Class_Y y_obj=x_obj.getObj();
		System.out.println("value of a veriable from class Y : "+y_obj.getVarY());
		
		System.out.println("***********************************");
		
		System.out.println(x_obj);
		
		((AbstractApplicationContext) appContext).close();
	}

}
