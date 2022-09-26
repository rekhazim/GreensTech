package com.sample;

import java.util.ArrayList;
import java.util.List;

public class School {

	public static void main(String[] args) {
		List Li = new ArrayList();
		
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(90);
		Li.add(10);
		
		for(int i=0; i<Li.size(); i++) {
			System.out.println(Li.get(i));
		}
		
		Li.remove(4);
		System.out.println(Li);
		}
	}


