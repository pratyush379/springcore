package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private String name;
private Set<String> phone;
private List<String> address;
private Map<String , String> courses;
public Set<String> getPhone() {
	return phone;
}
public void setPhone(Set<String> phone) {
	this.phone = phone;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}



}
