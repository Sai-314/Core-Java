package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(
				"C:\\\\Users\\\\saira\\\\OneDrive\\\\Desktop\\\\Armorize\\\\Java Class videos\\\\Ram\\\\fun2.txt");

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f);
			String read = "How are you";
			fos.write(read.getBytes());
			System.out.println("Written Data Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
