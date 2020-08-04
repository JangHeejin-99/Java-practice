package collection.treeset.compartor;

public class MemberTreeSetTest {
	//hashset을 사용할 때 관리할 오브젝트가 논리적으로 같음을 정의하고 있는지 파악해야함
	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
	}

}
