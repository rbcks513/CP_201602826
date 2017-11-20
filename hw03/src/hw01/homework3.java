package hw01;

public class homework3 {

	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		int x=0;
		
		
		for(int n=0;n<10;n++) {
			if(n==0) 
				System.out.println(a);
			
			if(n==1) 
			 	System.out.println(b);
			
			else {
				System.out.println(a+b);
				x = a;
				a = b;
				b = b+x;
				
				

			}
		}	
	}

}
