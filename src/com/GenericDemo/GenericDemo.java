package com.GenericDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList <String> al=new ArrayList <String>();
		al.add("asd");
		al.add("qwe");
		al.add("zxc");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		
		printColl(al);
		printColl(al2);
	}
	public static void printColl(ArrayList<?> a){
		Iterator<?> it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
