package chapter9_practice.interfaceex;

public class QuickSort implements Sort {

	@Override
	public void ascedning(int[] arr) {
		System.out.println("QuickSort Ascedning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort Descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort¿‘¥œ¥Ÿ.");
	}

}
