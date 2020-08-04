package chapter12_stream.travel;

public class Customer implements Comparable<Customer> {
	private String customerName;
	private int age;
	private int money;
	
	public Customer(String customerName, int age, int money) {
		this.customerName = customerName;
		this.age = age;
		this.money = money;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public String toString() {
		return customerName +", "+ age +", "+money;
	}

	@Override
	public int compareTo(Customer customer) {
		return (customer.age - this.age);
	}
}
