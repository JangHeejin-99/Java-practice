package chapter5_practice.cooperation;

public class StarCoffee {
	int price;
	
	public String getMenu(int price) {
		String message = null;
		this.price += price;
		
		if (price == Menu.StarAmericano) {
			message = "별다방에서 아메리카노를 사 마셨습니다.";
		}
		else if (price == Menu.StarLatte) {
			message = "별다방에서 라떼를 사마셨습니다.";
		}
		else {
			message = "잘못주문하셨습니다.";
		}
		return message;
	}
}
