package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Staff {
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(50);
		li.add(60);
		li.add(80);
		li.add(60);
		li.add(50);
		
		
		li.remove(1);
		li.remove(6);
		li.remove(7);
		
		System.out.println(li);
		
		
	}

}
