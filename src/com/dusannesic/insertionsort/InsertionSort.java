package com.dusannesic.insertionsort;

public class InsertionSort {

	public static char[] insertionSort(String ulaz) {
		char[] karakteri = ulaz.toCharArray();
		
		for (int i = 1; i < karakteri.length; i++) {
			char temp = karakteri[i];
			int j;
			for (j = i - 1; j >= 0 && temp < karakteri[j]; j--) {
				karakteri[j + 1] = karakteri[j];
			}
			karakteri[j + 1] = temp;
		}
		
		return karakteri;
	}
	
}
