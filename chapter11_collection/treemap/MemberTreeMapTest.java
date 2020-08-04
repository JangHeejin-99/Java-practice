package collection.treemap;

public class MemberTreeMapTest {
	//hashset을 사용할 때 관리할 오브젝트가 논리적으로 같음을 정의하고 있는지 파악해야함
	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		// equals가 구현되어있어 따로 구현하지 않아도 된다.
		
		manager.showAllMember();
		
	}

}
