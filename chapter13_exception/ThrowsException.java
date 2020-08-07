package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
		Class c = Class.forName(className); // ClassNotFoundException 발생 가능
		return c;
	}
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try { // handling을 해야함
			test.loadClass("b.txt", "java.lang.string");// 여기선 throws 하는 거 아님
			// a.txt, java.lang.String -> 예외 처리 x
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { // 최상위 exception = 다른 exception이 업캐스팅된다
			// 맨 앞에 Exception 을 쓰면 안된다.-> 항상 맨 마지막에 써야한다.
			System.out.println(e);
		}
		
	}

}
