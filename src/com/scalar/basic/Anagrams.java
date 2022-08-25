package com.scalar.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Group anagrams of strings from given array of words. 
 * Input : String[] = {"eat", "ate", "tan", "tea", "hat", "nat", "bat"} 
 * Output : [["eat", "ate", "tea"], ["tan", "nat"], ["bat"]] 
 * NOTE : Anangrams are words containing similar characters. Ex: eat, ate, tea
 * 
 */
public class Anagrams {

	public static void main(String[] args) {
		String[] dataSet = { "eat", "ate", "tan", "tea", "hat", "nat", "bat" };
		List<String> anagrams = new ArrayList<String>();
		List<List<String>> result = new ArrayList<List<String>>();
		int currentSet = 0;
		for (int i = 0; i < dataSet.length - 1; i++) {
			if (anagrams.isEmpty() || (anagrams.isEmpty() ? true : !anagrams.contains(dataSet[i]))) {
				result.add(new ArrayList<String>());
				result.get(currentSet).add(dataSet[i]);
				for (int j = i + 1; j < dataSet.length; j++) {
					String currentText = sortChars(dataSet[i]);
					String nextText = sortChars(dataSet[j]);
					if (currentText.equals(nextText)) {
						anagrams.add(dataSet[j]);
						result.get(currentSet).add(dataSet[j]);
					}
				}
				currentSet++;
			}
		}
		System.out.print("[ ");
		result.forEach(dataList -> {
			System.out.print("[ ");
			dataList.forEach(data -> System.out.print(data+" "));
			System.out.print("] ");
			
		});
		System.out.print("]");
	}
	
	private static String sortChars(String data) {
		char[] dataArray = data.toCharArray();
		for (int i = 0; i < dataArray.length - 1; i++) {
			for(int j = 0; j < dataArray.length-i-1; j++) {
				char temp;
				if (dataArray[j] > dataArray[j + 1]) {
					temp = dataArray[j];
					dataArray[j] = dataArray[j + 1];
					dataArray[j + 1] = temp;
				}
			}
		}
		String result = new String(dataArray);		
		return result;
	}
}
