package by.bylinay.javatrening.ArrayPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayPractice_ {
	public static void main(String[] args) {
		int[] array = { 12, 5, 5, 12, 12, 5, 5, 12, 3, 3, 3, 3, -5, -5 };
		List<Integer> counts = countElements(array);
		System.out.println("pol = " + counts.get(0));
		System.out.println("otr = " + counts.get(1));
		System.out.println("zer = " + counts.get(2));
	}

	public static List<Integer> countElements(int[] array) {
		Integer polCount = 0;
		Integer otrCount = 0;
		Integer zeroCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				polCount++;
			} else if (array[i] == 0) {
				zeroCount++;
			} else {
				otrCount++;
			}
		}
		return Arrays.asList(new Integer[] { polCount, otrCount, zeroCount });

	}

	public static void changeMinMax(int[] array1) {

		int min = 0;
		int max = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > max)
				max = i;
			if (array1[i] < min)
				min = i;

		}

		int tmp = array1[max];
		array1[max] = array1[min];
		array1[min] = tmp;

	}

	public static int PopularNumber(int[] array2) {
		int[] popular = new int[array2.length];

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array2[i] == array2[j]) {
					popular[i]++;
				}
			}
		}

		int valResult = array2[0];
		int popResult = popular[0];
		for (int i = 0; i < popular.length; i++) {
			if (popular[i] > popResult) {
				popResult = popular[i];
				valResult = array2[i];
			}
			if ((popResult == popular[i]) && (array2[i] < valResult)) {
				valResult = array2[i];
			}
		}
		return valResult;

	}

}
