package hw01;

import java.util.Scanner;

public class homework2 {
public static void main(String[] args){
	
Scanner sc = new Scanner (System.in);
int 년 = 0;
int 달 = 0;
int 일 = 0;	
int days = 0;

System.out.print("몇년?");
년=sc.nextInt();
System.out.print("몇월?");
달=sc.nextInt();
System.out.print("몇일?");
일=sc.nextInt();

days += (년-1900)*365;
days += (년-1900)/4;
System.out.println(days);
if(((년%4==0)&&(년%100!=0))||(년%400==0)) {
	if((달==1)||(달==2))
		days+=-1;
	
}
System.out.println(days);
switch(달) {
case 1:
	days += 일;break;
case 2:
	days += 31+ 일;break;
case 3:
	days += 31+28 + 일;break;
case 4:
	days += 31+28+31 + 일;break;
case 5:
	days += 31+28+31+30 + 일;break;
case 6:
	days += 31+28+31+30+31 + 일;break;
case 7:
	days += 31+28+31+30+31+30 + 일;break;
case 8:
	days += 31+28+31+30+31+30+31 + 일;break;
case 9:
	days += 31+28+31+30+31+30+31+31 + 일;break;
case 10:
	days += 31+28+31+30+31+30+31+31+30 + 일;break;
case 11:
	days += 31+28+31+30+31+30+31+31+30+31 + 일;break;
case 12:	
	days += 31+28+31+30+31+30+31+31+30+31+30 + 일;break;

}
System.out.print(days);

switch(days%7) {
case 0:
	System.out.println("일요일");break;
case 1:
	System.out.println("월요일");break;
case 2:
	System.out.println("화요일");break;
case 3:
	System.out.println("수요일");break;
case 4:
	System.out.println("목요일");break;
case 5:
	System.out.println("금요일");break;
case 6:
	System.out.println("토요일 ");break;

	
}



sc.close();	
}
}
