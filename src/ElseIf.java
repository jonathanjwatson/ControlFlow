import java.util.ArrayList;
import java.util.Arrays;

public class ElseIf {
	public static void main(String[] args) {
		// imagine a List, someList, that is created previous to this code
		ArrayList<String> someList = new ArrayList<String>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c",
				"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c"));

		Integer listSize = someList.size();

		if (listSize > 100) {
			System.out.println("List is really big!");
		} else if (listSize > 80) {
			System.out.println("List is kind of big.");
		} else if (listSize > 60) {
			System.out.println("List is just a little over half big.");
		} else if (listSize > 30 && listSize <= 59) {
			System.out.println("List is approaching small");
		} else {
			System.out.println("List is small");
		}
	}
}
