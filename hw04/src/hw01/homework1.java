package hw01;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		
		String �� ="";
		String ��ǻ�� ="";
		int usernum;
		int win=0;
		int lose=0;
		int game=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(game<7) {
				
		//��ǻ���� ����� �� ����	
		usernum = (int)(Math.random()*10)+1;
		if(usernum==10)
			while(usernum>9) {
				usernum = (int)(Math.random()*10)+1;
			}
		
		switch(usernum) {
		case 1:
		case 4:
		case 7: ��ǻ�� = "����";break;
		
		case 2:
		case 5:
		case 8: ��ǻ��  = "����";break;
		
		case 3:
		case 6:
		case 9:	��ǻ�� = "��";break;
		}
				
		//�� ����� �� �Է�
		System.out.print("���� ���� �� : ");
		�� = sc.next();
		
		
		//������������ ����� �� ����� ��� ���� �ʰ� �ٽ� ����
		if(��ǻ��.equals("����")) 
			if(��.equals("����")) {
				System.out.println("�¸�");
				win=win+1;}
			else if(��.equals("��")) {
				System.out.println("�й�");
				lose=lose+1;}
			else System.out.println("���º�");
		
		else if(��ǻ��.equals("����")) 
			if(��.equals("��")) {
				System.out.println("�¸�");
				win=win+1;}
			else if(��.equals("����")) {
				System.out.println("�й�");
				lose=lose+1;}
			else System.out.println("���º�");
		
		else if(��ǻ��.equals("��")) 
			if(��.equals("����")) {
				System.out.println("�¸�");
				win=win+1;}
			else if(��.equals("����")) {
				System.out.println("�й�");
				lose=lose+1;}
			else System.out.println("���º�");
		
		
			
    	game=win+lose;
    	
    	
    	System.out.println("Stage "+game+" > User "+win+"�� vs Computer "+lose+"��");		
		}	
		
		if(game==7)
			if(win>lose)
				System.out.print("User�� �̰��.!!");
			else
				System.out.print("Computer�� �̰��.!!");
		
		
		sc.close();

	}
}

