package tutorial2.referenceDI;

public class Class_X 
{
	private int no;
	private Class_Y obj;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public Class_Y getObj() {
		return obj;
	}
	
	public void setObj(Class_Y obj) {
		this.obj = obj;
	}
	
	public void disply()
	{
		System.out.println("This Method is Defined In Class X and value is : "+no);
	}
	
	public String toString()
	{
		return "Class X [ value of variable is : "+no+"  Object of Y "+obj+" ]";
	}

}
