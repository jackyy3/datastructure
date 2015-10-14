package com.datastructure.homework8.com.datastructure.homework8;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
	/**
	 * Returns an array of the frequencies of each element in a. That is, if the
	 * returned array is f, then a[i] occurs f[i] times in a.
	 * 
	 * @return the frequency array
	 */
	public static int[] frequencyOfElements(int[] a) {
		if (a == null) {
			return null;
		}
		int[] result = new int[a.length];
		Map<Integer, Integer> frequencyCounts = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!frequencyCounts.containsKey(a[i])) {
				frequencyCounts.put(a[i], 1);
			} else {
				int value = frequencyCounts.get(a[i]);
				frequencyCounts.put(a[i], ++value);
			}
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = frequencyCounts.get(a[i]);
		}
		return result;
	}
}