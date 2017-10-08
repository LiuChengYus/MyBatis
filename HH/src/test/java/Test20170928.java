

import cn.happy.day.service.HappySpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LY on 2017/9/28.
 */
public class Test20170928 {
    @Test
    public void sevice(){
        ApplicationContext txt=new ClassPathXmlApplicationContext("applicationContext.xml");
       HappySpring pring= (HappySpring)txt.getBean("service");
        System.out.println(pring);
    }


}
