package chapter5_practice.object2;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 20190721001L;
		order.ID = "abc123";
		order.date = "2019�� 7�� 21��";
		order.name = "ȫ���";
		order.objectNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+order.orderNum);
		System.out.println("�ֹ��� ���̵� : "+order.ID);
		System.out.println("�ֹ� ��¥ : "+order.date);
		System.out.println("�ֹ��� �̸� : "+order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+order.objectNum);
		System.out.println("��� �ּ� : "+order.address);
	}

}
