package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			int i;
			
			while ((i = fis.read()) != -1) { // -1이면 end of file
				// 한 바이트씩 읽으므로 한글 작성 시 깨짐
				System.out.println((char)i);
			}
		} catch (IOException e) { // IOException이 상위 exception > FileNotFoundException이 하위 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
