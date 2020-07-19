package chatpter6_problem.arrayList;

import java.util.ArrayList;

public class Student {
	String name;
	
	ArrayList<Book> list;
	
	public Student(String name) {
		this.name = name;
		
		list = new ArrayList<Book>();
	}
	
	public void addBook(String bookName) {
		Book book = new Book(bookName);
		
		list.add(book);
	}
	
	public void showBookInfo() {
		System.out.print(name+" �л��� ���� å�� : ");
		for(Book book : list) {
			book.getBookName();
			
			System.out.print(book.getBookName()+" ");
		}
		System.out.println("�Դϴ�");
	}
	
}
