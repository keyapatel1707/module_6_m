package introduction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopy
{
	public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "copy.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int byteData;
           
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
