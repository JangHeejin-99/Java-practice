package collection.treeset.comparable;

public class Member implements Comparable<Member> {
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
	@Override
	public int compareTo(Member member) {
		return this.memberId - member.memberId; //  오름차순
		/* return member.memberId - this.memberId -> 내림차순
		 * or return this.memberId - member.memberId *(-1) -> 내림차순
		 */
		/* 이름으로 정렬하고 싶은 경우 return this.memberName.comparTo(member.getMemberName) */
	}
	
	
}
