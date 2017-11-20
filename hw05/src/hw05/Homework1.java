package hw05;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("문자열을 입력하시오: ");
    	String s = sc.nextLine();
    	String 모음검사 = " ";
    	char 자음검사 = ' ';
    	int 자음 = 0;
    	int 모음 = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		모음검사 = s.substring(i, i+1);
    		자음검사 = s.charAt(i);
    	if(모음검사.equalsIgnoreCase("a")==true
    		||모음검사.equalsIgnoreCase("e")==true
    		||모음검사.equalsIgnoreCase("i")==true
    		||모음검사.equalsIgnoreCase("o")==true
    		||모음검사.equalsIgnoreCase("u")==true)
    		모음++;
    	else if(('a'<=자음검사&&자음검사<='z')||('A'<=자음검사&&자음검사<='Z'))
    		자음++;
    	}
    	System.out.println("자음"+자음+"개");
    	System.out.println("모음"+모음+"개");
    	sc.close();
    	
    	
    }
}
