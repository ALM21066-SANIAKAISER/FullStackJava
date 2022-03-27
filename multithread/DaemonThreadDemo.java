package multithread;
import java.util.concurrent.TimeUnit;
public class DaemonThreadDemo {

	private static final String TimeUnit = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var t1 = new Thread(() -> {
			while (true) {
				try {
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.println("Daemon is working");
				} catch (InterruptedException e) {
					
				}
			
			}
		});
		
//		t1.setDaemon(true);
		t1.start();
		
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Main thread finished");
	}

}
