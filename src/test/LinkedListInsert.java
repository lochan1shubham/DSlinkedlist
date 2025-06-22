package test;

public class LinkedListInsert {
	// Node class represent the node data and next reference.
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	static void insertAtBeginning(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	static void insertAtEnd(int data) {
		Node nEnd = new Node(data);
		Node tempNode = head.next;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = nEnd;

	}

	static void insertAtPosition(Node positionNode, int data) {
		Node n = new Node(data);
		n.next = positionNode.next;
		positionNode.next = n;

	}

	static void deleteAtBegining() {
		head = head.next;
	}

	static void deleteAtEnd() {
		if (head == null || head.next == null) {
			return;
		} else {

			Node endNode = head;
			while (endNode.next.next != null) {

				endNode = endNode.next;
			}

			endNode.next = null;
		}
	}

	public static void main(String[] arg) {
		System.out.println("LinkedListInsert Program");
		insertAtBeginning(12);
		insertAtBeginning(22);
		insertAtBeginning(1);
		insertAtBeginning(2);
		insertAtBeginning(112);
		insertAtBeginning(9);

		printListItem();
//		System.out.println("After enter data at end");
//		insertAtEnd(100);
//		printListItem();

//		System.out.println("After enter data at position");
//		insertAtPosition(head.next.next, 3);
//		printListItem();

//		System.out.println("Delete at beginning");
//		deleteAtBegining();
//		printListItem();

		System.out.println("Delete at End");
		deleteAtEnd();
		printListItem();

	}

	static void printListItem() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;

		}
	}
}
