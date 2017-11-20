package hw05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:   ");
		String s = sc.nextLine();
		String result = "";  
		
		for(int i=0;i<s.length();i++){
			
		 char 문자 = s.charAt(i);
		 
		 if(문자>=65 && 문자<=90)
		   result += String.valueOf(문자).toLowerCase();
		   
		 else if(문자>=97 && 문자<=122)
		   result += String.valueOf(문자).toUpperCase();
		   
		 else
		   result += 문자;
		  
		 }
		  
		System.out.println(result);
		
		sc.close();

	}

}
