package Tutorials;

public class DoWhileLoop {

	public static void main(String[] args) {
		int num1= 30;
		int num2= 20;
		while (num1<num2) {
			System.out.println("inside while loop"+ num1);
			num1++;
			{
				do {
					System.out.println("inside do while loop"+num1);
				} while(num1<num2);
			}
		}
	}

}
