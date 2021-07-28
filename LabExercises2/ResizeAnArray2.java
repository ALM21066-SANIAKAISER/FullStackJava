package LabExercises2;

public class ResizeAnArray2 {

	public static void main(String[] args) {
		int[] numberArray = { 12, 24, 63, 45 };
    	System.out.println("Array before ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
 
        int[] temp = new int[6];
        int length = numberArray.length;
        for (int j = 0; j < length; j++) {
          temp[j] = numberArray[j];
        }
        numberArray = temp;
 
        System.out.println("Array after ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
	}

}
