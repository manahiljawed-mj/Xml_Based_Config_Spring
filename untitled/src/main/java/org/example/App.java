package org.example;
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
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        Calculator cal=ac.getBean(Calculator.class);
         System.out.println("Value of first is: "+cal.getFirst());
         cal.display();


//        System.out.println("sum is" + cal.add(1,2));
//        System.out.println("Subtract is:"+cal.subtract(1,2));
//        System.out.println("Multiply is:"+cal.multiply(1,2));
//        System.out.println("Divide is:"+cal.divide(1,2));
//        System.out.println( "Hello World!" );
    }
}
