package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInStream {

	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\saira\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Armorize\\\\\\\\\\\\\\\\Java Class videos\\\\\\\\\\\\\\\\Ram\\\\\\\\\\\\\\\\fun1.txt");

		FileInputStream fis = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String read;
		String nulll = null;
		while ((read = br.readLine())!=null) {
			System.out.println(read);
		}
	}

}
