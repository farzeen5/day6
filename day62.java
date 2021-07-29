package day6;

import java.util.Scanner;

public class day62 {

	public static void main(String[] args) {


			int i, Number, Sum = 0 ;
			Scanner a = new Scanner(System.in);		
			System.out.println(" Please Enter any Number: ");
			Number = a.nextInt();

			for(i = 1 ; i < Number ; i++) {
				if(Number % i == 0)  {
					Sum = Sum + i;
				}
			}
			if (Sum == Number) {
				System.out.format(" is a Perfect Number", Number);
			}
			else {
				System.out.format(" d is NOT a Perfect Number", Number);
			}
		

	}
}

