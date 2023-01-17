package Ser;
import java.io.*;
public class delete {

	public void sample() {
		File file = new File("D:user_data.txt");
		File file1 = new File("D:user_serialize.txt");

		if (file.exists() && file.delete() && file1.exists() && file1.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}

}
}
