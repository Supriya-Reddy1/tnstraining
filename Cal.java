package com.tnsif.Cal;

public class Cal {
	int add(int a, int b) {
		return a+b; }
		float add(float a, float b) {
			return a+b;
		}
		public static void main(String[] args) {
			Cal ob=new Cal();
			System.out.println(ob.add(5, 10));
			System.out.println(ob.add(15.0f, 5.0f));

		}

	}