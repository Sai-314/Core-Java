package FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\\\Users\\\\saira\\\\OneDrive\\\\Desktop\\\\Armorize\\\\Java Class videos\\\\Ram\\\\fun1.txt");
		FileWriter f = null;

		try {
			f = new FileWriter(file);
			f.write("Hiii \n");
		//	f.write("World");
			f.write("Grrrr");
			System.out.println("Written data successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			f.close();
		}
		// f.write("namasthe");
	}

}
