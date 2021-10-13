package Overriding;

public class Cow extends Animal {
public void eat() {
	System.out.println("Cows eat grass");
}
public static void main(String[] args) {
	Animal c= new Cow();
	c.eat();
}
}
