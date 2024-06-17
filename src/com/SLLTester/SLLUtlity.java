package com.SLLTester;

import com.LLException.LLException;

public class SLLUtlity {
	private Node head;
	@SuppressWarnings("unused")
	private int count;

	public Node getHead() {
		return head;
	}

	public SLLUtlity() {
		head = null;
	}

	@SuppressWarnings("unused")
	public void insertAtStart(int data) throws LLException {
		Node n1 = new Node(data);
		if (n1 == null) {
			throw new LLException("System was unable to create a new node : Try again");
		}

		if (head == null) {
			head = n1;
		} else {
			n1.setNext(head);
			head = n1;
			count++;
		}

	}

	@SuppressWarnings("unused")
	public void insertLast(int data) throws LLException {
		Node n2 = new Node(data);
		if (n2 == null) {
			throw new LLException("System was unable to create a new node : Try again");
		}

		if (head == null) {
			head = n2;
		} else {

			Node temp2 = head;
			while (temp2.getNext() != null) {
				temp2 = temp2.getNext();
			}
			temp2.setNext(n2);
			count++;
		}
	}

	public void insertAtPos(int data, int post) {
		Node n3 = new Node(data);
		Node prev = head;
		for (int i = 1; i < post - 1; i++) {
			prev = prev.getNext();

		}
		n3.setNext(prev.getNext());
		prev.setNext(n3);

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();

	}

	public void findLargest() {
		int largest = getHead().getData();
		Node temp = head;
		while (temp != null) {
			if (temp.getData() > largest) {
				largest = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("Largest data is " + largest);

	}

	public void findSmallest() {
		int smallest = getHead().getData();
		Node temp = head;
		while (temp != null) {
			if (temp.getData() < smallest) {
				smallest = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("Smallest data is " + smallest);

	}

	public void EvenSum() {
		Node temp = head;
		int sum = 0;
		while (temp != null) {
			if (temp.getData() % 2 == 0) {
				sum += temp.getData();
			}
			temp = temp.getNext();

		}
		System.out.println("Sum of even data is :" + sum);
	}

	public void deleteFirst() throws LLException {
		if (head == null) {
			throw new LLException("LinkedList is empty !! Cannot perform delete operation: ");
		} else {
			head = head.getNext();
			System.out.println("1st element in the LL has been deleted !! ");
		}
	}

	public void deleteLast() throws LLException {
		if (head == null) {
			throw new LLException("LinkedList is empty !! Cannot perform delete operation: ");
		} else {
			Node temp = head;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			System.out.println("Element deleted at last position :");
		}

	}

	public void deleteAtPosition(int pos) throws LLException {
		Node ptr = head;

		if (head == null) {
			throw new LLException("LinkedList is empty !! Cannot perform delete operation: ");
		}

		if (pos == 1) {
			head = head.getNext();
			System.out.println("Element at position 1 has been deleted.");
			return;
		}

		for (int i = 1; i < pos - 1; i++) {
			ptr = head.getNext();
		}
		ptr.setNext(ptr.getNext().getNext());
		System.out.println("Element deleted at the specified location : ");

	}

}
