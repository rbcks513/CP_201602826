package hw01;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력해 주세요");
		String 나 = (String)sc.next();
		
		
		
		
		switch(나) {
		case "A":
			System.out.print("모음입니다.");break;
		case "E":
			System.out.print("모음입니다.");break;	
		case "I":
			System.out.print("모음입니다.");break;
		case "O":
			System.out.print("모음입니다.");break;
		case "U":
			System.out.print("모음입니다.");break;
		case "a":
			System.out.print("모음입니다.");break;
		case "e":
			System.out.print("모음입니다.");break;
		case "i":
			System.out.print("모음입니다.");break;
		case "o":
			System.out.print("모음입니다.");break;
		case "u":
			System.out.print("모음입니다.");break;
	    default:
			System.out.print("자음입니다.");break;
		}
		
		
		
		
	
		
		
		
		sc.close();

		}
		
		
	}


