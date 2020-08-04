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
	// int와 Intger은 호환이 가능함
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) { // key값이 hashmap에 있는지 확인
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer>ir = treeMap.keySet().iterator(); 
		// 모든 key객체를 반환해줌 -> 모든 key 객체를 기반으로 순회함 -> 중복 불가능하므로 set으로 반환
		//hashMap.values().iterator(); // vaule로 반환함 = 중복가능하므로 collection으로 반환함
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
