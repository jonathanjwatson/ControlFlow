import java.util.ArrayList;
import java.util.Arrays;

public class ForLoops {
	public static void main(String[] args) {
		for (int i = 100; i > 0; i = i - 2) {
//			statement(s);
			System.out.println(i);
		}

		ArrayList<String> listOfLetters = new ArrayList<String>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b",
				"c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c"));

		// Enhanced For Loop
		for (String letter : listOfLetters) {
			System.out.println(letter);
		}
	}
}
