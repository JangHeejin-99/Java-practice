package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("writer.txt");
		fw.write('A');
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf);
		fw.write("안녕하세요");
		fw.write(buf, 2, 2); // buf의 2번째 index부터 2개
		fw.close();
		
		System.out.println("end");
	}

}
