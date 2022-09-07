package studio1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input a year");
		int year = in.nextInt(); 
		boolean isLeapyear = year % 2 == 0 || year % 100 == 1 ||year % 400 == 0;
		System.out.print("is leap year? "+ isLeapyear);
	
	}

}
