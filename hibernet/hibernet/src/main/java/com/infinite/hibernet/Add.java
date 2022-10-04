package com.infinite.hibernet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Add implements Serializable {
 private int n1;
 private int n2;
 private int res;
public int getN1() {
	return n1;
}
public void setN1(int n1) {
	this.n1 = n1;
}
public int getN2() {
	return n2;
}

public Add() {
	super();
	// TODO Auto-generated constructor stub
}
public Add(int n1, int n2, int res) {
	super();
	this.n1 = n1;
	this.n2 = n2;
	this.res = res;
}
@Override
public String toString() {
	return "Add [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]";
}
public void setN2(int n2) {
	this.n2 = n2;
}
public int getRes() {
	return res;
}
public void setRes(int res) {
	this.res = res;
}
}
