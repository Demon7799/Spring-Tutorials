package tutorial4.constructorinjection;

public class Example2 
{
	String name;
	
	public Example2( String name)
	{
		this.name=name;
	}
	
	public void display() 
	{
		System.out.println("\n This method is called from Example2 class \n Name : "+name+"\n");
	}
}
