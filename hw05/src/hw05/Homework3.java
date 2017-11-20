package hw05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Date date1 = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해 주세요: ");
		date1.year = sc.nextInt();
		System.out.print("달을 입력해 주세요: ");
		date1.month = sc.nextInt();
		System.out.print("날짜를 입력해 주세요: ");
		date1.day = sc.nextInt();
		
		
		System.out.println(date1.printEastern());
		System.out.println(date1.printWastern());
		sc.close();
		
		

	}
}


