package test;

public class DoubleLinkedList {

	static class Node {
		int data;
		Node nextNode;
		Node prevNode;

		Node(int d) {
			data = d;
			
			nextNode = null;
			prevNode = null;
		}
	}
	

		static Node head = null;
		static Node last = null;
		
		public static boolean isEmpty() {
			return head == null;
		}
		
		private static void removeFirst() {
			head = head.nextNode;
			head.prevNode = null;
			printList();
		}
		
		public static void main(String[] args) {
			System.out.print("Main");
			insert(2);
			insert(12);
			insert(22);
			insert(23);
			insert(24);
			insert(21);
			printList();
			
			System.out.println("Insrt at end");
			insertEnd(1);
			printList();
			
			System.out.println("Insrt at the first");
			insertFirst(26);
			printList();
			
			System.out.println("Remove first item");
			removeFirst();
		}
		
		public static void insertEnd(int d) {
			
			Node nLastNode = new Node(d);
			if(isEmpty()) {
				last = nLastNode;
			}else {
				last.nextNode  = nLastNode;
				nLastNode.prevNode = last;
				last = nLastNode;
			}
			
		}
		
		public static void insertFirst(int d) {
			
			Node nLastNode = new Node(d);
			if(isEmpty()) {
				last = nLastNode;
			}else {
				head.prevNode  = nLastNode;
				nLastNode.nextNode = head;
			}
			head = nLastNode;
			
		}
		
		public static void insert(int data) {
			Node node = new Node(data);
			if(isEmpty()) {
				last = node;
			}else {
				head.prevNode = node;
			}
			
			node.nextNode = head;
			head = node;
		}
		
		public static void printList() {
			Node node = head;
			while (node != null) {
				System.out.println(node.data);
				node = node.nextNode;
				
			}
			
		}
	
}
