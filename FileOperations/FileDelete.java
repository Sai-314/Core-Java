package FileOperations;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\saira\\OneDrive\\Desktop\\Armorize\\Java Class videos\\Ram\\fun1.text");
		if (f.exists()) {
			f.delete();
			System.out.println("File Deleted Successfully");
		} else {
			System.out.println("File Deletion Failed");
		}
	}

}
