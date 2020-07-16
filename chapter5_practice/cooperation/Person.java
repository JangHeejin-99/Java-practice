package chapter5_practice.cooperation;

public class Person {
	String name;
	int money;
	String message = null;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee star, int money) {
		message = star.getMenu(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name+"´ÔÀÌ "+message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bean, int money) {
		message = bean.getMenu(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name+"´ÔÀÌ "+message);
		}
	}
}
