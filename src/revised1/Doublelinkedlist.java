package revised1;

public class Doublelinkedlist {
	static class Node{
		int value;
		Node nextNode;
		Node prevNode;
		public Node(int v) {
			value = v;
			nextNode = null;
			prevNode = null;
		}
	}
	
	static Node headNode;
	
	public static void insertM(int v) {
		Node node = new Node(v);
		if(headNode != null) {
			headNode.nextNode = node;
		}
		node.prevNode = headNode;
		headNode = node;
	}
	
	public static void printList() {
		while (headNode!=null) {
			
			System.out.println("Next = "+ headNode.nextNode +" value = " +headNode.value + " Prev = "+ headNode.prevNode);
			headNode = headNode.prevNode;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Double");
		
		insertM(0);
		insertM(2);
		insertM(3);
		insertM(4);
		
		printList();
		
	}

}
