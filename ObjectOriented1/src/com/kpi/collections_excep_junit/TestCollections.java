package com.kpi.collections_excep_junit;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestCollections {
     /**
     * @PiyushBodhani
     */
    public static void main(String args[])
     {
    	 ArrayList<String> list = new ArrayList<String>();
    	 list.add("a");
    	 list.add("b");
    	 list.add("b");
    	 list.add("c");
    	 list.add("d");
    	 list.add("e");
    	 list.add("e");
    	 for(int i=0;i<list.size();i++)
    	 {
    		 System.out.print(list.get(i)+" ");
    	 }
    	 System.out.println();
    	 ArrayList l1 = new ArrayList();
    	 
    	 l1.add(1);
    	 l1.add("Frnds");
//    	 System.out.println(list);
//    	 System.out.println(l1);
    	 
    	 
    	 ArrayList<Integer> list3 = new ArrayList<>();
    	 for(int i=0;i<10;i++)
    	 {
    		 list3.add(i);
    		
    	 }
    	 System.out.println(list3);
    	 
    	Set<String> set = new HashSet<String>();
    	Set set2 = new HashSet();
    	set.add("a");
    	set.add("a");
    	set.add("b");
    	set.add("c");
    	set.add("d");
    	set.add("d");
    	System.out.println(set);
        set2.add(1);
        System.out.println(set2);
    	 
    	 
       Map<String , Integer> map = new HashMap<>();
       map.put("a", 1);
       map.put("b", 2);
       map.put("c", 3);
       map.put("a", 2);
       map.get("a");
       System.out.println(map);
     }
}
