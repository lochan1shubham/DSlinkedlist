package sorting;

public class SelectionSorting {
static int [] aray= {3,2,4,1,6,5};
	
	public static void main(String []args) {
		for (int i = 0; i < aray.length-1; i++) {
			for (int  j = i+1;   j< aray.length;  j++) {
				System.out.println(i+":::"+j+":::"+aray[j]+"<"+aray[j-1]);
				if(aray[i]>aray[j]) {
					int temp  = aray[i];
					aray[i] = aray[j];
					aray[j]= temp;
				}
			}
		}
		for (int a : aray) {
			System.out.println(a);
		}
		
	}

}
