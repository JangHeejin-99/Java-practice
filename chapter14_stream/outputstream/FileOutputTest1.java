package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			// 뒤에 true를 적으면 계속 append 된다.
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
