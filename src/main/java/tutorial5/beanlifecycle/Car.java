package tutorial5.beanlifecycle;

public class Car 
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
	
	public void start()
	{
		System.out.println("Life Cycle Method : Init Car");
	}
	
	public void die()
	{
		System.out.println("Life Cycle Method : Destory Car");
	}
}
