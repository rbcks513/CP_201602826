package hw01;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		int �⵵;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��Ͻÿ� : ");
		�⵵ = sc.nextInt();
			
		
		if(�⵵%400==0)
		   System.out.print(�⵵+"���� �����Դϴ�.");
		else if(�⵵%100==0)
			System.out.print(�⵵+"���� ������ �ƴմϴ�");
		else if(�⵵%4==0)
			System.out.print(�⵵+"���� �����Դϴ�.");
		else System.out.print(�⵵+"���� ������ �ƴմϴ�.");
		    
		   
		sc.close();
		
	}

}
