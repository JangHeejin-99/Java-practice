package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		// autocloesable �Ǳ� ������ finally�� ���� �ʾƵ� �ȴ�.
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			int i;
			byte[] bs = new byte[10];
			while ((i = fis.read(bs)) != -1) { // -1�̸� end of file
				 /* for(byte b: bs) { // ��°�� ��½� garbage�� ��µ� �� �ִ�
					System.out.print((char)b);
				} */
				
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) { // IOException�� ���� exception > FileNotFoundException�� ���� exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("end");
	}

}
