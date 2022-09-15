package com.scaler.basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


/**
 * Strugacarro is a planet whose year is divided into four seasons: winter, spring, summer and autumn in that order. 
 * A year has N days and every season lasts for exactly N/4 days. The year starts on the first day of winter and ends on the last day of autumn.
 * 
 * Given the history of temperatures from the previous year, find the season with the highest amplitude of temperatures. 
 * The amplitude is the difference between the highest and lowest temperatures over the given period. 
 * Assume that all seasons within one year have different temperature amplitudes.
 * 
 * Write a function:
 * 
 * function solution(T);
 * 
 * that, given an array T of N integers denoting the temperatures on all days of the year, 
 * returns a string with the name of the season with the highest temperature amplitude (one of the following: "WINTER", "SPRING", "SUMMER", "AUTUMN").
 * 
 * For example, given T = [−3, −14, −5, 7, 8, 42, 8, 3]: the function should return "SUMMER", since the highest amplitude (34) occurs in summer.
 * 
 * Given T = [2, −3, 3, 1, 10, 8, 2, 5, 13, −5, 3, −18]: the correct answer is "AUTUMN" (amplitude equals 21).
 * 
 * Assume that:
 * The number of elements in the array is divisible by 4; each element of array T is an integer within the range [−1,000..1,000]; 
 * N is an integer within the range [8..200]; Amplitudes of all seasons are distinct. In your solution, focus on correctness. 
 * The performance of your solution will not be the focus of the assessment.
 * 
 * */
public class TempAmplitude {

	public static void main(String[] args) {
		System.out.println(new TempAmplitude().bestSolution(new int[] { -1, -10, 10, 5, 30, 15, 20, -10, 30, 10, 29, 20 }));		
	}

	enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN
	}

	public String solution(int[] T) {
		final int count = T.length / 4;
		int indx = 0;
		int last = Integer.MIN_VALUE;
		for (int i = 0; i < 4; ++i) {
			int diff = IntStream.of(T).skip(count * i).limit(count).max().getAsInt()
					- IntStream.of(T).skip(count * i).limit(count).min().getAsInt();
			if (diff > last) {
				indx = i;
				last = diff;
			}
		}
		final String[] seasons = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
		return seasons[indx];
	}

	public String solution1(int[] T) {
		int totalTempReadings = T.length;
		int median = totalTempReadings / 4;
		ArrayList<Integer> winterTemp = new ArrayList<Integer>();
		ArrayList<Integer> springTemp = new ArrayList<Integer>();
		ArrayList<Integer> summerTemp = new ArrayList<Integer>();
		ArrayList<Integer> autumnTemp = new ArrayList<Integer>();

		for (int i = 0; i < totalTempReadings; i++) {
			if (i >= 0 && i <= median - 1) {
				winterTemp.add(T[i]);
			} else if (i >= median && i <= (2 * median) - 1) {
				springTemp.add(T[i]);
			} else if (i >= 2 * median && i <= (3 * median) - 1) {
				summerTemp.add(T[i]);
			} else if (i >= 3 * median && i <= (4 * median) - 1) {
				autumnTemp.add(T[i]);
			}
		}
		winterTemp.sort((a, b) -> a > b ? 1 : -1);
		int winterAmplitude = Math.abs(Math.abs(winterTemp.get(winterTemp.size() - 1)) - Math.abs(winterTemp.get(0)));
		springTemp.sort((a, b) -> a > b ? 1 : -1);
		int springAmplitude = Math.abs(Math.abs(springTemp.get(springTemp.size() - 1)) - Math.abs(springTemp.get(0)));
		summerTemp.sort((a, b) -> a > b ? 1 : -1);
		int summerAmplitude = Math.abs(Math.abs(summerTemp.get(summerTemp.size() - 1)) - Math.abs(summerTemp.get(0)));
		autumnTemp.sort((a, b) -> a > b ? 1 : -1);
		int autumnAmplitude = Math.abs(Math.abs(autumnTemp.get(autumnTemp.size() - 1)) - Math.abs(autumnTemp.get(0)));

		System.out.println("WINTER: " + winterAmplitude + "||" + "SPRING: " + springAmplitude + "||" + "SUMMER: "
				+ summerAmplitude + "||" + "AUTUMN: " + autumnAmplitude);

		Map<Integer, Seasons> seasonAmplitude = new HashMap<Integer, Seasons>();
		seasonAmplitude.put(winterAmplitude, Seasons.WINTER);
		seasonAmplitude.put(springAmplitude, Seasons.SPRING);
		seasonAmplitude.put(summerAmplitude, Seasons.SUMMER);
		seasonAmplitude.put(autumnAmplitude, Seasons.AUTUMN);

		List<Integer> alltemps = Arrays
				.asList(new Integer[] { winterAmplitude, springAmplitude, summerAmplitude, autumnAmplitude });
		alltemps.sort((a, b) -> a > b ? 1 : -1);
		return seasonAmplitude.get(alltemps.get(alltemps.size() - 1)).name();
	}
	
	/**
	 * BEST SOLUTION: https://codereview.stackexchange.com/questions/211248/search-for-the-biggest-amplitude-in-an-array
	 * */
	public String bestSolution(int[] T) {
	    final int count = T.length / 4;
	    int indx = 0;
	    int last = Integer.MIN_VALUE;
	    for (int i = 0; i < 4; ++i) {
	        int diff = IntStream.of(T).skip(count * i).limit(count).max().getAsInt()
	                 - IntStream.of(T).skip(count * i).limit(count).min().getAsInt();
	        if (diff > last) {
	            indx = i;
	            last = diff;
	        }
	    }
	    final String[] seasons = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
	    return seasons[indx];
	}
	
}
