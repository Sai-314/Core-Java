package Serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserilize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("object.txt");

		FileInputStream fis = new FileInputStream(file);

		ObjectInputStream oos = new ObjectInputStream(fis);

		Person p = (Person) oos.readObject();

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
