package com.springcore.ci;

public class Addition {
private int a;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("integer constructor ");
}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}
private int b;
public Addition(double a, double b) {
	super();
	this.a = (int) a;
	this.b = (int) b;
	System.out.println("double constructor ");
}

public Addition(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("String constructor ");
}

}
