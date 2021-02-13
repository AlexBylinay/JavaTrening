package rps;

public enum RPS {
	ROCK(1), PAPPER(2), SCISSORS(3);

	private int rps;

	RPS(int rps) {
		this.rps = rps;
	}

	public static boolean isValid(int num) {
		return fromNum(num) != null;
	}

	public static RPS fromNum(int num) {
		for (RPS val : values()) {
			if (num == val.rps) {
				return val;
			}
		}
		return null;

	}

	public static boolean comparison(RPS input1, RPS input2) {

		if ((input1 == ROCK && input2 == PAPPER) || (input1 == PAPPER && input2 == SCISSORS)
				|| (input1 == SCISSORS && input2 == ROCK)) {
			return true;
		}
		return false;

	}

	public static int comparison2(RPS input1, RPS input2) {

		if ((input1 == ROCK && input2 == PAPPER) || (input1 == PAPPER && input2 == SCISSORS)
				|| (input1 == SCISSORS && input2 == ROCK)) {
			return 1;
		}
		if (input1 == input2) {
			return 3;
		}

		return 2;

	}

	public RoundRecult compare(RPS rps) {
		if (this == rps) {
			return RoundRecult.DRAW;
		}
		if ((this == ROCK && rps == PAPPER) || (this == PAPPER && rps == SCISSORS)
				|| (this == SCISSORS && rps == ROCK)) {
			return RoundRecult.LOST;
		}
		return RoundRecult.WON;
	}

}
