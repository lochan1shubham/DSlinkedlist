package sorting;

public class InsertionSorting {
static int [] aray= {3,2,4,1,6,5};
	
	public static void main(String []args) {
		for (int i = 1; i < aray.length; i++) {
			for (int j = i; j >0; j--) {
				System.out.println(i+":::"+j);
				if(aray[j]<aray[j-1]) {
					int temp = aray[j];
					aray[j]=aray[j-1];
					aray[j-1]=temp;
				} else {
					break;
				}
			}
		}
		for (int a : aray) {
			System.out.println(a);
		}
	}
}
