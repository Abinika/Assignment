package Ser;

import java.io.*;

public class User {
	File file = new File("D:user_data.txt");
	public void method() {
	boolean present = file.exists();
	if(present == false) {
		try {
			boolean created = file.createNewFile();
			System.out.println("File Created" + created);
		}catch (IOException e) {
			e.printStackTrace();
		}
	

}
	}
}
	