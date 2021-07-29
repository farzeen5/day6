package day6;
import java.util.Scanner;
public class day6 {
	public static void main(String[] args) {
			int Number, Reminder, Reverse = 0;
			Scanner reader = new Scanner(System.in);
			
			System.out.println(" Please Enter any Number : ");
			Number = reader.nextInt();
			
				
			while(Number > 0) {
				Reminder = Number %10;
				Reverse = Reverse * 10 + Reminder;
				Number = Number /10;
			}
			System.out.format(" Reverse of number is = ", +Reverse);
		}

	}


