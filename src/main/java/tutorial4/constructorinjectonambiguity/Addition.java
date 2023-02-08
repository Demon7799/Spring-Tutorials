package tutorial4.constructorinjectonambiguity;

public class Addition 
{
	private int a;
	private int b;
	
	public Addition(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Double Constructor");
	}
	
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		System.out.println("Integer Constructor");
	}
	
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String Contructor");
	}
	
	
	
	public void doSum()
	{
		System.out.println("Sum is : "+(a+b));
	}
}
