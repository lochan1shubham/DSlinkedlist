package test;

public class QueueTest {
	
	static int front = 0;
	static int rear = -1;
	static final int MAX = 5;
	static int [] queue = new int[MAX];
	
	public static boolean isFull() {
		return rear == MAX-1;
	}
	
	public static boolean isEmpty() {
		return rear < front;
	}
	
	public static void insert(int a) {
		if(!isFull()) {
			queue[++rear] = a;
		}
	}

	public static void printQueue() {
		if(!isEmpty()) {
			for (int i = 0; i <= rear; i++) {
				System.out.println("Queue item:::"+queue[i]);
			}
		} else {
			System.out.println("Empty queue");
		}
	}
	
	public static void remove() {
		while(!isEmpty()) {
			System.out.println("Item removed::"+queue[front++]);
			
		}
		rear=-1;
		front =0;
	}
	
	public static void main(String[] args) {
		System.out.println("Queue Test");
		
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		printQueue();
		remove();
		printQueue();
		insert(7);
		insert(8);
		printQueue();
	}
}
