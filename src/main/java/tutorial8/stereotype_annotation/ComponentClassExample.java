package tutorial8.stereotype_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentClassExample 
{
	@Value("Minato Namikaze")
	private String name;
	
	@Value("Naruto")
	private String series;
	
	@Value("Fourth Hokage")
	private String power;
	
	
	//we can inject values by using id of a bean
	@Value("#{powerSkills}")
	private List<String> skills;
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
	public String toString()
	{
		return " Name : "+getName()+"\n Power : "+getPower()+"\n Series : "+getSeries()+"\n Skills : "+getSkills();
	}
	
}
