package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			int i;
			
			while ((i = fis.read()) != -1) { // -1�̸� end of file
				// �� ����Ʈ�� �����Ƿ� �ѱ� �ۼ� �� ����
				System.out.println((char)i);
			}
		} catch (IOException e) { // IOException�� ���� exception > FileNotFoundException�� ���� exception
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
