package test;

public class ReverseLinkedList {
	static class Node{
		int value;
		Node next;
		 Node(int v){
			 value = v;
			 next =null;
		 }
		 
		 Node(int v, Node nextN){
			 value = v;
			 next =nextN;
		 }
	}
	
	static Node headNode = null;
	
	public static void insert(int v) {
		Node nextNode = new Node(v);
		if (headNode == null) {
			headNode = nextNode;
		} else {
			nextNode.next = headNode;
		}
		headNode = nextNode;
	}
	
	private static void reverseM() {
		headNode = new Node(6, new Node(4, new Node(7, new Node(2))));
		Node tempNextNode =null ;
		while(headNode !=null) {
			Node kNode = headNode.next;
			headNode.next = tempNextNode;
			tempNextNode = headNode;
			headNode = kNode;
		}
		headNode = tempNextNode;
	}
	
	public static void printList() {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
	}
	
	
	public static void main(String[] args) {
//		insert(0);
//		insert(1);
//		insert(2);
//		printList();
		System.out.println("Reverse List");
		reverseM();
		printList();
	}

}
