package hw01;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int sec;
		int �ð�;
		int ��;
		int ��;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է� : ");
		sec = sc.nextInt();
		
		�ð� = sec/3600;
		�� = (sec%3600)/60;
		�� = (sec%3600)%60;
		
		System.out.print(sec+"�ʴ� "+�ð�+"�ð� "+��+"�� "+��+"�� �Դϴ�." );
		sc.close();

	}

}
