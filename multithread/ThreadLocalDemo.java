package multithread;

import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo implements Runnable{
//	private static ThreadLocal<String> transactionId = ThreadLocal.withInitial(() -> "n/a");
	private static ThreadLocal<Integer> transactionId = new ThreadLocal<Integer>();

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalDemo Runnable = new ThreadLocalDemo();

        var thread1 = new Thread();
        var thread2 = new Thread();

        thread1.start();
        thread2.start();
	}
	
   @Override
	public void run() {
		transactionId.set((int) (Math.random() * 100));
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		}
		System.out.println(transactionId.get());
}
}