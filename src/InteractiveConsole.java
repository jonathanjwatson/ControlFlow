import java.util.Scanner;

public class InteractiveConsole {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Character character = 'c';

		do {
			System.out.println("Enter another char command or q to quit: ");

			character = user.next().charAt(0);
			System.out.println(character);
		} while (character.compareTo('q') != 0 || character.compareTo('Q') != 0);

		System.out.println("Quit command entered!");
	}
}
