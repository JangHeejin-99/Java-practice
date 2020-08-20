package stream.inputstream;

import java.io.Console;

public class ConsoleTest {
	// eclipse와는 호한 x, cmd에서 실행해야함
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("비밀번호: ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}
