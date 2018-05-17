package test;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springPrinter.work.yuegege.printer.Print;

import domain.Car;
import domain.CollectionBean;
import domain.User;

public class demo {
/*	private User user2;
	
	
	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}*/

	/*public static void main(String[] args) {
		//1.创建容器对象
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.向容器要对象
		User user = (User) applicationContext.getBean("user"); //参数  bean的名字
		//3.打印user
		System.out.println(user);
	}*/
	@Test
	public void test1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User) applicationContext.getBean("user");
		System.out.println(user);
	}
		
		
	
	
	
	@Test
	public void test2(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user2=(User) applicationContext.getBean("user1");
		System.out.println(user2);
		
	}
	
	@Test
	public void test3(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car=(Car) applicationContext.getBean("car");
		System.out.println(car);
		
	}
	
	@Test
	public void test4(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean co=(CollectionBean) applicationContext.getBean("cb");
		System.out.println(co);
		
	}
	
	@Test
	public void test5(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User) applicationContext.getBean("user2");
		System.out.println(user);
		
	}
	@Test
	public void test6(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User) applicationContext.getBean("user3");
		System.out.println(user);
		
	}
	
	
	

	@Test
	public void testprint(){
		//创建容器对象
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//向容器要对象
		Print printer=(Print) applicationContext.getBean("printer");
		printer.print();
	}

}
