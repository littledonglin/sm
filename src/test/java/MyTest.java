import com.dolien.mapper.UserMapper;
import com.dolien.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class MyTest {

    @Test
    public void test() throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> list = userMapper.selectAll();
        System.out.println(list);

    }

}
