package Medium;

public class AddTwoNumbers {

	public static void main(String[] args) {

		String hi = new String("ok");
		StringBuilder h = new StringBuilder("322");
		h.reverse();
		Long.valueOf(String.valueOf(h));

		ListNode zero = new ListNode();
		zero.val = 0;

		ListNode eight = new ListNode();
		eight.val = 8;

		zero.next = eight;

		ListNode one = new ListNode();
		one.val = 1;

		System.out.println("okok");

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long num1 = 0, num2 = 0;
		long mul1 = 1, mul2 = 1;
		boolean b1 = false, b2 = false;

		if(l1.val == 0 && l1.next != null) {
			b1 = true;
		}

		if(l2.val == 0 && l2.next != null) {
			b2= true;
		}

		ListNode tmp1 = l1, tmp2 = l2;
		while(tmp1.val == 0) {
			mul1 *= 10;
			tmp1.next = tmp1;
		}

		while(tmp2.val == 0) {
			mul2 *= 10;
			tmp2.next = tmp2;
		}

		while(l1 != null) {
			num1 *= 10;
			num1 += l1.val;
			l1 = l1.next;
		}

		while(l2 != null) {
			num2 *= 10;
			num2 += l2.val;
			l2 = l2.next;
		}

		long rev1 = reverseNumber(num1), rev2 = reverseNumber(num2);

		if(b1 == true) {
			rev1 *= 10;
		}

		if(b2 == true) {
			rev2 *= 10;
		}


		long result = rev1 + rev2;

		System.out.println(num1 + "\n" + num2 + "\n" + rev1 + "\n" + rev2 + "\n" + result);

		if(result == 0) {
			ListNode r = new ListNode();
			r.val = 0;
			return r;
		}

		return makeNode(result);
	}

	private ListNode makeNode(long number) {
		if(number == 0) {
			return null;
		}
		ListNode tmp = new ListNode();

		long tmpp = number % 10;
		tmp.val = (int)tmpp;
		tmp.next = makeNode(number / 10);
		return tmp;
	}

	private long reverseNumber(long number) {
		long tmp = 0;
		while(number > 0) {
			tmp *= 10;
			tmp += number % 10;
			number /= 10;
		}
		return tmp;
	}

	public static class ListNode {
		int val;
		ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
