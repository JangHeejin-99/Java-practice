package chapter9_practice.interfaceex;

public class HeapSort implements Sort {

	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeapSort ascedning");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descedning");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort¿‘¥œ¥Ÿ.");
	}

}
