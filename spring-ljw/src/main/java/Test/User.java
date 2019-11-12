package Test;

import org.springframework.stereotype.Component;

@Component
public class User {
	public User() {
		System.out.println("初始化Spring bean ： User");
	}

	public void test(){
		System.out.println("hello spring");
	}
}