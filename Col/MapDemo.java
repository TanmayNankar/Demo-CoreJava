package com.cg.demo.Col;
import java.util.*;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	//	    Key(K) Value(V)
		Map<Integer,String> map = new HashMap <Integer,String>();
		
		map.put(10, "India");
		map.put(20, "China");
		map.put(10, "West Indies");
		
		System.out.println(map);
		System.out.println(map.get(10));
		
		
		Map<String,String> states = new HashMap <>();
		
		states.put("TS", "Telangana");
		states.put("MH", "Maharashtra");
		
		System.out.println(states);
		
	}
	
}
