package com.qsp.mapprograms;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String>m=new HashMap<Integer,String>();
m.put(123,"ram");
	m.put(1134,"raj");
	m.put(234, "ragu");
	System.out.println(m);
	Map<Integer,String>m1=new HashMap<Integer,String>();
	m1.putAll(m);
	System.out.println(m);

	}

}
