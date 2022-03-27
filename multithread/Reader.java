package multithread;

import java.lang.management.MemoryUsage;

public class Reader implements Runnable {
	private MessageDemo message;

	public Reader(MemoryUsage m) {
		this.message = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (message) {
			try {
				System.out.println(name + 
						" waiting to get notified at time:" 
						+ System.currentTimeMillis());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
			System.out.println(name + " processed: " + message.getMessage());
		}
	}
}
