package chapter10_practice.date;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate dateT = new MyDate(31, 7, 2020);
		MyDate dateF = new MyDate(31, 7, 2020);
		
		System.out.println(dateT.equals(dateF));
		System.out.println(dateT.hashCode());
		System.out.println(dateF.hashCode());
	}

}
