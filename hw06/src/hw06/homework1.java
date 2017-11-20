package hw06;

public class homework1 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0; 
		
		int[] 난수 = new int[10];
		
		
		for(int i= 0; i < 난수.length ; i++) {
			
			난수[i] = (int)(Math.random()*100);
			
			if(i==0) {
				min = 난수[i];
			    max = 난수[i];
			   
			}
			else if(min >= 난수[i]) 
				min = 난수[i];
			else if(max <= 난수[i])
				max = 난수[i];
			
		}
		
		System.out.println("10개의 수중 가장 큰 수는 : "+ max);
		System.out.println("10개의 수중 가장 작은 수는 : "+ min);
		
	}

}
