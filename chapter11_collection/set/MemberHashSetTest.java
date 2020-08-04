package collection.set;

public class MemberHashSetTest {
	//hashset을 사용할 때 관리할 오브젝트가 논리적으로 같음을 정의하고 있는지 파악해야함
	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.deleteMember(100);
		manager.showAllMember();
	}

}
