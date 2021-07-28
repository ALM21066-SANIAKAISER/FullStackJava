package LabExercises2;

public class AverageOfNumbers {

	public static void main(String[] args) {
		double[] array = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		double total = 0;
		for (int i = 0; i < array.length; i++) {
		    total = total + array[i];
		}
		 
		//Get the average here
		double average = total / array.length;
		 
		System.out.format("The average is: %.2f", average);
	}

}
