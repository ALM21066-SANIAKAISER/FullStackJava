package LabExercises2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DescendingOrderArray4 {

	private static Scanner sc = null;

	public static void main(String[] args) {
		int Size, i;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		Object [] a = new Object[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Comparator<Object> cms = Collections.reverseOrder();
		Arrays.sort(a, cms);
		
		System.out.println("\n Result of a Sorted Array :  ");
		for (Object Number: a)
		{
			System.out.print(Number + "  ");
		}
	}

}
