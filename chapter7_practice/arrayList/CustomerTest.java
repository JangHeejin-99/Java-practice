package chapter7_practice.arrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerS1 = new Customer(10010, "김철수");
		Customer customerS2 = new Customer(10020, "김영희");
		
		Customer customerG1 = new GoldCustomer(10030, "이수민");
		Customer customerG2 = new GoldCustomer(10040, "최민수");
		
		Customer customerV1 = new VIPCustomer(10050, "장희진", 2210);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(customerS1);
		customerList.add(customerS2);
		customerList.add(customerG1);
		customerList.add(customerG2);
		customerList.add(customerV1);
		
		System.out.println("==============고객 정보 출력=================");
		for(Customer customer : customerList ) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println();
		
		int price = 10000;
		System.out.println("=============할인률 및 포인트 계산===============");
		for(Customer customer : customerList ) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.customerName+"님은 "+cost+"원을 지불하셨습니다.");
			System.out.println(customer.customerName+"님은 "+customer.bonusPoint+"포인트가 적립되었습니다.");
			System.out.println("--------------------------------------------");
		}
		
		
	}

}
