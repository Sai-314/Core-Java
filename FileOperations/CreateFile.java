package FileOperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\saira\\OneDrive\\Desktop\\Armorize\\Java Class videos\\Ram\\Ramam12345");
		
		
			try {
				if(!f.exists()) {
				f.createNewFile();
				System.out.println("New File is Created");
				}
			} catch (IOException e) {
				System.out.println("File Creation Failed");
				//e.printStackTrace();
			}

	}

}
