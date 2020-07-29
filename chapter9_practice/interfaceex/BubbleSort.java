package chapter9_practice.interfaceex;

public class BubbleSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("BubbleSort ascedning");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descedning");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort¿‘¥œ¥Ÿ.");
	}

}
