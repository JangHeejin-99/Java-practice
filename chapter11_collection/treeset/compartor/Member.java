package collection.treeset.compartor;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName+"회원님의 아이디는"+memberId+"입니다.";
	}
	// equals와 hashcode는 논리적으로 같음을 구현하는 함수
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj; // 다운캐스팅
			return(this.memberId == member.memberId);
		}
		return false;
	}
	@Override // member1이 this, member2가 넘어온 매개변수
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId); // 오름차순
	}
	
	
}
