package com.firstServiceClient;



import com.otherWebService.HelloService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/14.
 */
public class App2 {
    public static void main(String[] args) throws Exception{
        System.out.println(123);
        URL url = new URL("http://localhost:8889/HelloService/?wsdl");
        QName qName = new QName("http://xueyou.xueyoucto.com/","HelloServiceService");
        try {
            Service service = Service.create(url,qName);
            HelloService helloService = service.getPort(HelloService.class);
            String s = helloService.testService("11223344");
            System.out.println(s);
        }catch (WebServiceException wse){
            System.out.println("服务未启动");
            wse.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
