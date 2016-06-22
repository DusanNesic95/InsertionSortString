package com.dusannesic.main;

import java.util.Arrays;
import java.util.Scanner;

import com.dusannesic.insertionsort.InsertionSort;

public class Main {

	public static void main(String[] args) {
		String ulaz = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite rec:");			
		
		ulaz = scan.nextLine();
		
		while (ulaz.length() > 20) {
			System.err.println("Morate uneti rec kracu od 20 karaktera!");
			ulaz = scan.nextLine();
		}
		
		char[] rezultat = InsertionSort.insertionSort(ulaz);
		
		System.out.println("Rezultat je:");
		System.out.println(Arrays.toString(rezultat));
		
		scan.close();
	}
	
}
