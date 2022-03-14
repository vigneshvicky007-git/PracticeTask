package com.logic.java;

import java.util.Collections;
import java.util.HashMap;import java.util.Map;

public class KeyValueMapping {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 18);
		map.put(2, 20);
		map.put(3, 45);
		map.put(4, 8);
		map.put(5, 6);
		
		int maxValue=(Collections.max(map.values()));
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()==maxValue) {
				System.out.println("Max Key is - "+entry.getKey());
			}
		}
		Integer min=Collections.min(map.entrySet(),Map.Entry.comparingByValue()).getKey();
		System.out.println("Min Key is - "+min);
	}

}
