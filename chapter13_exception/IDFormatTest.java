package exception;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException { // 이를 사용하는 곳에서  처리를 해라
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다."); // throw는 exception을 발생시키는 것
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요."); // throw는 exception을 발생시키는 것
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		
		String myID = null;
		
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			System.out.println(e);
			// exception 이름(패키지이름.exception이름) / message 
		}
		
		myID = "12345";
		try {
			idTest.setUserID(myID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
	}

}
