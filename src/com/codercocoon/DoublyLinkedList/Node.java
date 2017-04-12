package com.codercocoon.DoublyLinkedList;

public class Node {
	Node previous;
	int data;
	Node next;

	Node(int _data) {
		previous = null;
		next = null;
		data = _data;
	}
}
