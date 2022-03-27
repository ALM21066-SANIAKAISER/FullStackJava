package multithread;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = new DefaultRunnable();
		Thread t1 = new Thread(task);
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I'm a new thread! My name is " + Thread.currentThread().getName());
			}
		});
		
		example2 t3 = new example2 ();
		
		Thread t4 = new Thread(() -> System.out.println("I'm a new thread! My name is " 
				+ Thread.currentThread().getName()));
		
		Thread t5 = new Thread(example2 ::execute);
		
		
		System.out.println("Current thread name is " + Thread.currentThread().getName());
		t1.run(); // will also be executed in main thread
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
	private void start() {
		
		
	}

	public static void execute() {
		System.out.println("I'm a new thread! My name is " + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("I'm a new thread! My name is " + Thread.currentThread().getName());
	}

}
