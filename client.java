package Multithreading;
import java.net.Socket;
public class client {

Socket s;
 public void Client() {
	try {
		s=new Socket("localhost",2000);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	new Client();
}
}
