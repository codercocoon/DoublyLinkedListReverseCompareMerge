package javaspringexamples.DoublyLinkedList;

import java.util.Scanner;

public class TestReverseCompareMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		Node second = null;
		int size = 0;
		ReverseCompareMerge ll = new ReverseCompareMerge();

		System.out.println("##### Reverse a doubly linked list. #####");
		System.out.print("Enter the doubly linked list size : ");
		size = sc.nextInt();
		System.out.println("Enter the doubly linked list elements : ");
		while (size > 0) {
			head = ll.insertAtLast(head, sc.nextInt());
			size--;
		}
		head = ll.reverse(head);

		System.out.println("##### Compare two doubly linked lists. #####");
		System.out.print("The first doubly linked list : ");
		ll.print(head);
		System.out.print("Enter the second doubly linked list size : ");
		size = sc.nextInt();
		System.out.println("Enter the second doubly linked list elements : ");
		while (size > 0) {
			second = ll.insertAtLast(second, sc.nextInt());
			size--;
		}
		System.out.println("Result of comparing (1:OK, 0:KO) : " + ll.compareLists(head, second));

		System.out.println("##### Merge two sorted doubly linked lists. #####");
		head = null;
		second = null;
		System.out.print("Enter the size of the sorted doubly linked list A : ");
		size = sc.nextInt();
		System.out.print("Enter the elements of the sorted doubly linked list A : ");
		while (size > 0) {
			head = ll.insertAtLast(head, sc.nextInt());
			size--;
		}
		System.out.print("Enter the size of the sorted doubly linked list B : ");
		size = sc.nextInt();
		System.out.print("Enter the elements of the sorted doubly linked list B : ");
		while (size > 0) {
			second = ll.insertAtLast(second, sc.nextInt());
			size--;
		}
		ll.print(ll.mergeLists(head, second));
	}
}
