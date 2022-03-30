package com.ob.day11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
* @author Abisheikha
*/
public class Test {
	public static void main(String[] args) {
		HashMap<String, Long> hashMap = new HashMap<>();
		
		hashMap.put("Anu",9876543211l);
		hashMap.put("Sonu",9876532221l);
		hashMap.put("Uma",67896543211l);
		hashMap.put("Uma",6543211l);   //recent value is stored as it cannot have duplicate key
		hashMap.put(null,96543211l);
		hashMap.put(null,43211l);    //can accept null
	//	System.out.println(hashMap.get("Anu"));
	//	System.out.println("--------");
		Set<String> keySet = hashMap.keySet();
		for (String name : keySet) {
			System.out.println(name + ": " + hashMap.get(name));
		}
		Set<Entry<String, Long>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		
		System.out.println("---------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
