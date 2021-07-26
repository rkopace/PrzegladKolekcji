package com.przeglad.listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Wprawki {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		Collections.sort(list);
		for(String i: list)
			System.out.println(i);
		
		ListIterator<String> li = list.listIterator(list.size());
		while(li.hasPrevious())
			System.out.println(li.previous());
		
		
		

	}

}
