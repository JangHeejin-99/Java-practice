package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신"); // hashset은 중복을 허용하지않음
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator(); // set은 iterator를 이용해 순회함
		
		while(ir.hasNext()) { //다음 element가 있는가
			String str = ir.next(); // 있으면 가져옴
			System.out.println(str);
		}
	}

}
