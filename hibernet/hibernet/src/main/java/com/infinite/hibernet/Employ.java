package com.infinite.hibernet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Employ  implements Serializable{

	private int empid;
	private String name;
	private String dept;
	private String Desig;
	private int basic;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return Desig;
	}
	public void setDesig(String desig) {
		Desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public Employ(int empid, String name, String dept, String desig, int i) {
		//super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		Desig = desig;
		this.basic = i;
	}
	public Employ() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empid=" + empid + ", name=" + name + ", dept=" + dept + ", Desig=" + Desig + ", basic=" + basic
				+ "]";
	}
	
}
