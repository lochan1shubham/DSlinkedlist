package sorting;

import java.util.List;

public class BubbleSorting {
	static int [] aray= {3,2,4,1,6,5};
	
	public static void main(String []args) {
		
		for (int i = 0; i < aray.length; i++) {
			for (int j = 1; j < aray.length; j++) {
				System.out.println(i+":::"+j+":::"+aray[j]+"<"+aray[j-1]);	
				if(aray[j]<aray[j-1]) {
				System.out.println("SWAPPING");	
				 int temp = aray[j];
				 aray[j] = aray[j-1];
				 aray[j-1] = temp;
				}
			}
		}
		
		for (int a : aray) {
			System.out.println(a);	
		}
	}
	

}
