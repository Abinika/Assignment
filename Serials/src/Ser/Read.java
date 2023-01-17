package Ser;
import java.io.*;
public class Read {
		public void example() {
			

			try {
			    FileWriter myWriter = new FileWriter("D:user_data.txt");
			    myWriter.write("Writes in the file");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
			    System.out.println("An error occurred.");
			    e.printStackTrace();
			}
		}
	}
