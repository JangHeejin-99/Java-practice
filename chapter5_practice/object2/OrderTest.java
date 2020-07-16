package chapter5_practice.object2;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 20190721001L;
		order.ID = "abc123";
		order.date = "2019년 7월 21일";
		order.name = "홍길순";
		order.objectNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+order.orderNum);
		System.out.println("주문자 아이디 : "+order.ID);
		System.out.println("주문 날짜 : "+order.date);
		System.out.println("주문자 이름 : "+order.name);
		System.out.println("주문 상품 번호 : "+order.objectNum);
		System.out.println("배송 주소 : "+order.address);
	}

}
