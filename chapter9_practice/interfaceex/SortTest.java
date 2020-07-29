package chapter9_practice.interfaceex;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		Sort sort = null;
		
		System.out.println("���Ĺ���� �����ϼ���.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ar = System.in.read();
		
		switch(ar) {
		case 'B': case 'b':
			sort = new BubbleSort();
			break;
		case 'H': case 'h':
			sort = new HeapSort();
			break;
		case 'Q': case 'q':
			sort = new QuickSort();
			break;
		default:
			System.out.println("�߸��� ���Ĺ���� �����ϼ̽��ϴ�.");
		}
		
		int[] arr = new int[10];
		
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
