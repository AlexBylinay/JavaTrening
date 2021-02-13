package by.bylinay.javatrning.ListPerformance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Understudy2 {

	public static void main(String[] args) {
int size = 1000000;
		long start = System.currentTimeMillis();
		List<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			linked.add(i);
		}
		start = System.currentTimeMillis();
		linked.set(size/2, -1);
		long replacementTimeLinkced = (System.currentTimeMillis() - start);
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(i);
		}
		start = System.currentTimeMillis();
		array.set(size/2, -1);
		long replacementTimeArray = (System.currentTimeMillis() - start);
		long differentReplacement = replacementTimeLinkced-replacementTimeArray;
		double divideReplacement = replacementTimeArray/replacementTimeLinkced;
		start = System.currentTimeMillis();
		linked.remove(0);
		long timeDeleteFirstLinked = (System.currentTimeMillis() - start);
		start = System.currentTimeMillis();
		array.remove(0);
		long timeDeleteFirstArray = (System.currentTimeMillis() - start);
		long differentDeleteFirst = timeDeleteFirstLinked-timeDeleteFirstArray ;
		start = System.currentTimeMillis();
		linked.indexOf(100000);
		long timeSearchLink= (System.currentTimeMillis() - start);
		start = System.currentTimeMillis();
		array.indexOf(100000);
		long timeSearchArray = (System.currentTimeMillis() - start);
		long differentTimeSearch = (timeSearchLink-timeSearchArray);
		double divideTimeSearch = timeSearchLink/timeSearchArray;
		System.out.println ( "replacement time likced ="+replacementTimeLinkced);
		System.out.println ( "replacement time array ="+replacementTimeArray);
		System.out.println ( "different replacement ="+differentReplacement);
		System.out.println ( " divide replacement ="+divideReplacement);
		System.out.println ( "Delete first element likced time  ="+timeDeleteFirstLinked);
		System.out.println ( "Delete first element Array time  ="+timeDeleteFirstArray);
		System.out.println ( "Different Delete First element ="+differentDeleteFirst);
		System.out.println ( "Time search element Link ="+timeSearchLink);
		System.out.println ( "Time search element Array ="+timeSearchArray);
		System.out.println ( "different Time Search ="+differentTimeSearch);
		System.out.println ( "Divide Time Search =" +divideTimeSearch );
	}
}
