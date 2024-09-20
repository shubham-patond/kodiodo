package com.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:-");
		int no= sc.nextInt();
		
		int facto = 1;
		for(int i=1; i<=no; i++)
		{
			 facto *= i;
        }
        
        System.out.println("The factorial of " + no + " is " + facto);
    }
		
}


