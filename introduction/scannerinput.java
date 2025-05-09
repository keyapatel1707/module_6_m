package introduction;

import java.util.Scanner;

public class scannerinput {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        scanner.close();

      
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}