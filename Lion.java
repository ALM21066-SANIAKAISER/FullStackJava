package Overriding;

public class Lion extends Animal {
	public void eat() {
		System.out.println("Lions eat meat");
	}
	public static void main(String[] args) {
		Animal l= new Lion();
		l.eat();
	}
}
