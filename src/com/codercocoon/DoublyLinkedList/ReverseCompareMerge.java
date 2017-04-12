package com.codercocoon.DoublyLinkedList;

/**
 * This class represents some operations about doubly linked lists, especially
 * how to reverse a doubly linked list, compare and merge two sorted doubly
 * linked lists.
 * 
 * @author contact@codercocoon.com.
 *
 */
public class ReverseCompareMerge {

	/**
	 * This method inserts element at first of the doubly linked list.
	 * 
	 * @param head
	 *            : head of the doubly linked list.
	 * @param _data
	 *            : the element to insert.
	 * @return
	 */
	public Node insertAtFirst(Node head, int _data) {
		Node node = new Node(_data);
		node.next = head;
		head.previous = node;

		print(node);
		return node;
	}

	/**
	 * This method inserts element at last of the doubly linked list.
	 * 
	 * @param head:
	 *            head of the doubly linked list.
	 * @param _data:
	 *            the element to insert.
	 * @return
	 */
	public Node insertAtLast(Node head, int _data) {
		if (head == null)
			head = new Node(_data);
		else {
			Node current = head;
			Node prev = head.previous;
			while (current != null) {
				prev = current;
				current = current.next;
			}
			Node node = new Node(_data);
			node.previous = prev;
			node.next = null;
			prev.next = node;
		}
		return head;
	}

	/**
	 * This method reverses a doubly linked list.
	 * 
	 * @param head
	 *            : the linked list which will be reversed.
	 * @return the linked list reversed.
	 */
	public Node reverse(Node head) {
		System.out.print("Input : ");
		print(head);

		Node current = head;
		Node prev = head.previous;
		Node next = null;
		while (current != null) {
			next = current.next;

			current.next = prev;
			current.previous = next;

			prev = current;
			current = next;
		}
		System.out.print("Ouput : ");
		print(prev);

		return prev;
	}

	/**
	 * This method checks if two doubly linked lists are the same :same elements
	 * in the same order.
	 * 
	 * @param headA
	 *            : the head of the 1st doubly linked list.
	 * @param headB
	 *            : the head of the 2nd doubly linked list.
	 * @return "1" if the linked lists are the same, "0" if not.
	 */
	int compareLists(Node headA, Node headB) {
		int result = 0;
		if (headA == headB)
			result = 1;
		else {
			Node currentA = headA;
			Node currentB = headB;
			while (currentA != null && currentB != null) {
				if (currentA.data != currentB.data) {
					break;
				} else {
					currentA = currentA.next;
					currentB = currentB.next;
				}
			}
			if (currentA == currentB)
				result = 1;
		}
		return result;
	}

	/**
	 * This methods merges two sorted doubly linked lists.
	 * 
	 * @param headA
	 *            : the head of the 1st doubly linked list.
	 * @param headB
	 *            : the head of the 2nd doubly linked list.
	 * @return the two doubly linked lists merged.
	 */
	public Node mergeLists(Node headA, Node headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;

		if (headA.data < headB.data) {
			headA.next = mergeLists(headA.next, headB);
			headA.next.previous = headA;
			headA.previous = null;
			return headA;
		} else {
			headB.next = mergeLists(headB.next, headA);
			headB.next.previous = headA;
			headB.previous = null;
			return headB;
		}
	}

	/**
	 * This method prints the elements of a doubly linked list.
	 * 
	 * @param head:head
	 *            of the doubly linked list
	 */
	void print(Node head) {
		if (head == null)
			System.out.println(head);
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + (current.next != null ? "<" : "") + "->");
				current = current.next;
				System.out.print((current == null) ? "NULL" : "");
			}
			System.out.println();
		}
	}
}
