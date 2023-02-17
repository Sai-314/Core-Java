package FileOperations;

import java.io.File;


public class TestFolder {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\saira\\OneDrive\\Desktop\\Armorize\\Java Class videos\\Ram");
		f.mkdir();
		System.out.println("New folder is created");
		
//		if(f.exists()) {
//			f.delete();
//			System.out.println("folder deleted succesfully");
//		}
//		else {
//			System.out.println("folder deletion failed");
//		}
	}
}
