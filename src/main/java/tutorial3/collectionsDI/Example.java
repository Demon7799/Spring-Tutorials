package tutorial3.collectionsDI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example 
{
	private String studentName;
	private Set<String> studentContacts;
	private List<String> studentAddresses;
	private Map<String, Integer> courseDuration;
	
	
	//   ***     Setters   ***
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public void setStudentContatcs(Set<String> studentContacts)
	{
		this.studentContacts=studentContacts;
	}
	
	public void setStudentAddresses(List<String> studentAdress)
	{
		this.studentAddresses=studentAdress;
	}
	
	public void setCourseDuration(Map<String, Integer> courseDuration)
	{
		this.courseDuration=courseDuration;
	}
	
	//   ***    Getters  ***
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public List<String> getStudentAddresses()
	{
		return studentAddresses;
	}
	
	public Set<String> getStudentContatcs()
	{
		return studentContacts;
	}
	
	public Map<String, Integer> getCourseDuration()
	{
		return courseDuration;
	}
	
	public Example() {}
}
