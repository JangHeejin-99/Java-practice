package chapter5_practice.cooperation;

public class BeanCoffee {
	int price;
	
	public String getMenu(int price) {
		String message = null;
		this.price += price;
		
		if (price == Menu.BeanAmericano) {
			message = "��ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.";
		}
		else if (price == Menu.BeanLatte) {
			message = "��ٹ濡�� �󶼸� �縶�̽��ϴ�.";
		}
		else {
			message = "�߸��ֹ��ϼ̽��ϴ�.";
		}
		return message;
	}
}