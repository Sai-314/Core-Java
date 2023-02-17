package PropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPro {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\saira\\OneDrive\\Desktop\\Armorize\\Java Class videos\\Ram\\config.properties");

		FileInputStream fis = new FileInputStream(f);

		Properties pro = new Properties();
		pro.load(fis);
		String result = pro.getProperty("IpAddress");
		System.out.println(result);

	}
}
