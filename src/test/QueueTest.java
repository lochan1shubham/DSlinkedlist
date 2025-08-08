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
	
	// INsert operation in queue is called Enqueue
	public static void enqueue(int a) { 
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
	
	// Remove operation in queue is called Dequeue
	public static void dequeue() {
		while(!isEmpty()) {
			System.out.println("Item removed::"+queue[front++]);
			
		}
		rear=-1;
		front =0;
	}
	
	public static void main(String[] args) {
		System.out.println("Queue Test");
		
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		enqueue(6);
		printQueue();
		dequeue();
		printQueue();
		enqueue(7);
		enqueue(8);
		printQueue();
	}
}
