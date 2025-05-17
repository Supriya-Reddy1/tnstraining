package com.tnsif.genericsdemo;

public class SenderMain {
	public static void main(String[] args) {
		Sender<String> ob=new Sender<String>();
		ob.setMessage("Artificial Intelligence");
		System.out.println(ob.getMessage());
		
		
		Sender<Integer> o=new Sender<Integer>();
		o.setMessage(5000);
		System.out.println(o.getMessage());
		
	}
}



