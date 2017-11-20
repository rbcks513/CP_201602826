package hw01;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		
		String 나 ="";
		String 컴퓨터 ="";
		int usernum;
		int win=0;
		int lose=0;
		int game=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(game<7) {
				
		//컴퓨터의 경우의 수 선택	
		usernum = (int)(Math.random()*10)+1;
		if(usernum==10)
			while(usernum>9) {
				usernum = (int)(Math.random()*10)+1;
			}
		
		switch(usernum) {
		case 1:
		case 4:
		case 7: 컴퓨터 = "가위";break;
		
		case 2:
		case 5:
		case 8: 컴퓨터  = "바위";break;
		
		case 3:
		case 6:
		case 9:	컴퓨터 = "보";break;
		}
				
		//내 경우의 수 입력
		System.out.print("가위 바위 보 : ");
		나 = sc.next();
		
		
		//가위바위보의 경우의 수 비김은 고려 하지 않고 다시 진행
		if(컴퓨터.equals("가위")) 
			if(나.equals("바위")) {
				System.out.println("승리");
				win=win+1;}
			else if(나.equals("보")) {
				System.out.println("패배");
				lose=lose+1;}
			else System.out.println("무승부");
		
		else if(컴퓨터.equals("바위")) 
			if(나.equals("보")) {
				System.out.println("승리");
				win=win+1;}
			else if(나.equals("가위")) {
				System.out.println("패배");
				lose=lose+1;}
			else System.out.println("무승부");
		
		else if(컴퓨터.equals("보")) 
			if(나.equals("가위")) {
				System.out.println("승리");
				win=win+1;}
			else if(나.equals("바위")) {
				System.out.println("패배");
				lose=lose+1;}
			else System.out.println("무승부");
		
		
			
    	game=win+lose;
    	
    	
    	System.out.println("Stage "+game+" > User "+win+"승 vs Computer "+lose+"승");		
		}	
		
		if(game==7)
			if(win>lose)
				System.out.print("User가 이겼다.!!");
			else
				System.out.print("Computer가 이겼다.!!");
		
		
		sc.close();

	}
}

