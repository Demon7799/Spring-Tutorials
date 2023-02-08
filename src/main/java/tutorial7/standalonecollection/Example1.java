package tutorial7.standalonecollection;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Example1 
{
	private List<String> companies;
	private HashMap<String, Integer> courses;
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	@Autowired
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public HashMap<String, Integer> getCourses() {
		return courses;
	}

	@Autowired
	public void setCourses(HashMap<String, Integer> courses) {
		this.courses = courses;
	}

	public List<String> getCompanies() {
		return companies;
	}

	@Autowired
	public void setCompanies(List<String> companies) {
		this.companies = companies;
	}

	
}
