package collection.treemap;

public class MemberTreeMapTest {
	//hashset�� ����� �� ������ ������Ʈ�� �������� ������ �����ϰ� �ִ��� �ľ��ؾ���
	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		// equals�� �����Ǿ��־� ���� �������� �ʾƵ� �ȴ�.
		
		manager.showAllMember();
		
	}

}
