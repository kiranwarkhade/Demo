package test;

import java.util.*;
import java.util.Map.Entry;
import java.util.jar.Attributes;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.text.Collator;
public class Demo {

	public static String reverseString(String input)
	{
		 
		String[] words=input.split(" ");
		StringBuilder reversed=new StringBuilder();
		for(int i=words.length -1 ; i>= 0; i--)
		{
			reversed.append(words[i]).append(" ");
		}
		
		return reversed.toString().trim();
	}
	public static void main(String[] args) {
		  
		
		
		String name="My name is Kiran";
		String reversed=reverseString(name);
		System.out.println("Original String: "+ name);
		System.out.println("Reversed String: "+ reversed);
		

	}
	
	
	/*
	 * import java.util.Comparator; import java.util.TreeSet; public class Tree {
	 * public static void main(String[] ars) { TreeSet<Integer> descendingSet=new
	 * TreeSet<>(Comparator.reverseOrder()); descendingSet.add(5);
	 * descendingSet.add(2); descendingSet.add(8); descendingSet.add(1);
	 * 
	 * for(Integer element: descendingSet) { System.out.println(element); } } }
	 */
	

	

		
		
			
			/*
			 * int[] a= {1,2,3,4,1,2,5,7,9,0,9,9};
			 * 
			 * ArrayList l=new ArrayList<>(); for(int i=0;i<a.length;i++) { l.add(a[i]); }
			 * System.out.println(l);
			 * 
			 * Map<Integer, Integer> ma = new HashMap<>();
			 * 
			 * for(int i=0;i<l.size();i++) { ma.putIfAbsent((Integer) ma.get(i),
			 * Collections.frequency(l, l.get(i))); }System.out.println(ma);
			 * 
			 * 
			 * 
			 * System.out.println(ma);
			 */
		public static void  gdcn()
		{		String[] st = { "a", "b", "C", "d", "O", "f", "g", "a", "b", "c", "a","O"};
			
		List list=new ArrayList();
		Collections.addAll(list, st);
		System.out.println(list);
		Map<String, Integer> map=new HashMap();
		for(int i=0;i<list.size();i++)
		{
			String elem=(String) list.get(i);
			map.put(elem, map.getOrDefault(elem,0)+1);
		}System.out.println(map);
		
		
		}
	}



