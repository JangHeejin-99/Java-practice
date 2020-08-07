package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		} 
		// close를 하지 않아도 autocloseable이 된다.
	}

}
