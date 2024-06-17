package com.SLLTester;

import java.util.Scanner;

import com.LLException.LLException;

public class SLLTester {

	public static void main(String[] args) throws LLException {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		SLLUtlity l1 = new SLLUtlity();
		boolean exit=false;
		int choice;
		while(!exit) {
			System.out.println("1. Insert at start : "
					+ "\n2.Insert at last"
					+ "\n3.Display the LinkedList"
					+ "\n4.Exit"
					+ "\n5.Enter at postion :"
					+ "\n6.Find largest :"
					+ "\n7.Find smallest :"
					+ "\n8.Find Sum of even numbers from the LL"
					+ "\n9.Delete 1st node :"
					+ "\n10.Delete Last node :"
					+ "\n11.Delete Node at specific Location :");
			
			System.out.println("Enter choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the data : ");
				int data;
				data= sc.nextInt();
				l1.insertAtStart(data);
				System.out.println("New node added at first :");
				break;
			
			case 2:
				System.out.println("Enter the data : ");
				int data1;
				data1= sc.nextInt();
				l1.insertLast(data1);
				System.out.println("New node added at last :");
				break;
			
			case 3:
				l1.display();
				break;
				
			case 5:
				System.out.println("Enter the data and position to insert  : ");
				int data2;
				int post;
				data2=sc.nextInt();
				post=sc.nextInt();
				l1.insertAtPos(data2, post);
				System.out.println("Element inserted at your position :");
				break;
				
			case 4:
				exit = true;
				break;
				
			case 6:
				l1.findLargest();
				break;
				
			case 7:
				l1.findSmallest();
				break;
				
			case 8:
				l1.EvenSum();
				break;
			
			case 9:
				l1.deleteFirst();
				break;
				
			case 10:
				l1.deleteLast();
				break;
				
			case 11:
				System.out.println("Enter the position you want to delete :");
				int pos=sc.nextInt();
				l1.deleteAtPosition(pos);
				break;
				
			default:
				System.out.println("Invalid choice :");
				exit=true;
			}
		}

	}

}
