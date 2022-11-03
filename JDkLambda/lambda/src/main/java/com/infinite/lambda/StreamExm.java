package com.infinite.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExm {
public static void main(String[] args) {
	List<Employ> employ =new ArrayList<Employ>();
	employ.add(new Employ(1,"swati",57755));
	employ.add(new Employ(1,"mah",60000));
	employ.add(new Employ(2, "madhu", 46572));
	
	Stream<Employ> empfil=
			employ.stream().filter(x-> x.getBasic()>=50000);
	employ.stream().filter(x-> x.getName().startsWith("s"));
	System.out.println("filter data");
	empfil.forEach(System.out::println);
	
	Collections.sort(employ,(e1,e2)->{
		return e1.getName().compareTo(e2.getName());
	});
	System.out.println("sort by name");
	employ.forEach(System.out::println);
	
	System.out.println("sort by basic");
	Collections.sort(employ,(e1,e2)->{
	return (int) (e1.getBasic()-e2.getBasic());
});

employ.forEach(System.out::println);
}
}
