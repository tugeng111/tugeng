import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tugeng.model.School;
import com.tugeng.model.User;
import com.tugeng.service.UserService;

public class Test {
	
	@org.junit.Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-mvc.xml"});
		UserService userservice = (UserService)ac.getBean("userService");
		User user = userservice.showUser(1);
		System.out.println(user);
	}

}
