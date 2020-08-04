package collection.hashmap;

public class MemberHashMapTest {
	//hashset을 사용할 때 관리할 오브젝트가 논리적으로 같음을 정의하고 있는지 파악해야함
	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2); 
		// equals가 구현되어있어 따로 구현하지 않아도 된다.
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
