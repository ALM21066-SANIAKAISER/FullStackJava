package multithread;

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var t0 = new Thread(() -> {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		});

		var t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
	
		t0.start();
		t1.start();
	}

}
