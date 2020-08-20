package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// 문자로 읽을 때는 FileReader
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis); // 보조스트림 -> 바이트 단위로 읽어야하는 경우에는 이 보조 스트림을 사용
		int i ;
		while ((i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		isr.close();
	}

}
