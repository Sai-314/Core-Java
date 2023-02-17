package Serilize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilize {
	public static void main(String[] args) throws IOException {
		Person p = new Person(12, "nulll", 24);

		File file = new File("obj.txt");

		// Output streams are used to write/Input the data into the file
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p);
	}

}
