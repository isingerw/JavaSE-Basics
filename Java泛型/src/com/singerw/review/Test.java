package com.singerw.review;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	HashMap map = new HashMap();
	  map.put(1, new String("abc"));
	  map.put(2, "abc");
	  System.out.println(map.get(1) == map.get(2));
	  System.out.println(map.get(1).hashCode());
	  System.out.println(map.get(2).hashCode());

	  System.exit(0);
}
}
