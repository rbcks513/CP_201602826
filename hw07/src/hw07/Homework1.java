package hw07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount gyaejaw1 = new BankAccount();
		System.out.println("계좌 1 정보입력");
		System.out.print("계좌번호 : ");
		gyaejaw1.accountNumber = sc.nextInt();
		System.out.print("예금주 : ");
		gyaejaw1.owner = sc.next();
		System.out.print("초기 잔액 : ");
		gyaejaw1.balance = sc.nextInt();
		
		BankAccount gyaejaw2 = new BankAccount();
		System.out.println("\n계좌 2 정보입력");
		System.out.print("계좌번호 : ");
		gyaejaw2.accountNumber = sc.nextInt();
		System.out.print("예금주 : ");
		gyaejaw2.owner = sc.next();
		System.out.print("초기 잔액");
		gyaejaw2.balance = sc.nextInt();
		
		System.out.println("이체금액");
		int money = sc.nextInt();
		if(money > gyaejaw1.balance )
			System.out.print("잔액부족 이체불가");
		else {
			gyaejaw1.withdraw(money);
			gyaejaw2.deposit(money);
		}
		System.out.println("=============================================");
		System.out.println(gyaejaw1.toString());
		System.out.println(gyaejaw2.toString());
		sc.close();		
	}

}

