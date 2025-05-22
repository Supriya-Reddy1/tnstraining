package com.tnsif.collections;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> dq=new PriorityQueue<String>();		
		dq.add("Supriya");
		dq.add("Harsha");
		dq.add("Abhi");
		dq.add("Reethu");
		
		for(String names:dq) {
			System.out.println(names);
		}
		
		PriorityQueue<Integer> d=new PriorityQueue<Integer>();
		
		d.add(700);
		d.add(600);
		d.add(100);
		d.add(10);
		
		for(int num:d) {
			System.out.println(num);
		}
		
	}


}
