package com.infinite.jdbcrealtime;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Mapexample {
	public static void main(String[] args) {
		Map<Integer ,String> data=new Hashtable<Integer,String>();
		data.put(1, "kusuma");
		data.put(2, "bbb");
		data.put(3, "cccc");
		int key;
		String result;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter key empno");
		key=sc.nextInt();
		result=data.getOrDefault(key, "notfound");
		System.out.println(result);
		
	}

}
