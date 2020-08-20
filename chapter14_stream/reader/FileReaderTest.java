package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// ���ڷ� ���� ���� FileReader
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis); // ������Ʈ�� -> ����Ʈ ������ �о���ϴ� ��쿡�� �� ���� ��Ʈ���� ���
		int i ;
		while ((i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		isr.close();
	}

}
