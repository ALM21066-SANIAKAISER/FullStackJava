package Multithreading;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
	ServerSocket ss;Socket s;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("Server Ready...............");
			while(true) {
				s=ss.accept();
				System.out.println(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
8:44
package mod1_2.day10;
import java.net.Socket;
public class Client {
	Socket s;
	public Client() {
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
