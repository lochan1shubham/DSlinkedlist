package test;



public class StackTest {
	
	static int top = -1;
	static int [] stackOfInteger = new int[6];
	
	public static boolean isFull() {
		return top == stackOfInteger.length-1;
	}
	
	public static void pushM(int i) {
		if(!isFull()) {
			++top;
			stackOfInteger[top]= i;
		} else {
			System.out.println("Stack full");
		}
	}
	
	public static void popM() {
		if(top > -1) {
			top = top-1;
			 
		} else {
			System.out.println("Stack empty");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Stacklist");
		pushM(1);
		pushM(2);
		pushM(3);
		pushM(4);
		pushM(5);
		pushM(6);
		
		printStack();
		
		System.out.println("Stacklist pop operation");
		popM();
		popM();
		printStack();
	}
	
	private static void printStack() {
		int i = top;
		while (i > -1) {
			System.out.println(stackOfInteger[i]);
			--i;
		}
		
	}
	
}
