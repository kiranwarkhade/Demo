package test;

import java.util.*;

class Tree {
	public static void main(String[] args) {
		
	motar_car_run();
	
	}
	
	
	public static void motar_car_run()
	{
		int[] a= {1,2,3,4,5,1,2,3};
    		List list=new ArrayList();
    		for(int i=0;i<a.length;i++)
    		{
    			list.add(a[i]);
    		}
    		System.out.println(list);
		   Map<Integer, Integer> map=new HashMap();
			for(int i=0;i<list.size();i++)
			{
				Integer ele=(Integer) list.get(i);
				map.put(ele, map.getOrDefault(ele, 0)+1);
				
			}System.out.println(map);
	}
  
	
  
	}







