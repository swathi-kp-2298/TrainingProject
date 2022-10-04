package com.infinite.hibernet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable {
public List<Employ> showEmploy(){
	List<Employ> employList=new ArrayList<Employ>();
	employList.add(new Employ(1111, "Swathii", "dev", "se", 40000));
	return employList;
}
}
