package chapter5_practice.hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate dateT = new MyDate(16,7,2020);
		MyDate dateF = new MyDate(100, 5, 2018);
		MyDate dateY = new MyDate(29, 2, 2016); // 윤년
		
		System.out.println("날짜의 유효성: "+dateT.isVaild());
		System.out.println("날짜의 유효성: "+dateF.isVaild());
		System.out.println("날짜의 유효성: "+dateY.isVaild());

	}

}
