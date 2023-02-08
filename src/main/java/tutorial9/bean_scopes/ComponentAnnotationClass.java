package tutorial9.bean_scopes;

import org.springframework.stereotype.Component;

@Component
public class ComponentAnnotationClass 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
