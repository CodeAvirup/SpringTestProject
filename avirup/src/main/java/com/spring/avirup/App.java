package com.spring.avirup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	// we can getBean from two interfaces
    	
    	//1. BeanFactory
    	//2. ApplicationContext
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	 
    	// Tyre t = new Tyre(); // when you use new keyword to create a obj it's makes dependency
    	
    	Tyre t = (Tyre) context.getBean("tyre");
    	System.out.println(t);
    	
    	//vechile obj =(vechile) context.getBean("car");
    	// obj.drive();
    	
    	// vechile obj1 =(vechile) context.getBean("bike");
    	// obj1.drive();
    	
    	//Car c = new Car();
        //c.drive();
        
        //Bike b = new Bike();  // If i update any classes we need to change source code
        //b.drive();
        
        
        //vechile V =new Car();
        //vechile D =new Bike();
        //V.drive();
        //D.drive();
        
        
    }
}
