package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���"); // hashset�� �ߺ��� �����������
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator(); // set�� iterator�� �̿��� ��ȸ��
		
		while(ir.hasNext()) { //���� element�� �ִ°�
			String str = ir.next(); // ������ ������
			System.out.println(str);
		}
	}

}
