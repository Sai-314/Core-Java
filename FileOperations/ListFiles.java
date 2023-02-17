package FileOperations;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\saira\\OneDrive\\Desktop\\Armorize\\Java Class videos\\Ram");
		File[] listFiless = f.listFiles();

		for (File f2 : listFiless) {
			boolean isFile = f2.isFile();
			boolean isFolder = f2.isDirectory();
			System.out.println((isFile ? "File name = " : "Folder name = ") + f2.getName());
		}

	}

}
