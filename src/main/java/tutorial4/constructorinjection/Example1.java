package tutorial4.constructorinjection;

public class Example1 
{
	private String name;
	private int id;
//	private String StringID;	
	 Example2 obj;
	
	public Example1(String name,int id,Example2 obj)
	{
		this.name=name;
		this.id=id;
		this.obj=obj;
	}
	
	public Example1(String name,String StringID,Example2 obj)
	{
		this.name=name;
//		this.StringID=StringID;
		this.obj=obj;
	}
	
	
	public void display() 
	{
		obj.display();
		System.out.println("This method is called from Example1 class \n Name : "+name+" Id : "+id);
	}
}
