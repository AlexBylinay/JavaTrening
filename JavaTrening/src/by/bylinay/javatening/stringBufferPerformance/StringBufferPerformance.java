package by.bylinay.javatening.stringBufferPerformance;

public class StringBufferPerformance {
	public static void main(String args[]) {

		String a = "A";
		String u = "123456789";
		int ind = 3;

		int insertsCount = 10000;
		long stringTime = cancatBenchmark(a, insertsCount);
		long bilTime = bilderBenchmark(a, insertsCount);
		printComparison(stringTime, bilTime, "Benchmark");

		insertsCount = 100000;
		stringTime = substrigBenchmark(u, insertsCount, ind);
		bilTime = subbuldierBenchmark(u, insertsCount, ind);

		printComparison(stringTime, bilTime, "extraction");
	}

	static long cancatBenchmark( String str, int count) {
		String s ="";
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			s += str;
		}
		return (System.currentTimeMillis() - start);
	}

	static long bilderBenchmark( String str, int count) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		sb.toString();
		return (System.currentTimeMillis() - start);
	}

	static long substrigBenchmark(String str, int count, int ind) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			str.substring(ind);
		}
		return (System.currentTimeMillis() - start);
	}

	static long subbuldierBenchmark(String str, int count, int ind) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < count; i++) {
			sb.substring(ind);
		}
		sb.toString();
		return (System.currentTimeMillis() - start);
	}

	static void printComparison(long stringTime, long bilTime, String operation) {
		System.out.printf("string %s: %dms\n", operation, stringTime);
		System.out.printf("bild %s: %dms\n", operation, bilTime);
		System.out.printf("delta for %s = %dms\n", operation, Math.abs(stringTime - bilTime));
		System.out.printf("stringTime / bildTime for %s = %.2f%%\n\n", operation,
				((double) stringTime / (bilTime) * 100));
		System.out.printf("spid stringTime / bildTime for %s = %.2f%%\n\n", operation,
				((double) bilTime / (stringTime) * 100));
	}

}

/*
 * long listTime = extractingSubstring(a, bilString, count); long bildlTime =
 * extractingSubstring(a,bilString, count); printComparison(listTime, bildlTime,
 * "extractingSubstring"); }
 * 
 * static long extractingSubstring( String u, StringBuilder bilString, int
 * count) { long start = System.currentTimeMillis(); for (int i = 0; i < count;
 * i++) { u.substring(3); } return (System.currentTimeMillis() - start);
 */
