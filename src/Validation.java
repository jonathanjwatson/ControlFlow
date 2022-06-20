
public class Validation {
	public static void main(String[] args) {
//		CheckId(true, 22, true);
//		CheckId(false, 22, true);
		CheckId(true, 21, true);

	}

	static void CheckId(boolean validId, int age, boolean buyingAlc) {
//		Check to see if id is valid
		if (validId)

		{
			System.out.println("Valid ID presented");

//			Check to see if customer meets age requirements AND is buying alcohol.
			if ((age > 21) && (buyingAlc)) {
				System.out.println("Customer legal to purchase alcohol");
			}

//			If customer is not old enough OR is not buying alcohol, print the error.
			else {
				System.out.println("No alcohol sales to this person");
			}

		}

//		If id is not valid, print the error
		else {
			System.out.println("Error: Invalid license");
		}
	}
}
