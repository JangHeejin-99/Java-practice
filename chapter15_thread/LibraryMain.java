package thread;

import java.util.ArrayList;

class FastLibrary {
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("태백산맥 1");
		books.add("태백산맥 2");
		books.add("태백산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException { // 책 빌림
		Thread t = Thread.currentThread();
		while(books.size() == 0) { // notifyAll을 선언하면 if일 경우에는 다시 잠들지 못하기때문에 while을 선언해 다시 잠들도록 해줌
			System.out.println(t.getName()+"waiting start");
			wait();
			System.out.println(t.getName()+"waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName()+":"+title+" lend");
		return title;
	}
	
	public synchronized void returnBook(String title) { // 책 반납
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll(); // 모든 thread가 동시에 깨어남
		
		System.out.println(t.getName()+":"+title+" return");
	
	}
}

class Student extends Thread{
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return;
			sleep(5000); // 5초동안 책을 읽음
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class LibraryMain {
	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();

		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
	}

}
