package core;

import base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunyinjie on 2017/10/20.
 */
public class BootStrap {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleBean bean = (SimpleBean) context.getBean("simpleBean");
        bean.send();
        context.close();
        System.out.println("dd");
    }
}
