package com.tnsif.lambda;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<String>
		p=str->str.length()>5;
		System.out.println(p.test("Supriya"));
		System.out.println(p.test("TNSIF1"));
	}
}





