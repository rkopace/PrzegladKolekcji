package com.przeglad.listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListy {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
//		//Traversing list through Iterator  
//		Iterator<String> itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
//System.out.println("\n----Inny sposob ---- \n");		
//		//inny sposob
//		for(String i: list)
//			System.out.println(i);
//		
//System.out.println("\n----Metody Listy ---- \n");
//	
//	System.out.println(list.get(1));
//	list.set(2,"DOOOM");
//	for(String i: list)
//		System.out.println(i);
//
//System.out.println("\n----Sprtowanie ---- \n");
//System.out.println("--- Before ---");
//	for(String i: list)
//		System.out.println(i);
//	
//	Collections.sort(list);
//System.out.println("--- After ---");
//	for(String i: list)
//		System.out.println(i);
//
//System.out.println("--- ListIterator interface ---");
//
//	List<String> al = new ArrayList<String>();
//	al.addAll(list);
//    System.out.println("Traversing forward");
//	    ListIterator<String> itr2 = al.listIterator();
//	    
//	    while(itr2.hasNext())
//	    	System.out.println("index:"+itr2.nextIndex() + " value:" + itr2.next());
//	System.out.println("Traversing backward");    
//        while(itr2.hasPrevious())
//	    	System.out.println("index:"+itr2.previousIndex() + " value:" + itr2.previous());
//    
//    
    
    //java 8
	System.out.println("Traversing list through forEach() method:");  
		list.forEach(a ->{
			System.out.println(a);
		});
	
	System.out.println("Traversing list through forEachRemaining() method:");  
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	
	    
	
	
	}
	




	
}
