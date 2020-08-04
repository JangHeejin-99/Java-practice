package collection.treeset.compartor;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
 // comparable로 구현이 이미 되어있는 경우 다른 방식으로 정렬하고 싶을때 사용하는 방식입니다.
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)*(-1); // 내림차순
	}
	
}

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
