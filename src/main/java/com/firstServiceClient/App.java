package com.firstServiceClient;

import com.otherWebService.HelloService;
import com.otherWebService.HelloServiceService;
import com.otherWebService.Student;

import javax.xml.ws.WebServiceException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        try {
            HelloService helloService = new HelloServiceService().getHelloServicePort();
            String s  = helloService.testService("aabbcc");
            System.out.println(s);
            Student student = new Student();
            student.setAge(13);
            student.setName("aabbcc");
            String s2 = helloService.testStudent(student);
            System.out.println(s2);
        }catch (WebServiceException wse){
            System.out.println("服务未启动");
            wse.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
