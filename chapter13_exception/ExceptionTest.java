package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		} finally {
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
