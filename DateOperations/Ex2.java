package DateOperations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		Date dateObj = new Date();

		String pattern = "dd MMMM yyyy hh:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(dateObj);

		System.out.println(date);
	}
}
