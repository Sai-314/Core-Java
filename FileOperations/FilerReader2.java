package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilerReader2 {
	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\\\\\\\Users\\\\\\\\saira\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Armorize\\\\\\\\Java Class videos\\\\\\\\Ram\\\\\\\\fun2.txt");

		FileReader fr = new FileReader(file);
		int i;

		// Her what happening is -1 is like a ASCII empty pixel value that's why if we
		// use !=-1 in while loop condition it will print until that empty pixel value

		while ((i = fr.read()) != -1) {
			System.out.println((byte) i + "-" + (char) i);
			// fr.close();
		}
	}

}
