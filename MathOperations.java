package com.tnsif.lambda;

public class MathOperations {
		public static void main(String[] args) {
			MathCal add=(a,b)->a+b;
			MathCal mul=(a,b)->a/b;
			
			System.out.println(add.cal(500, 100));
			System.out.println(mul.cal(5,10));
			
		}

}
