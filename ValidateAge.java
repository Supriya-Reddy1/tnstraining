package com.tnsif.ExceptionHandling;

public class ValidateAge {
		public static void validateAge(int age) throws Exception,ArithmeticException {
			if(age<0) {
				throw new Exception("The entered age is not valid");
			}
			else {
				System.out.println("The age is valid");
			}
		}
		
	}



