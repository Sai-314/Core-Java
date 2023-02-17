package Serilization1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilize {

	public static void main(String[] args) throws IOException {

		// Constructor wont consider static values we need to declare in object class
		Me me = new Me("Balababu", "Male", 30, "Single", "White", "Bank", "Eating chicken biryani");
		File file = new File("BabuDetails.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(me);

	}

}
