package com.cg.mcqspractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class TestPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable obj = new Hashtable();
        obj.put("A", new Integer(3));
        obj.put("B", new Integer(2));
        obj.put("C", new Integer(8));
        obj.remove(new String("c"));
        System.out.println(obj);
        
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al.get(3));

        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(80, "pgs");
        h.put( 34, null);
        h.put(null, null);
        h.put(null, "sd");
         
        System.out.println(h);
        
        HashSet <Integer> h1 = new HashSet <Integer> ();
        h1.add(14);
        h1.add(59);
        Iterator<Integer> r =h1.iterator();
        while(r.hasNext()) {
                    System.out.println(r.next());
        } 


        int arr[] = new int[5];
        System.out.println(arr);
        
		abstract class xy
        {
        	abstract void sum(int x, int y);
        }
        


		

	}

}
