package revised1;

public class LinkedList {
	static class Node{
		int value;
		Node next;
		Node(int v){
			value = v;
			next = null;
		}
	}
	
	static Node headNode;
	
	public static void insert(int v) {
		Node node = new Node(v);
			node.next = headNode;
			headNode = node;		
	}
	
	public static void printList() {
		while (headNode != null) {
			System.out.println(headNode.value);
			headNode = headNode.next;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("List");
		insert(2);
		insert(5);
		insert(1);
		printList();
	}
	

}
