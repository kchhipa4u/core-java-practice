package com.kan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "C");
		map.put(3, "D");
		map.put(4, "B");
		
		Set<Entry<Integer, String>> eSet= map.entrySet();
		Iterator<Entry<Integer, String>> itr = eSet.iterator();
		
		for (Entry<Integer, String> entry : eSet) {
			System.out.println("KEY "+ entry.getKey()+" "+"VALUE "+ entry.getValue());
		}
		
		
		
		for(int i=0; i < eSet.size(); i++)
		{
			if(itr.hasNext())
			{
				Entry ent =itr.next();
				System.out.println(ent.getValue());
				System.out.println(ent.getKey());
			}
		}
		
		ArrayList aL = new ArrayList();
	}

}
