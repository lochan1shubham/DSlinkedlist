package searching;

public class BinarySearchTest {
	
	public static void main(String[] args) {
		System.out.println("Binary search test");
		
		BinaryTest binaryTest= new BinaryTest();
		int index = binaryTest.findTarget(1);
		if(index>=0) {
			System.out.println("Target found at "+index);
		}else {
			System.out.println("Target not found");
		}
		
	}

}

class BinaryTest{
	int [] list = {1,2,4,5,6,7,8,11};
	int upperIndex = list.length - 1;
	int lowerIndex = 0;
	int mid=-1;
	int count=0;
	
	int findTarget(int target) {
	while(lowerIndex <= upperIndex ) {
		int midIndex = (lowerIndex+upperIndex)/2;
		System.out.println("Count = "+ count);
		count++;
		if(list[midIndex] == target) {
			
			return midIndex;
		} else if(list[midIndex]< target) {
			lowerIndex = midIndex+1;
		} else if(list[midIndex] > target){
			upperIndex = midIndex-1;
		}
		
	}
		
		return mid;
	}
}
