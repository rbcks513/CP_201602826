package hw07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount gyaejaw1 = new BankAccount();
		System.out.println("���� 1 �����Է�");
		System.out.print("���¹�ȣ : ");
		gyaejaw1.accountNumber = sc.nextInt();
		System.out.print("������ : ");
		gyaejaw1.owner = sc.next();
		System.out.print("�ʱ� �ܾ� : ");
		gyaejaw1.balance = sc.nextInt();
		
		BankAccount gyaejaw2 = new BankAccount();
		System.out.println("\n���� 2 �����Է�");
		System.out.print("���¹�ȣ : ");
		gyaejaw2.accountNumber = sc.nextInt();
		System.out.print("������ : ");
		gyaejaw2.owner = sc.next();
		System.out.print("�ʱ� �ܾ�");
		gyaejaw2.balance = sc.nextInt();
		
		System.out.println("��ü�ݾ�");
		int money = sc.nextInt();
		if(money > gyaejaw1.balance )
			System.out.print("�ܾ׺��� ��ü�Ұ�");
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

