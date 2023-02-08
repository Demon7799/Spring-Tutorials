package tutorial6.autowiring;

public class Example1 
{
	private Example2 exObj;

	public Example2 getExObj() {
		return exObj;
	}

	public void setExObj(Example2 exObj) {
		this.exObj = exObj;
	}
}
