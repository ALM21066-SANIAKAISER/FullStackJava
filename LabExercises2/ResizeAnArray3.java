package LabExercises2;
import java.util.Arrays;
public class ResizeAnArray3 {

	public static void main(String[] args) {
		int[] numberArray = { 12, 24, 63, 45 };
    	System.out.println("Array before ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
 
        numberArray = Arrays.copyOf(numberArray, 6);
        numberArray[4] = 11;
        numberArray[5] = 55;
 
        System.out.println("Array after ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
	}

}
