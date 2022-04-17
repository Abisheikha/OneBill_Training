package com.ob.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator.OfInt;
import java.util.stream.IntStream;
/**
* @author Abisheikha
*/
public class ArraysClass {
	
		public static void main(String[] args) {
			System.out.println(Arrays.class);
			int arr[] = { 40, 70, 30, 20, 10 };

			List<int[]> asList = Arrays.asList(arr);
			System.out.println(asList);

			Arrays.sort(arr);
			int key = 10;
			System.out.println(Arrays.binarySearch(arr, key));

			System.out.println(Arrays.binarySearch(arr, 0, 2, 70));

			int[] copyOf = Arrays.copyOf(arr, 2);
			System.out.println(Arrays.toString(copyOf));

			int[] copyOfRange = Arrays.copyOfRange(arr, 1, 4);
			System.out.println(Arrays.toString(copyOfRange));

			int arr1[] = { 10, 20, 30 };
			boolean equals = Arrays.equals(arr, arr1);
			System.out.println(equals);

			Arrays.fill(arr1, 40);
			System.out.println(Arrays.toString(arr1));

			Arrays.fill(arr1, 0, 2, 70);
			System.out.println(Arrays.toString(arr1));

			int hashCode = Arrays.hashCode(arr);
			System.out.println(hashCode);

			Arrays.parallelSort(arr1);
			System.out.println(Arrays.toString(arr1));

			OfInt spliterator = Arrays.spliterator(arr);
			System.out.println(spliterator);

			int characteristics = spliterator.characteristics();
			System.out.println(characteristics);

			IntStream stream = Arrays.stream(arr);
			System.out.println(stream);

		}
	}


