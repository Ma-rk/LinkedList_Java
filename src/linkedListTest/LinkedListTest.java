package linkedListTest;

import static org.junit.Assert.assertEquals;
import linkedList.LinkedList;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);

		assertEquals(6, linkedList.size());
		assertEquals(30, linkedList.get(2));
		assertEquals(10, linkedList.get(3));
		assertEquals("[10, 20, 30, 10, 20, 30]", linkedList.toString());

		linkedList.addFirst(1);
		linkedList.addFirst(5);
		assertEquals("[5, 1, 10, 20, 30, 10, 20, 30]", linkedList.toString());

		linkedList.add(1, 15);
		assertEquals("[5, 15, 1, 10, 20, 30, 10, 20, 30]", linkedList.toString());
		linkedList.add(4, 35);
		assertEquals("[5, 15, 1, 10, 35, 20, 30, 10, 20, 30]", linkedList.toString());

		assertEquals(5, linkedList.removeFirst());
		assertEquals(9, linkedList.size());
		assertEquals(15, linkedList.removeFirst());
		assertEquals(8, linkedList.size());
		assertEquals("[1, 10, 35, 20, 30, 10, 20, 30]", linkedList.toString());

		assertEquals(35, linkedList.remove(2));
		assertEquals(7, linkedList.size());
		assertEquals(10, linkedList.remove(4));
		assertEquals(6, linkedList.size());
		assertEquals("[1, 10, 20, 30, 20, 30]", linkedList.toString());

		assertEquals(30, linkedList.removeLast());
		assertEquals(5, linkedList.size());
		assertEquals(20, linkedList.removeLast());
		assertEquals(4, linkedList.size());
		assertEquals("[1, 10, 20, 30]", linkedList.toString());
	}
}
