package introduction;

import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 1L; 
    int id;
    String name;

   
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

   
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class Serlializable {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(101, "keya");

        
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Object serialized to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s2 = (Student) in.readObject(); 
            in.close();
            fileIn.close();
            System.out.println("Object deserialized:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

	}


