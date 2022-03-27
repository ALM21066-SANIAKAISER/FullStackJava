package multithread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ThrowingExceptionFromRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var t1 = new Thread(() -> {
			try {
				Files.readString(Paths.get("non-existing-path"));
			} catch (IOException ioException) {
				throw new RuntimeException(ioException);
			}
		});
		
		t1.start();
	}

}
