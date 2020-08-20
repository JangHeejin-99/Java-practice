package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		// autocloesable 되기 때문에 finally를 쓰지 않아도 된다.
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			int i;
			byte[] bs = new byte[10];
			while ((i = fis.read(bs)) != -1) { // -1이면 end of file
				 /* for(byte b: bs) { // 통째로 출력시 garbage가 출력될 수 있다
					System.out.print((char)b);
				} */
				
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) { // IOException이 상위 exception > FileNotFoundException이 하위 exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("end");
	}

}
