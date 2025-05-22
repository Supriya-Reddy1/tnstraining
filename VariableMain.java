package com.tnsif.variabledemo;

public class VariableMain {
		public static void main(String[] args) {
			Variable ob=new Variable();
			ob.numone=23;
			ob.number=34;
			int result=ob.numone=10;
			System.out.println("This is instance variable output"
					+result);
			ob.display();
			System.out.println("This is static variable output"
					+Variable.numthree);
			
		}
	}



