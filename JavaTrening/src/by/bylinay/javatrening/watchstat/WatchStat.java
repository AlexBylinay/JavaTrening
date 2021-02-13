package by.bylinay.javatrening.watchstat;

public class WatchStat {

	private static final int HOURS_IN_DAY = 24;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int MINUTES_IN_DAY = HOURS_IN_DAY * MINUTES_IN_HOUR;
	private static final int PERCENT = 100;
	private static final int[] EXTRA_MULTIPLES = { 2, 3, 5 };

	public static void main(String[] args) {
		System.out.println("multiplicity Cance =" + multiplicityCance() + "%");
		System.out.printf("multiplicity Cance = %.2f%%", multiplicityCance());
		System.out.println("multiplicity Cance Rev =" + multiplicityCanceRev() + "%");
		System.out.printf("multiplicity Cance Rev = %.2f%%", multiplicityCanceRev());
		System.out.println("multiplicity Chance Dub  =" + doublesChance() + "%");
		System.out.printf("multiplicity Chance Dub = %.2f%%", doublesChance());

	}

	public static double doublesChance() {
		return watchChance(HOURS_IN_DAY);
	}

	public static double multiplicityCance() {
		int counter = 0;
		for (int h = 2; h < HOURS_IN_DAY; h++) {
			for (int m = 2; m < MINUTES_IN_HOUR; m++) {
				if (isMultiplicity(h, m)) {
					counter++;
				}
			}
		}
		return watchChance(counter);
	}

	public static boolean isMultiplicity(int h, int m) {
		return (h % m == 0 || m % h == 0) && isExtraMultiple(h) && isExtraMultiple(m);
	}

	public static boolean isExtraMultiple(int num) {
		for (int multi : EXTRA_MULTIPLES) {
			if (num % multi == 0) {
				return true;
			}
		}
		return false;

	}

	public static double watchChance(int counter) {
		return (double) counter / MINUTES_IN_DAY * PERCENT;
	}

	public static double multiplicityCanceRev() {
		int counter = 0;
		for (int h = 0; h < HOURS_IN_DAY; h++) {
			for (int m = 0; m < MINUTES_IN_HOUR; m++) {
				if (isMultiplicityCanceRev(h, m)) {
					counter++;
				}
			}
		}
		return watchChance(counter);
	}

	public static boolean isMultiplicityCanceRev(int h, int m) {
		return (h == (m % 10 * 10 + m / 10));
	}

}
