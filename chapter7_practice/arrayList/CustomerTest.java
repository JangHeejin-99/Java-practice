package chapter7_practice.arrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerS1 = new Customer(10010, "��ö��");
		Customer customerS2 = new Customer(10020, "�迵��");
		
		Customer customerG1 = new GoldCustomer(10030, "�̼���");
		Customer customerG2 = new GoldCustomer(10040, "�ֹμ�");
		
		Customer customerV1 = new VIPCustomer(10050, "������", 2210);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(customerS1);
		customerList.add(customerS2);
		customerList.add(customerG1);
		customerList.add(customerG2);
		customerList.add(customerV1);
		
		System.out.println("==============�� ���� ���=================");
		for(Customer customer : customerList ) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println();
		
		int price = 10000;
		System.out.println("=============���η� �� ����Ʈ ���===============");
		for(Customer customer : customerList ) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.customerName+"���� "+cost+"���� �����ϼ̽��ϴ�.");
			System.out.println(customer.customerName+"���� "+customer.bonusPoint+"����Ʈ�� �����Ǿ����ϴ�.");
			System.out.println("--------------------------------------------");
		}
		
		
	}

}
