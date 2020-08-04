package chapter12_stream.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;


public class TravelTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer("이순신", 40, 100);
		Customer customerKim = new Customer("김유신", 20, 100);
		Customer customerHong = new Customer("홍길동", 13, 50);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		Stream<Customer> stream = customerList.stream();
		
		System.out.println(customerList);
		
		System.out.print("고객 명단 리스트: ");
		customerList.stream().map(s->s.getCustomerName()).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		int total = customerList.stream().mapToInt(s->s.getMoney()).sum();
		System.out.println("여행의 총 비용: "+ total);
		
		System.out.print("20세 이상인 고객: ");
		customerList.stream().filter(s->s.getAge() >= 20).map(c->c.getCustomerName()).sorted().forEach(s->System.out.print(s+" "));
	}

}
