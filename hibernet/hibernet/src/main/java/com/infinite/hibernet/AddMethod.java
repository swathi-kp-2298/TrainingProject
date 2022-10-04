package com.infinite.hibernet;

import java.io.Serializable;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddMethod  implements Serializable {
public int sums(){
	int n1,n2;

	int res;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	res=n1+n2;
	return res;
	
}
}
