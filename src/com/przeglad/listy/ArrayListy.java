package com.przeglad.listy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListy {

	private static Object Student;

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
    
//    //java 8
//	System.out.println("Traversing list through forEach() method:");  
//		list.forEach(a ->{
//			System.out.println(a);
//		});
//	
//	System.out.println("Traversing list through forEachRemaining() method:");  
//		Iterator<String> itr = list.iterator();
//		itr.forEachRemaining(a->{
//			System.out.println(a);
//		});
//	
//	 //Obiekty:
//		  //Creating user-defined class objects  
//		  Student s1=new Student(101,"Sonoo",23);  
//		  Student s2=new Student(102,"Ravi",21);  
//		  Student s3=new Student(103,"Hanumat",25);  
//	
//		  ArrayList<Student> stl = new ArrayList<Student>();
//		  stl.add(s1);
//		  stl.add(s2);
//		  stl.add(s3);
//		  Student st = null;
//		  Iterator<Student> itrl = stl.iterator();
//		  while(itrl.hasNext()) {
//			  st = (Student)itrl.next();
//			  System.out.println(st.rollno+" "+st.name+" "+st.age);
//		  }
//			  
//		  for(Student s: stl)
//			  System.out.println(s.rollno+" "+s.name+" "+s.age);
		  
//	//Java ArrayList Serialization and Deserialization Example
//		
//		try {
//		//Serialization  
//			FileOutputStream fos = new FileOutputStream("D:/file.txt");
//			
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(list);
//			
//			fos.close();
//			oos.close();
//		//Deserialization  
//            FileInputStream fis=new FileInputStream("D:/file.txt");  
//            ObjectInputStream ois=new ObjectInputStream(fis);  
//          ArrayList  listA=(ArrayList)ois.readObject();  
//          System.out.println(listA);    
//		}	
//		catch(Exception e)  
//	          {  
//	              System.out.println(e);  
//	          }  
		
//		  //Removing elements on the basis of specified condition  
//        list.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
//        for(String i: list)
//        	System.out.println(i);	
		
     //   Java ArrayList example of retainAll() method
        ArrayList<String> al=new ArrayList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ajay");  
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add("Ravi");  
        al2.add("Hanumat");  
        al.retainAll(al2);  
        System.out.println("iterating the elements after retaining the elements of al2");  
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
		  
		  
	}
}
