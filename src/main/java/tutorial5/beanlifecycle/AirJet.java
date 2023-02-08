package tutorial5.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AirJet 
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
	
	@PostConstruct
	public void start()
	{
		System.out.println("Life Cycle Method : Init AirJet");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Life Cycle Method : Destroy AirJet");
	}
}
