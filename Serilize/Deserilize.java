package Serilize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("obj.txt");

		// Input streams are used to read/get the data from the file.
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream oos = new ObjectInputStream(fis);

		// By create object through type casting we can read data.
		Person p = (Person) oos.readObject();

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
