package com.infinite.lambda;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
public static void main(String[] args) {
	List<Employ> employ =new ArrayList<Employ>();
	employ.add(new Employ(1,"swati",57765));
	employ.add(new Employ(2, "madhu", 4657889));
	System.out.println("employ list");
	employ.forEach(x->{
		System.out.println(x);
	});
	//employ.forEach(System.out.println);
}
}
