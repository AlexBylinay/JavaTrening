package by.bylinay.javatrning.ListPerformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Understudy {

	public static void main(String[] args) {
		compareInsertIntoMidArray();
	}
		 
		 
	// int size = 1000000;
	// @SuppressWarnings("unused")
	// long start = System.currentTimeMillis();
	// List<Integer> linked = new LinkedList<Integer>();
	// List<Integer> array = new ArrayList<Integer>();
	// for (int i = 0; i < size; i++) {
	// linked.add(i);
	// array.add(i);
	// }

	public static void compareInsertIntoMidArray() {
		int size = 1000000;
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(i);
			linked.add(i);
		}
		long start = System.currentTimeMillis();
		array.set(size / 2, -1);
		long replacementTimeArray = (System.currentTimeMillis() - start);
		linked.set(size / 2, -1);
		long replacementTimeLinkced = (System.currentTimeMillis() - start);
		long differentReplacement = replacementTimeLinkced - replacementTimeArray;
		double divideReplacement = replacementTimeArray / replacementTimeLinkced;
		System.out.println ( "replacement time likced ="+replacementTimeLinkced);
		System.out.println ( "replacement time array ="+replacementTimeArray);
		System.out.println ( "different replacement ="+differentReplacement);
		System.out.println ( " divide replacement ="+divideReplacement);
	}
	
	public static void compareDeleteStart() {
		int size = 1000000;
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(i);
			linked.add(i);
		}
		long start = System.currentTimeMillis();
		linked.remove(0);
		long timeDeleteFirstLinked = (System.currentTimeMillis() - start);
		start = System.currentTimeMillis();
		array.remove(0);
		long timeDeleteFirstArray = (System.currentTimeMillis() - start);
		long differentDeleteFirst = timeDeleteFirstLinked - timeDeleteFirstArray;
		System.out.println ( "Delete first element likced time  ="+timeDeleteFirstLinked);
		System.out.println ( "Delete first element Array time  ="+timeDeleteFirstArray);
		System.out.println ( "Different Delete First element ="+differentDeleteFirst);
	}

	public static void findElementByValue() {
		int size = 1000000;
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(i);
			linked.add(i);
		}
		//fillingLinked(); 
		//fillingArray();
		long start = System.currentTimeMillis();
		linked.indexOf(size / 4);
		long timeSearchLink = (System.currentTimeMillis() - start);
		start = System.currentTimeMillis();
		array.indexOf(size / 4);
		long timeSearchArray = (System.currentTimeMillis() - start);
		long differentTimeSearch = (timeSearchLink - timeSearchArray);
		double divideTimeSearch = timeSearchLink / timeSearchArray;
		System.out.println ( "Time search element Link ="+timeSearchLink);
		System.out.println ( "Time search element Array ="+timeSearchArray);
		System.out.println ( "different Time Search ="+differentTimeSearch);
		System.out.println ( "Divide Time Search =" +divideTimeSearch );
	}

	//public static void fillingLinked() {
		//int size = 1000000;
		//List<Integer> linked = new LinkedList<Integer>();
		//for (int i = 0; i < size; i++) {
		//	linked.add(i);
	//	}
	//}
	//public static void fillingArray() {
	//	int size =1000000;
		//List<Integer> array = new ArrayList<Integer>();
		//for (int i = 0; i < size; i++) {
			//array.add(i);
			
		//}
	
}


