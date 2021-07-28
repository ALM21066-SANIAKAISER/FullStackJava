package LabExercises2;

import java.util.Scanner;

public class AverageOfNumbers3 {

	public static void main(String[] args) {
        int n,num,sum=0, i; 
        //create scanner object to obtain input from keyboard 
        Scanner input =new Scanner(System.in); 
        System.out.print("Enter How Many Numbers : ");//input 
        n =input.nextInt(); //read total numbers 
        System.out.print("Enter the Numbers :"); 
        for(i=1;i<=n; i++) 
            { 
                 num=input.nextInt(); //input number 
                 sum += num; 
            } 
         double average=(double)sum/n; 
         System.out.println("Average of " + n + " Numbers = " + average); 
         
	}

}
