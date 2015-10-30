package linkedList;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head != null)
			newNode.next = head;
		head = newNode;
		size++;
	}

	public void add(int index, Object data) {
		if (index == 0) {
			addFirst(data);
		} else {
			Node newNode = new Node(data);
			Node prevNode = getNode(index - 1);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			if (newNode.next == null)
				tail = newNode;
			size++;
		}
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public Object removeFirst() {
		Node returnNode = head;
		if (head != null)
			head = head.next;
		size--;
		return returnNode.data;
	}

	public Object remove(int index) {
		if (index == 0)
			return removeFirst();
		Node prevNode = getNode(index - 1);
		Node returnNode = prevNode.next;
		prevNode.next = prevNode.next.next;
		size--;
		return returnNode.data;
	}

	public Object removeLast() {
		if (tail == null)
			return null;
		return remove(size - 1);
	}

	public Object get(int index) {
		return getNode(index).data;
	}

	public int size() {
		return size;
	}

	private Node getNode(int index) {
		Node node = head;
		while (index-- > 0)
			node = node.next;
		return node;
	}

	public String toString() {
		if (head == null)
			return null;
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data + "]";

		return str;
	}

	public class Node {
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
}
