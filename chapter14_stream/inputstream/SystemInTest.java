package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("입력 후 '끝'이라고 쓰세요: ");
		
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in); 
			// 보조스트림 = 바이트로 읽어들인 것을 문자로 바꿔주는 아이
			
			while( (i= isr.read())!= '끝') {
				// System.out.println(i); // int로 반환
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
