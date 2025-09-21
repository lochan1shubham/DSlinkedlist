package revised2;

public class SlidingWindowTest {
	static int k =3;
	static int [] listItems = {2,1,3,4,6,1,5,2,1};
	static int i =0 , j=0, max=0, sum =0 ;
	
	public static void main(String[] args) {
		while(j<listItems.length) {
			sum += listItems[j];
			
			if(j+1-i == k) {
				max = Math.max(max, sum);
				sum -= listItems[i];
				i++;
			}
			j++;
		}
		System.out.println("MAX = "+max);
	}

}
