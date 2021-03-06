package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis);){
			// data를 실제로 읽고 쓰는데 사용하는 버퍼 스트림이다.
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요"); // string
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());

		}catch(IOException e) {
			
		}
	}

}
