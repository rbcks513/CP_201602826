package hw06;

public class homework1 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0; 
		
		int[] ���� = new int[10];
		
		
		for(int i= 0; i < ����.length ; i++) {
			
			����[i] = (int)(Math.random()*100);
			
			if(i==0) {
				min = ����[i];
			    max = ����[i];
			   
			}
			else if(min >= ����[i]) 
				min = ����[i];
			else if(max <= ����[i])
				max = ����[i];
			
		}
		
		System.out.println("10���� ���� ���� ū ���� : "+ max);
		System.out.println("10���� ���� ���� ���� ���� : "+ min);
		
	}

}
