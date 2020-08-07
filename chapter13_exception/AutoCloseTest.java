package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// java9 ���� ����
		/* AutoCloseobj obj = new AutoCloseObj();
		 * try(obj) { ~ }*/
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception(); // exception issue
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
