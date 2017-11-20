package hw01;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int sec;
		int 시간;
		int 분;
		int 초;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 초 입력 : ");
		sec = sc.nextInt();
		
		시간 = sec/3600;
		분 = (sec%3600)/60;
		초 = (sec%3600)%60;
		
		System.out.print(sec+"초는 "+시간+"시간 "+분+"분 "+초+"초 입니다." );
		sc.close();

	}

}
