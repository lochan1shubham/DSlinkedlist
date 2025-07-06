package test;

public class CircularList {
	static class Node{
		int value;
		Node nextNode;
		Node prevNode;
		
		Node(int value){
			this.value = value;
			nextNode = null;
			prevNode = null;
		}
	}
	
	static Node headNode = null;
	static Node lastNode = null;
	
	public static boolean isEmpty() {
		return headNode == null;
	}
	
	public static void insertItem(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			lastNode = newNode;
		} else {
			headNode.prevNode = newNode;
			newNode.nextNode = headNode;
			newNode.prevNode = lastNode;
			lastNode.nextNode = newNode;
		}
		headNode = newNode;
	}
	
	public static void main(String[] asrStrings) {
		System.out.println("Circular List Test");
		insertItem(1);
		insertItem(2);
		insertItem(3);
		insertItem(4);
		insertItem(5);
		insertItem(6);
		insertItem(7);
		printList();
	}
	
	public static void printList() {
		Node node = headNode;
		Node prevNode = headNode.prevNode;
		while(node != null) {
			System.out.println("Prev::::"+node.prevNode);
			System.out.println(node.value);
			System.out.println("Next::::"+node.nextNode);
			if(prevNode == node) {
				break;
			}
			
			node = node.nextNode;
			
			
		}
	}
	
	

}
