package com.account.iter.controller;

public class Account {
int id;
String name;
double balance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Account(int id, String name, double balan) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balan;
};
}
