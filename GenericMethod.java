package com.tnsif.genericmethod;

public class GenericMethod {
		public static<T> void displayArray(T[] array) {
			for(T i:array) {
				System.out.println("Array elements"+i);
			}
		}
	}



