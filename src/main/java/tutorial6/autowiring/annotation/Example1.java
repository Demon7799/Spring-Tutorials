package tutorial6.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Example1 
{
	@Autowired
	private Example2 exObj2;
	private Example3 exObj3;
	private Example4 exObj4;
	
	// Constructors
	
	@Autowired
	public Example1(Example4 exObj4)
	{
		System.out.println("Constructor");
		this.exObj4=exObj4;
	}
	
	
	// Getters & Setters
	
	public Example2 getExObj2() {
		return exObj2;
	}
	public void setExObj2(Example2 exObj2) {
		this.exObj2 = exObj2;
	}
	
	public Example3 getExObj3() {
		return exObj3;
	}
	
	@Autowired
	public void setExObj3(Example3 exObj3) {
		System.out.println("Setter");
		this.exObj3 = exObj3;
	}
	
	public String getPhone()
	{
		return this.exObj4.getPhone();
	}

}
