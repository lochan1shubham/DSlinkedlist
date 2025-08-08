package revised1;

import java.util.Scanner;

public class SlidingWindow {
	static int numbers[] = new int[]{1,4,2,3,2,5,6,2,1,3};
	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Enter the range");
		int k = scanner.nextInt();
		System.out.println("k = "+k);
		findMaxSumOfSubArray(k);
	}
	
	public static void findMaxSumOfSubArray(int k) {
	int i=0;
	int j =0;
	int sum = 0;
	int max =0;
	while(j<numbers.length) {
		sum += numbers[j];
		
		if(j+1-i == k) {
			
			max = Math.max(sum, max);
			System.out.println("Max  :: "+max);
			sum -= numbers[i];
			i++;
		}
		j++;
	}
	
	System.out.println("Max sum of subarray :: "+max);
	}
}
