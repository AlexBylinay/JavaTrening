package by.bylinay.javatrning.ListPerformance;

import java.util.*;

public class ListPerformance {
	public static void main(String[] args) {
		int size = 500000;

		List<Integer> aList = new ArrayList<>(size);
		List<Integer> lList = new LinkedList<>();
		fill(aList, size);
		fill(lList, size);

		int insertsCount = 1000;
		long aTime = midInsert(aList, insertsCount);
		long lTime = midInsert(lList, insertsCount);
		printComparison(aTime, lTime, "midInsert");

		int removesCount = 5000;
		aTime = removeStart(aList, removesCount);
		lTime = removeStart(lList, removesCount);
		printComparison(aTime, lTime, "removeStart");

		int searchCount = 1600;
		int val = 200000;

		aTime = searchElement(aList, searchCount, val);
		lTime = searchElement(lList, searchCount, val);
		printComparison(aTime, lTime, "searchStart");

		int sortCount = 100;
		aTime = sortElement(aList, sortCount);
		lTime = sortElement(lList, sortCount);
		printComparison(aTime, lTime, "sortElement");
	}

	static long midInsert(List<Integer> list, int count) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			int mid = list.size() / 2;
			list.add(mid, mid);
		}
		return  (System.currentTimeMillis() - start);
	}

	static long removeStart(List<Integer> list, int count) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			list.remove(0);
		}
		return  (System.currentTimeMillis() - start);

	}

	static long searchElement(List<Integer> list, int count, int val) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			list.contains(val);
		}
		return  (System.currentTimeMillis() - start);
	}

	static long sortElement(List<Integer> list, int count) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			Collections.sort(list, Collections.reverseOrder());
			Collections.sort(list);
			//System.out.println ();
		}
		return (System.currentTimeMillis() - start);
	}

	// static double spidMid (int insertsCount) {
	// double spid = insertsCount /) ;
	// }

	static void printComparison(long aTime, long lTime, String operation) {
		System.out.printf("array %s: %d /ms\n", operation, aTime);
		System.out.printf("linked %s: %d /ms\n", operation, lTime);
		System.out.printf("delta for %s = %dms\n", operation, Math.abs(aTime - lTime));
		System.out.printf("aTime / lTime for %s = %.2f%%\n\n", operation, ((double) aTime / (lTime) * 100));

	}

	static void fill(List<Integer> list, int size) {
		for (int val = 1; val <= size; val++) {
			list.add(val);

		}
	}
}