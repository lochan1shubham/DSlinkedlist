package test;

public class AddTwoNumber {
	public static void main(String s[]) {
		System.out.println("Main stemm ff");

		ListNode listNodeTemp = addTwoNumber(new ListNode(2, new ListNode(4, new ListNode(4))), new ListNode(5, new ListNode(6, new ListNode(3, new ListNode(1)))));

		while (listNodeTemp != null) {
			System.out.println("Main listNode " + listNodeTemp.val);
			listNodeTemp = listNodeTemp.next;
		}
	}

	public static ListNode addTwoNumber(ListNode ln1, ListNode ln2) {
		ListNode listNodeHead = null;
		int carry = 0;
		int val1 = 0;
		int val2 = 0;
		while (ln1 != null || ln2 != null || carry > 0) {
			int tempCarry = carry;
			carry = 0;
			
			if (ln1 != null) {
				val1 = ln1.val;
			}
			if (ln2 != null) {
				val2 = ln2.val;
			}
			int nodeValue = val1 + val2 + tempCarry;
			if (nodeValue > 9) {
				carry = nodeValue / 10;
				nodeValue = nodeValue % 10;
			}

			if (listNodeHead == null) {
				listNodeHead = new ListNode(nodeValue);
			} else {
				ListNode tempListNode = listNodeHead;
				while (tempListNode.next != null) {
					tempListNode = tempListNode.next;

				}
				ListNode lNode = new ListNode(nodeValue);
				tempListNode.next = lNode;

			}
			if (ln1 != null)
				ln1 = ln1.next;
			if (ln2 != null)
				ln2 = ln2.next;
		}
		return listNodeHead;
	}

}
