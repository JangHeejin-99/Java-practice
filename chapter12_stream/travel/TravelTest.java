package chapter12_stream.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;


public class TravelTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer("�̼���", 40, 100);
		Customer customerKim = new Customer("������", 20, 100);
		Customer customerHong = new Customer("ȫ�浿", 13, 50);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		Stream<Customer> stream = customerList.stream();
		
		System.out.println(customerList);
		
		System.out.print("�� ��� ����Ʈ: ");
		customerList.stream().map(s->s.getCustomerName()).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		int total = customerList.stream().mapToInt(s->s.getMoney()).sum();
		System.out.println("������ �� ���: "+ total);
		
		System.out.print("20�� �̻��� ��: ");
		customerList.stream().filter(s->s.getAge() >= 20).map(c->c.getCustomerName()).sorted().forEach(s->System.out.print(s+" "));
	}

}
