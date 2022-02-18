package org.classtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListAndConversionOfListToSet {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(50);
		list.add(100);
		list.add(90);
		System.out.println("After adding all elements in the list are:");
		System.out.println(list);
		
		System.out.println("6------to copy value from list to set");
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		
		System.out.println("6-----to copy value from  list to linkedHashSet");
		Set<Integer> linkedset = new LinkedHashSet<>(list);
		System.out.println(linkedset);
		
		////to copy value from list to HashMap
		
		System.out.println("\n"+"---find its length");
		System.out.println(list.size());
		
		System.out.println("\n"+"---How to get the last index value in list(without hardcode index)");
		System.out.println(list.get(6));
		System.out.println(list.get(list.size()-1));
		
		System.out.println("\n"+"---How to get the middle index value in list");
		int middle = list.size()/2;
		int middlevalue=list.get(middle);
		System.out.print(middlevalue);
		
		System.out.println("\n"+"---How to get first 5 index values in list");
		
for (int i = 0 ; i <list.size(); i++) {
			
			if (i==5) {
				break;	
			}
			System.out.print(list.get(i));
		}
//  or
for (int i = 0; i <5; i++) {
	System.out.println(list.get(i));
}
		
		System.out.println("\n"+"---How to get last 5 index values in list");
		for (int i = 1; i < list.size(); i++) {
			Object lastfive=list.get(i);
			System.out.println(lastfive);
		}
		//or
		for (int i = list.size()-1; i>1; i--) {
			System.out.print(list.get(i)+("\t"));
		}
		
		System.out.println("\n"+"----print the alternate number in the list");
		for (int i = 0; i <list.size(); i=i+2) {
			System.out.print(list.get(i)+("\t"));
		}
		
		System.out.println("\n"+"-------Iterate list using for loop");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n"+"-------Iterate list using foreach loop");
		//Iterate using foreach loop
		for (Integer total : list) {
			System.out.println(total);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
