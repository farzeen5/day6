package day6;

import java.util.Scanner;



public class day62 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Type 'start' to start time ");
sc.next();
long start = System.currentTimeMillis();
System.out.println(start);
System.out.println("type 'stop' to stop time");
sc.next();
sc.close();
long stop = System.currentTimeMillis();
System.out.println(stop);
long elapsedTime=stop-start;
System.out.println("Elapsed time is : " +elapsedTime);

	}
	}

