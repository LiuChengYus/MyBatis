

import cn.happy.day.service.HappySpring;
import cn.happy.day02.printer.Print;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/28.
 */
public class Test0120170928 {
    @Test
    public void sevice(){
        ApplicationContext txt=new ClassPathXmlApplicationContext("applicationContext.xml");
        Print pri= (Print)txt.getBean("print");
        pri.print();
    }


}
