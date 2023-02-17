package Serilization1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("BabuDetails.txt");

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream oos = new ObjectInputStream(fis);

		Me me = (Me) oos.readObject();

		System.out.println("My name is " + me.name);
		System.out.println("My correct age is " + me.age);
		System.out.println("I think I'm " + me.gender);
		System.out.println("I'm " + me.maritalStatus);
		System.out.println("My favourite color is " + me.favColor);
		System.out.println("My favourite job is " + me.favJob);
		System.out.println("My favorite hobbile is " + me.favHobbie);

	}

}
