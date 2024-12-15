package CollectionFramework;

import java.util.LinkedList;

public class LinkedListImplementsDQueue {

	public static void main(String[] args) {
		
		
		LinkedList t = new LinkedList();
		
		
		t.add("Hi");
		t.add(100);
		t.add(10.98);
		t.add('A');
		t.add('V');
		t.add("Bye");
		
		System.out.println("Before adding a new element to the LinkedList");
		System.out.println(t);
		
		
		System.out.println("After adding a new element to the LinkedList at first index");
		t.addFirst("Welcome");
		System.out.println(t);
		
		System.out.println("Before adding a new element to the LinkedList at last index");
		System.out.println(t);
		
		System.out.println("After adding a new element to the LinkedList at last index");
		t.addLast("Byee");
		System.out.println(t);
		
		
		System.out.println("Before removing fiest and last element from the LinkedList");
		System.out.println(t);
		System.out.println("After removing fiest and last element from the LinkedList");
		t.removeFirst();
		t.removeLast();
		System.out.println(t);
		
		System.out.println("retrieve first element: " +t.getFirst());
		System.out.println("retrieve last element: " +t.getLast());
		
		

	}

}
