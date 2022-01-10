package EasyProblems;

import Templates.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode one = new ListNode();
		one.val = 1;
		ListNode two = new ListNode();
		two.val = 2;
		ListNode three = new ListNode();
		three.val = 3;
		ListNode four = new ListNode();
		four.val = 4;
		ListNode five = new ListNode();
		five.val = 5;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;

		ReverseLinkedList rev = new ReverseLinkedList();
		ListNode tmp = rev.reverseList(one);
		int i = 0;
		while(tmp != null) {
			if(i > 20) {
				break;
			}
			System.out.println(tmp.val);
			tmp = tmp.next;
			i++;
		}
	}


	public  ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode tmp = reverseList(head.next);

		head.next.next = head;
		head.next = null;
		return tmp;

	}
  }
