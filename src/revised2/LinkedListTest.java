package revised2;

public class LinkedListTest {
	static class Node {
		int value;
		Node next;
		
		Node(int v){
			value = v;
			next = null;
		}
		
	}
	
	static Node headNode;

	public static void insertM(int v) {
		Node node = new Node(v);
		if(headNode != null) {
			node.next = headNode;
		}
		headNode = node;
	}
	
	public static void printM() {
		while(headNode != null) {
			System.out.println(headNode.value);
			headNode = headNode.next;
		}
	}
	
	public static void main(String[] args) {
		insertM(0);
		insertM(2);
		insertM(1);
		insertM(3);
		insertM(4);
		insertM(6);
		
		printM();
	}

}
