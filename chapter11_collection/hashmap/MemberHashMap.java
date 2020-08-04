package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	// key = id, value = member
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	// int�� Intger�� ȣȯ�� ������
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // key���� hashmap�� �ִ��� Ȯ��
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer>ir = hashMap.keySet().iterator(); 
		// ��� key��ü�� ��ȯ���� -> ��� key ��ü�� ������� ��ȸ�� -> �ߺ� �Ұ����ϹǷ� set���� ��ȯ
		//hashMap.values().iterator(); // vaule�� ��ȯ�� = �ߺ������ϹǷ� collection���� ��ȯ��
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
