package tutorial1.dependencyinjection;

public class Person 
{
	private String name;
	private String address;
	
	//   ***   SETTER METHODS   ***
//	
	public void setName(String name)
	{
		System.out.println("Setter Method");
		this.name=name;
	}
	
	public void setAddress(String address)
	{
		System.out.println("Setter Method");
		this.address=address;
	}
	
	//   ***   GETTER METHODS   ***
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	//   ***   CONSTRUCTORS   ***
	
	public Person()
	{
		super();
	}
	
	public Person(String name,String address)
	{
//		super();
		System.out.println("*********Into Constructor*********");
		this.name=name;
		this.address=address;
	}
	
	@Override
	public String toString()
	{
		return "Name : "+name+", Address : "+address+" ";
	}
}
