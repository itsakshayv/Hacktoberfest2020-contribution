import java.util.Scanner;

class Linklist {
	static Node p = new Node(10);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		add(3);
		add(3);
		add(9);
		add(7);
		add(7);
		add(8);
		add(0);
		toStr();
		System.out.print("insert = ");
		int b = sc.nextInt();
		insert(50, b);
		toStr();
		delete(50);
		toStr();
		System.out.println("isfull : " + isfull());
		System.out.println("isempty : " + isempty());
		System.out.println(find(6));

	}

	public static void add(int d) {
		Node p = new Node(d);
		p.next = head;
		head = p;
	}

	public static void insert(int d, int b) {
		Node p = find(b);
		if (p == null) {
			add(d);
		} else {
			Node q = new Node(d);
			q.next = p.next;
			p.next = q;
		}
	}

	public static Node find(int d) {
		Node p = head;
		while (p.data != d) {
			if (p.next == null) {
				return null;
			} else
				p = p.next;
		}
		return p;
	}

	public static Node delete(int d) {
		Node r = head;
		Node p = head;
		while (p.data != d) {
			if (p.next == null) {
				return null;
			} else
				r = p;
			p = p.next;
		}
		if (p == head) {
			head = head.next;
		} else {
			r.next = p.next;
		}

		return p;
	}

	public static boolean isempty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public static void toStr() {
		Node p = head;
		for (; p != null;) {
			System.out.print(p.data + "\t");
			p = p.next;
		}
		System.out.println();
	}

	public static boolean isfull() {
		return false;
	}

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}

	}

	static Node head = null;
}
