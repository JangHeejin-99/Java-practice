package chapter5_practice.cooperation;

public class CoffeeTest {

	public static void main(String[] args) {

		Person personkim = new Person("������", 10000);
		Person personlee = new Person("���ǰ�", 13000);
		
		StarCoffee star = new StarCoffee();
		BeanCoffee bean = new BeanCoffee();
		
		personkim.buyStarCoffee(star, 4000);
		personlee.buyBeanCoffee(bean, 4500);
	}

}
