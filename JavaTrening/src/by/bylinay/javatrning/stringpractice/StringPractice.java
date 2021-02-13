package by.bylinay.javatrning.stringpractice;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;

public class StringPractice {
	public static void main(String args[]) {
		String s = "123456789123456789";
		int firstElement = 3;
		int step = 4; 
	//	int task = 2;
		//if (task % 2 == 0) {
			System.out.println("result1: " + removeEvenChars(s));
			System.out.println("result2: " + removeEvenCharsAlt(s));
			System.out.println("result5: " + removeEvenChars2(s, firstElement, step));
	//	} else {
			//System.out.println("result3: " + removeNoEvenChars(s));
			//System.out.println("result4: " + removeNoEvenCharsAlt(s));
		//}
	}

	private static String removeEvenChars(String src) {
		StringBuffer sb = new StringBuffer(src);
		for (int i = 1; i <= src.length() / 2; i++) {
			sb.deleteCharAt(i);
		}
		return sb.toString();
	}

	private static String removeEvenCharsAlt(String src) {
		char[] arr = src.toCharArray();
		int length = src.length() % 2 == 0 ? src.length() / 2 : src.length() / 2 + 1;
		char[] result = new char[length];

		for (int i = 0; i < src.length(); i += 2) {
			result[i / 2] = arr[i];
		}
		return new String(result);
	}

	private static String removeNoEvenChars(String src) {
		StringBuffer sb = new StringBuffer(src);
		for (int i = 0; i <= src.length() / 2; i++) {
			sb.deleteCharAt(i);
		}
		return sb.toString();
	}

	private static String removeNoEvenCharsAlt(String src) {
		char[] arr = src.toCharArray();
		int length = src.length() % 2 == 0 ? src.length() / 2 : src.length() / 2 + 1;
		char[] result = new char[length];

		for (int i = 1; i < src.length(); i += 2) {
			result[i / 2] = arr[i];
		}
		return new String(result);
	}

	public static String deleteChars(String src, boolean even) {
		char[] arr = src.toCharArray();
		int length = src.length() % 2 == 0 ? src.length() / 2 : src.length() / 2 + 1;
		char[] result = new char[length];
		int start = even ? 0 : 1;
		for (int i = start; i < src.length(); i += 2) {
			result[i / 2] = arr[i];
		}
		return new String(result);
	}

	public static String deleteStep(String src, int firstElement, int step) {
		char[] arr = src.toCharArray();
		int length = src.length() % 2 == 0 ? src.length() / step : src.length() / step + 1;
		int lengthNev = length - firstElement;
		char[] result = new char[lengthNev];
		int start = firstElement;
		for (int i = start; i < src.length(); i += step) {
			result[i / 2] = arr[i];
		}
		return new String(result);

	}

	private static String removeEvenChars2(String src, int firstElement, int step) {
		StringBuffer sb = new StringBuffer(src);
		int reducingLength = (src.length() - firstElement)/step+1;
		for (int i = firstElement; i <=src.length()-reducingLength  ; i += step-1) {
			sb.deleteCharAt(i);}
			return sb.toString();
		}
		
	}
