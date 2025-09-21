package revised1;

public class StactTest {
	
	
	public static void main(String[] args) {
		System.out.println("Stack test");
		
		StackTestA stackTestA = new StackTestA();
		stackTestA.push(6);
		stackTestA.push(2);
		stackTestA.push(3);
		stackTestA.push(4);
		stackTestA.push(5);
		
		stackTestA.printStack();
	}


}

class StackTestA{
	private int SIZE = 5;
	private int [] stackList = new int[SIZE];
	private int top = -1;
	
	private boolean isFull() {
		return top == SIZE-1;
	}
	
	public void printStack() {
		for (int i : stackList) {
			System.out.println(" "+i);
		}
	}
	
	public void push(int value) {
		
		if(isFull()) {
			System.out.println("Stack Full");
		} else {
			++top;
			stackList[top] = value;
		}
	}
}


