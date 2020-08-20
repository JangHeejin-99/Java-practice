package thread;

class MyThread extends Thread{
	public void run() { // thread는 run이라는 method를 구현해야함
		int i;
		for(i = 0; i <= 200; i++) {
			System.out.print(i+"\t");
			
			try {
				sleep(100); // 1/1000 = thread static method
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("start");
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println("end");
	}

}
