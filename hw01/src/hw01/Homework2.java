package hw01;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		int 년도;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하시오 : ");
		년도 = sc.nextInt();
			
		
		if(년도%400==0)
		   System.out.print(년도+"년은 윤년입니다.");
		else if(년도%100==0)
			System.out.print(년도+"년은 윤년이 아닙니다");
		else if(년도%4==0)
			System.out.print(년도+"년은 윤년입니다.");
		else System.out.print(년도+"년은 윤년이 아닙니다.");
		    
		   
		sc.close();
		
	}

}
