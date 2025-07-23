package test;


public class SlidingWindow {
	static final int k = 4;
	static int [] numbers = new int[] {2,3,4,1,3,6,3,1,1};
	static int i = 0, j=0, max = 0;  
	
	public static void main(String [] args) {
		int sum = 0;
		 while (j<numbers.length) {
			sum += numbers[j];
			
			
			if(j-i+1 == k) {
				System.out.println("Sum = " +sum);
				max = Math.max(max, sum);
				sum -= numbers[i];
				i++;
				
			}
			j++;
		}
		 
		 System.out.println("\n\nMax sum = "+max);
	}

}
