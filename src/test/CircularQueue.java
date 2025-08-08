package test;


public class CircularQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(2);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(3);
		queue.enQueue(1);
		queue.printQueue();
		
		System.out.println("DeQueue one item");
		queue.deQueue();
		queue.printQueue();
		
		System.out.println("EnQueue one item after dequeue");
		queue.enQueue(7);
		
		queue.printQueue();
	}
}

class Queue{
	int SIZE = 5;
	int [] queue = new int[SIZE];
	int front = -1, rear =-1;
	
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			front = front%SIZE + 1; 
		}
	}
	
	boolean isEmpty() {
		if(front == rear && front == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isFull() {
		if(front == 0 && rear == SIZE-1) {
			return true;
		} else if ((rear+1)%SIZE == front) {
			return true;
		}else {
			return false;
		}
	}
	
	void enQueue(int i) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
		
			if(isEmpty()) {
			front = 0;
			}
//			if(rear == SIZE-1) {
//				rear = -1;
//			}
			rear = (rear+1)%SIZE;
			queue[rear] = i;
			System.out.println("Enqueue = "+i);
		}
	}
	
	void printQueue() {
		int iFront = front;
		while (iFront != rear ) {
			System.out.println(""+queue[iFront]+" Front="+iFront+" Rear="+rear);
			iFront = (iFront+1)%SIZE;
		}
		System.out.println(""+queue[iFront]+" Front="+iFront+" Rear="+rear);
	}	
}

// TODO: Queue need to implement with Linked list
