package Serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilize {

	public static void main(String[] args) throws IOException {

		Person p = new Person(56, "Ramya", 24);

		File file = new File("object.txt");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p);
	}

}
