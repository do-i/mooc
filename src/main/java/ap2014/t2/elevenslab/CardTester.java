package ap2014.t2.elevenslab;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("10", "HEARTS", 10);
		if ("10 of HEARTS (point value = 10)".equals(c1.toString())) {
			System.out.println("PASS");
		} else {
			System.out.println("ERR:" + c1);
		}

	}
}
