import java.util.Scanner;

class Node {
	public int data;
	public Node pre;
	public Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}

class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedList() {
	}

	public Node get(int idx) {
		if (idx < 0 || size <= idx) {
			return null;
		}

		if (idx < size / 2) {
			Node cur = head;
			for (int i = 0; i < idx; i++) {
				cur = cur.next;
			}
			return cur;
		} else {
			Node cur = tail;
			for (int i = size - 1; i > idx; i--) {
				cur = cur.pre;
			}
			return cur;
		}

	}

	public void addFirst(int data) {
		Node node = new Node(data);
		node.next = head;

		if (head != null) {
			head.pre = node;
		}

		head = node;
		size++;

		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(int data) {
		if (size == 0) {
			addFirst(data);
			return;
		}

		Node node = new Node(data);

		tail.next = node;
		node.pre = tail;
		tail = node;
		size++;
	}

	public void add(int idx, int data) {
		if (idx < 0 || size <= idx) {
			return;
		}
		if (idx == 0) {
			addFirst(data);
			return;
		}
		if (idx == size) {
			addLast(data);
			return;
		}

		Node node = new Node(data);
		Node pre = get(idx - 1);
		Node next = pre.next;

		node.pre = pre;
		node.next = next;

		pre.next = node;
		next.pre = node;

		size++;
	}

	public int removeFirst() {
		int data = head.data;

		head = head.next;
		size--;

		return data;
	}

	public int removeLast() {
		if (size == 0) {
			return 0;
		}

		int data = tail.data;

		tail = tail.pre;
		size--;

		return data;
	}

	public int remove(int idx) {
		if (idx < 0 || size <= idx) {
			return 0;
		}
		if (idx == 0) {
			removeFirst();
		}
		if (idx == size) {
			removeLast();
		}

		Node removeNode = get(idx);
		Node pre = get(idx - 1);
		Node next = pre.next;

		pre.next = next;
		next.pre = pre;

		size--;

		return removeNode.data;
	}
}

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			DoublyLinkedList list = new DoublyLinkedList();
			for (int i = 0; i < n; i++) {
				list.addLast(sc.nextInt());
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				String com = sc.next();
				if (com.equals("I")) {
					int idx = sc.nextInt();
					int len = sc.nextInt();
					for (int j = idx; j < idx + len; j++) {
						list.add(j, sc.nextInt()); // 삽입 위치 요소 추가
					}
				} else if (com.equals("D")) {
					int idx = sc.nextInt();
					int len = sc.nextInt();
					for (int j = idx; j < idx + len; j++) {
						list.remove(j);
					}
				} else if (com.equals("A")) {
					int len = sc.nextInt();
					for (int j = 0; j < len; j++) {
						list.addLast(sc.nextInt());
					}
				}
			}

			System.out.printf("#%d ", t);
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d ", list.get(i).data);
			}
			System.out.println();
		}
		sc.close();
	}
}