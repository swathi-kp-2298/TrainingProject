package com.infinite.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExm {

public static void main(String[] args) {
	List<Employ> employ =new ArrayList<Employ>();
	employ.add(new Employ(1,"swati",57755));
	employ.add(new Employ(1,"mah",60000));
	employ.add(new Employ(2, "madhu", 46572));
	
	List<String> mapDemo=
			employ.stream().map(x-> x.getName()).collect(Collectors.toList());
	System.out.println("names list");
	mapDemo.forEach(System.out::println);
}
}
