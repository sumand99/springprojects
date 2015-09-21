/**
 * 
 */
package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author suman
 *
 */
public class App {
	
	public static void main(String a[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("helloBean");
		obj.printName();
		
	

	}

}
