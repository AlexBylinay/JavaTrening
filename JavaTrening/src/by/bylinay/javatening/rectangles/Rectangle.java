package by.bylinay.javatening.rectangles;

/**
 * class checks whether two buildings can fit on the zone
 * 
 * @author 37529
 *
 */

public class Rectangle {

	int length;
	int width;

	/**
	 *
	 * @param length
	 *            parameter for describing the size of one of the sides of a
	 *            rectangle
	 * @param width
	 *            parameter for describing the size of the second side of the
	 *            rectangle
	 * 
	 * @throws IllegalArgumentException if negative dimension
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

		if (length <= 0 || width <= 0) {
			throw new IllegalArgumentException(" Cannot create Rectangle instance - positive arguments required");
		}

		// if (length <= 0 || width <= 0) {
		// System.out.println("");
		// }
	}

	/**
	 * rotates the rectangle if necessary
	 */
	public void rotate() {
		int tempLength = length;
		length = width;
		width = tempLength;
	}

	/**
	 * checks rectangle fits into the zone
	 * 
	 * @param zone
	 * @return
	 */
	public boolean fitsInto(Rectangle zone) {
		return ((zone.length >= length && zone.width >= width) || (zone.length >= width && zone.width >= length));

	}

	private static final String CHECK_FORMAT = "b1: %s and b2: %s %s into zone: %s%n";
	private static final String PAIR_FORMAT = "%dx%d";
	private static final String DOES_FIT = "DOES FIT";
	private static final String DOESNT_FIT = "DOESN'T FIT";

	public static void main(String[] arg) {

		/*Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(9, 6);
		Rectangle zone = new Rectangle(9, 7);
		// if (length > 0 || width >0) {
		check(building1, building2, zone);// }

		building1 = new Rectangle(9, 1);
		building2 = new Rectangle(9, 6);
		zone = new Rectangle(9, 7);
		// if (length > 0 || width >0) {
		check(building1, building2, zone);// }

		building1 = new Rectangle(9, 1);
		building2 = new Rectangle(4, -9);
		zone = new Rectangle(5, 9);
		// if (length > 0 || width >0) {
	
		check(building1, building2, zone);// }*/
		
		
	 new Rectangle(9, -1);
	
	
	}

	static void check(Rectangle building1, Rectangle building2, Rectangle zone) {

		boolean result = solve(building1, building2, zone);

		System.out.printf(CHECK_FORMAT, formatPair(building1), formatPair(building2), result ? DOES_FIT : DOESNT_FIT,
				formatPair(zone));

	}

	private static String formatPair(Rectangle rect) {
		return String.format(PAIR_FORMAT, rect.length, rect.width);
	}

	/**
	 * substitutes combinations and solves the task
	 * 
	 * @param building1 rectangle that we will check if it fits
	 * @param building2 rectangle that we will check if it fits
	 * @param zone 
	 * @return
	 */
	public static boolean solve(Rectangle building1, Rectangle building2, Rectangle zone) {

		for (CombinationsEnum combo : CombinationsEnum.values()) {
			Rectangle circum = combo.circumscribe(building1, building2);
			if (circum.fitsInto(zone)) {
				return true;
			}
		}
		return false;
	}

}
