package introduction;

import java.util.ArrayList;
import java.util.HashSet;

public class hashsetremoveduplicateelement {

	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<>();
        namesList.add("aman");
        namesList.add("Bobby");
        namesList.add("Aman");
        namesList.add("Charei");
        namesList.add("Bobby");

        System.out.println("Original List: " + namesList);

       
        HashSet<String> namesSet = new HashSet<>(namesList);

        
        ArrayList<String> uniqueNames = new ArrayList<>(namesSet);

        System.out.println("List : " + uniqueNames);
    }
}
