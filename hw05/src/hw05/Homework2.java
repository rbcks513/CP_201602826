package hw05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�:   ");
		String s = sc.nextLine();
		String result = "";  
		
		for(int i=0;i<s.length();i++){
			
		 char ���� = s.charAt(i);
		 
		 if(����>=65 && ����<=90)
		   result += String.valueOf(����).toLowerCase();
		   
		 else if(����>=97 && ����<=122)
		   result += String.valueOf(����).toUpperCase();
		   
		 else
		   result += ����;
		  
		 }
		  
		System.out.println(result);
		
		sc.close();

	}

}
