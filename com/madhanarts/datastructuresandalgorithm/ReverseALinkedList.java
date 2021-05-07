package com.madhanarts.datastructuresandalgorithm;

class Node
{
	int data;
	Node next;
}

class LinkedList
{
	Node head;
	public void insert(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void show() {
		Node temp = head;
		while (temp != null) 
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
		System.out.println("NULL");
	}
	
	public void reverse() {
		Node previousNode, currentNode, nextNode;
	    currentNode = head;
	    previousNode = null;
	    
	    while(currentNode != null)
	    {
	        nextNode = currentNode.next;
	        currentNode.next = previousNode;
	        previousNode = currentNode;
	        currentNode = nextNode;
	    }
	    head = previousNode;
	}
	
}

public class ReverseALinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.show();
		list.reverse();
		list.show();
		
	}

}
