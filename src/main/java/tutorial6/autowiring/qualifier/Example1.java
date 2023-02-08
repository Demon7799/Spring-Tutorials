package tutorial6.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Example1 
{
	@Autowired
	@Qualifier("Bean1")
	private Example2 exObj;

	public Example2 getExObj() {
		return exObj;
	}

	public void setExObj(Example2 exObj) {
		this.exObj = exObj;
	}
}
