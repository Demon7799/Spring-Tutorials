package tutorial9.bean_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComponentClassWithScopeAnnotation 
{
	private String villainName;

	public String getVillainName() {
		return villainName;
	}

	public void setVillainName(String villainName) {
		this.villainName = villainName;
	}

}
