package day6;

import java.util.Scanner;

public class day62 {

	public static void main(String[] args) {


		int num=0,reversed=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = reader.nextInt();
	  
	    while(num != 0) {
	    
	      
	      int reminder = num % 10;
	      reversed = reversed * 10 + reminder;

	     
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }

	}

