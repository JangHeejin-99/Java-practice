package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// (interface) Externalizable = 구현할 수 있는 method가 있음
class Person implements Serializable{ // 직렬화
	String name;
	transient String job; // transient는 직렬화하지마라
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name +","+ job;
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		try(FileOutputStream fos= new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis= new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject(); // 다운캐스팅
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);

		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);

		}
	}

}
