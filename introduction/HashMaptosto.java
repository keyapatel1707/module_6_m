package introduction;

import java.util.HashMap;
import java.util.Map;

public class HashMaptosto {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		 
		 // storing in hashmap
		 map.put(1, "Apple");
	     map.put(2, "Banana");
	     map.put(3, "mango");
	     map.put(4, "Date");
	     map.put(5, "chickoo");
	     
	    
	     System.out.println("Value for key 3: " + map.get(3));
	     System.out.println("Value for key 5: " + map.get(5));
	     System.out.println();
	     
	  
	     System.out.println("All key-value pairs in the HashMap:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	} 
}
