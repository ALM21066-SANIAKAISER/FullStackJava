package LabExercises2;

public class ResizeAnArray4 {

	public static void main(String[] args) {
		int[] array = {9, 0, 9, 8};
        int arrayLength = array.length;
        System.out.println("Array Size is: " + arrayLength);

        //run loop and print elements
        for (int i = arrayLength; i > 0; i--) {
            System.out.println("Now remain Loops " + i);
        }
	}

}
