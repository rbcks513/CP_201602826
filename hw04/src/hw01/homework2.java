package hw01;

import java.util.Scanner;

public class homework2 {
public static void main(String[] args){
	
Scanner sc = new Scanner (System.in);
int �� = 0;
int �� = 0;
int �� = 0;	
int days = 0;

System.out.print("���?");
��=sc.nextInt();
System.out.print("���?");
��=sc.nextInt();
System.out.print("����?");
��=sc.nextInt();

days += (��-1900)*365;
days += (��-1900)/4;
System.out.println(days);
if(((��%4==0)&&(��%100!=0))||(��%400==0)) {
	if((��==1)||(��==2))
		days+=-1;
	
}
System.out.println(days);
switch(��) {
case 1:
	days += ��;break;
case 2:
	days += 31+ ��;break;
case 3:
	days += 31+28 + ��;break;
case 4:
	days += 31+28+31 + ��;break;
case 5:
	days += 31+28+31+30 + ��;break;
case 6:
	days += 31+28+31+30+31 + ��;break;
case 7:
	days += 31+28+31+30+31+30 + ��;break;
case 8:
	days += 31+28+31+30+31+30+31 + ��;break;
case 9:
	days += 31+28+31+30+31+30+31+31 + ��;break;
case 10:
	days += 31+28+31+30+31+30+31+31+30 + ��;break;
case 11:
	days += 31+28+31+30+31+30+31+31+30+31 + ��;break;
case 12:	
	days += 31+28+31+30+31+30+31+31+30+31+30 + ��;break;

}
System.out.print(days);

switch(days%7) {
case 0:
	System.out.println("�Ͽ���");break;
case 1:
	System.out.println("������");break;
case 2:
	System.out.println("ȭ����");break;
case 3:
	System.out.println("������");break;
case 4:
	System.out.println("�����");break;
case 5:
	System.out.println("�ݿ���");break;
case 6:
	System.out.println("����� ");break;

	
}



sc.close();	
}
}
