package Serilization1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizationB {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f = new File("Mobile Features.txt");

		FileInputStream fis = new FileInputStream(f);

		ObjectInputStream ois = new ObjectInputStream(fis);

		MobileFeaturesB mf = (MobileFeaturesB) ois.readObject();

		System.out.println(mf.getMobileName());
		System.out.println(mf.getPrice());
		System.out.println(mf.getColor());
		System.out.println(mf.getRam());
		System.out.println(mf.getRom());
		System.out.println(mf.getCamera());
		System.out.println(mf.getBattery());

	}

}
