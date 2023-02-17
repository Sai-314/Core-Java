package OptionalClass;

import java.util.Optional;

public class Ex1 {

	public static void main(String[] args) {

		String str = null;

		Optional<String> op = Optional.ofNullable(str);

		if (op.isPresent()) {
			System.out.println(str.length());
		} else {
			System.out.println("It is null");
		}

	}

}
