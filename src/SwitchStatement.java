
public class SwitchStatement {

	public static void main(String[] args) {
		printShirtSize('S');
	}

	public static void printShirtSize(char shirt) {
		String msg = " ";
		switch (shirt) {
		case 's':
		case 'S':
			msg = "Shirt is small";
			break;
		case 'm':
			msg = "Shirt is medium";
			break;
		case 'l':
			msg = "Shirt is large";
			break;
		case 'x':
			msg = "Shirt is Xtra large";
			break;
		default:
			msg = "Unknown shirt size";
			break;
		}
		System.out.println(msg);
	}

}
