package tutorial2.referenceDI;

public class Class_Y 
{
	private int varY;

	public int getVarY() {
		return varY;
	}

	public void setVarY(int varY) {
		this.varY = varY;
	}
	
	public void display()
	{
		System.out.println("This Method Is Defined In Class Y and values is : "+varY);
	}
	
	public String toString()
	{
		return "Class Y [ value of variable is : "+varY+" ]";
	}
	
}
