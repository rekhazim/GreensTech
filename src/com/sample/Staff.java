package com.sample;

import java.util.LinkedList;
import java.util.List;

public class Staff {
	public static void main(String[] args) {
		List li = new LinkedList();
		
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(50);
		li.add(60);
		li.add(80);
		li.add(60);
		
		
		li.remove(2);
		li.remove(6);
		li.remove(4);
		
		System.out.println(li);
		
		
	}

}
