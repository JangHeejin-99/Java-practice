package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException �߻� ����
		Class c = Class.forName(className); // ClassNotFoundException �߻� ����
		return c;
	}
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try { // handling�� �ؾ���
			test.loadClass("b.txt", "java.lang.string");// ���⼱ throws �ϴ� �� �ƴ�
			// a.txt, java.lang.String -> ���� ó�� x
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { // �ֻ��� exception = �ٸ� exception�� ��ĳ���õȴ�
			// �� �տ� Exception �� ���� �ȵȴ�.-> �׻� �� �������� ����Ѵ�.
			System.out.println(e);
		}
		
	}

}
