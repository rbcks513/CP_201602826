package hw05;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("���ڿ��� �Է��Ͻÿ�: ");
    	String s = sc.nextLine();
    	String �����˻� = " ";
    	char �����˻� = ' ';
    	int ���� = 0;
    	int ���� = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		�����˻� = s.substring(i, i+1);
    		�����˻� = s.charAt(i);
    	if(�����˻�.equalsIgnoreCase("a")==true
    		||�����˻�.equalsIgnoreCase("e")==true
    		||�����˻�.equalsIgnoreCase("i")==true
    		||�����˻�.equalsIgnoreCase("o")==true
    		||�����˻�.equalsIgnoreCase("u")==true)
    		����++;
    	else if(('a'<=�����˻�&&�����˻�<='z')||('A'<=�����˻�&&�����˻�<='Z'))
    		����++;
    	}
    	System.out.println("����"+����+"��");
    	System.out.println("����"+����+"��");
    	sc.close();
    	
    	
    }
}
