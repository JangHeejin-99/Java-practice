package chapter9_practice.interfaceex;

public interface Sort {

	void ascedning(int[] arr);
	void descending(int[] arr);
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
}
