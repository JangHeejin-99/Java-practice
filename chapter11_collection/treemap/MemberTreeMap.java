package collection.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

	// key = id, value = member
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	// int�� Intger�� ȣȯ�� ������
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) { // key���� hashmap�� �ִ��� Ȯ��
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer>ir = treeMap.keySet().iterator(); 
		// ��� key��ü�� ��ȯ���� -> ��� key ��ü�� ������� ��ȸ�� -> �ߺ� �Ұ����ϹǷ� set���� ��ȯ
		//hashMap.values().iterator(); // vaule�� ��ȯ�� = �ߺ������ϹǷ� collection���� ��ȯ��
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
