import java.util.Random;

public class Branching {
	public static void main(String[] args) {

		Random random = new Random();
		Integer breakAt = random.nextInt(100);

		for (int i = 0; i < 100; i++) {
			if (i == breakAt) {
				System.out.println("Random number was: " + breakAt);
//				break;
				return;
			}
			System.out.println("Index: " + i);
		}
		
		
		// OTHER CODE BEING EXECUTED HERE
		System.out.println("After the loop");
	}
}
