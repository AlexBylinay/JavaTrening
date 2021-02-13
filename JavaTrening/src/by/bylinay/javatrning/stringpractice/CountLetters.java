package by.bylinay.javatrning.stringpractice;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
	public static void main(String arrgs[]) {
		String s = "bfgjyngm5dtghgyj1";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			// если надо, то проверяем является ли символ буквой
			if (Character.isLetter(c)) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		
		System.out.println(entry.getKey() +" : "+ entry.getValue() +" ; " ); 
	}
}}