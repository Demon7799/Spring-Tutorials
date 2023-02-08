package tutorial5.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bike implements InitializingBean,DisposableBean
{
	private int price;

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public void afterPropertiesSet()
	{
		System.out.println("Life Cycle Method : Init Bike");
	}
	
	public void destroy()
	{
		System.out.println("Life Cycle Method : Destroy Bike");
	}
	
	
}
