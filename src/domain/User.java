package domain;

public class User {
	private String name;
	private Integer age;
	private Car car;
	

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	public User(String name, Integer age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public User() {
	}
	public void init(){
		System.out.println("我是初始化方法。");
	}
	
	public void destroy(){
		System.out.println("我是销毁方法。");
	}
	
	
	

}
