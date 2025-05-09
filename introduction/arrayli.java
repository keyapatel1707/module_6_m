package introduction;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayli {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("mango");

        System.out.println("ArrayList contents:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Remove an item
        arrayList.remove("Banana");

        System.out.println("ArrayList after removing 'Banana': " + arrayList);

        // Using LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");

        System.out.println("\nLinkedList contents:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

       
        linkedList.addFirst("Elephant");

      
        linkedList.removeLast();

        System.out.println("LinkedList a: " + linkedList);
    }




	}


