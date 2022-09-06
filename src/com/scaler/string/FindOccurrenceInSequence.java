package com.scaler.string;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FindOccurrenceInSequence {

	/**
	 * Given a string with repetitive characters, find occurrence of each character
	 * in sequence and return it as a string
	 * 
	 * Ex : aasssddfaaaddddgg -> 2a3s2d1f3a4d2g
	 */
	public static void main(String[] args) {
		findOccurrence("aasssddfaaaddddgg");
		findOccurencesInSequence("aasssddfaaaddddgg");
	}

	private static void findOccurrence(String s) {
		char[] charArr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < charArr.length; i++) {
			if (!hm.containsKey(charArr[i])) {
				hm.put(charArr[i], 1);
			} else {
				int count = hm.get(charArr[i]);
				hm.put(charArr[i], count + 1);
			}
		}

		String result = hm.keySet().stream().map(key -> hm.get(key).toString() + key.toString())
				.collect(Collectors.toList()).stream().collect(Collectors.joining(""));
		System.out.println(result);
	}

	private static void findOccurencesInSequence(String s) {
		String result = "";
		char[] charArr = s.toCharArray();

		char prev = charArr[0];
		int count = 1;
		for (int i = 1; i < charArr.length; i++) {
			if (charArr[i] == prev) {
				count += 1;
				continue;
			}
			result = result + count + prev;
			count = 1;
			prev = charArr[i];
		}
		result = result + count + prev;
		count = 1;

		System.out.println(result);

	}

}
