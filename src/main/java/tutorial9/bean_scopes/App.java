package tutorial9.bean_scopes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("tutorial9/bean_scopes/Config.xml");
		
		ComponentAnnotationClass cacObj1 = appContext.getBean(ComponentAnnotationClass.class);
		ComponentAnnotationClass cacObj2 = appContext.getBean(ComponentAnnotationClass.class);
		
		System.out.println("HashCode of : "+cacObj1.getClass()+" Is : "+cacObj1.hashCode()+" For 1st object");
		System.out.println("HashCode of : "+cacObj2.getClass()+" Is : "+cacObj2.hashCode()+" For 2nd object");
		System.out.println("************************************** \n");
		
		ComponentClassWithScopeAnnotation ccsaObj1 = appContext.getBean(ComponentClassWithScopeAnnotation.class);
		ComponentClassWithScopeAnnotation ccsaObj2 = appContext.getBean(ComponentClassWithScopeAnnotation.class);
		
		System.out.println("************************************** \n");
		System.out.println("HashCode of : "+ccsaObj1.getClass()+" Is : "+ccsaObj1.hashCode()+" For 1st object");	
		System.out.println("HashCode of : "+ccsaObj2.getClass()+" Is : "+ccsaObj2.hashCode()+" For 2nd object");	
		
		System.out.println("************************************** \n");
		XMLConfigClass xmlcObj1 = appContext.getBean("XMLConfig",XMLConfigClass.class);
		XMLConfigClass xmlcObj2 = appContext.getBean("XMLConfig",XMLConfigClass.class);
		
		System.out.println("HashCode of : "+xmlcObj1.getClass()+" Is : "+xmlcObj1.hashCode()+" For 1st Object");	
		System.out.println("HashCode of : "+xmlcObj2.getClass()+" Is : "+xmlcObj2.hashCode()+" For 2nd Object");	
	
		appContext.close();
	}

}
