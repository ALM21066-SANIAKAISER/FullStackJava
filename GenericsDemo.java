package Multithreading;
import java.util.Iterator;
import java.util.Vector;
public class GenericsDemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("hello");
		v.add("helllllll");
		v.add("aajjaja");
		
		Iterator<String> iter=v.iterator();
		while(iter.hasNext()) {
			String d=iter.next();
			System.out.println(d);
		}
		
	}
}
class Dabba{
	public void enjoy() {
		System.out.println("dabba enjoyment...");
	}

public static void main(String[] args) {
	Vector<Dabba> v=new Vector<>();
	v.add(new Dabba());
	v.add(new Dabba());
	v.add(new Dabba() );
	
	Iterator<Dabba> iter=v.iterator();
	while(iter.hasNext()) {
		Dabba d=iter.next();
		d.enjoy();
	}
	
}
}
class Dabba{
public void enjoy() {
	System.out.println("dabba enjoyment...");
}
}