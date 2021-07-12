package com.przeglad.listy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListy {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
System.out.println("\n----Inny sposob ---- \n");		
		//inny sposob
		for(String i: list)
			System.out.println(i);
		

	}

}
