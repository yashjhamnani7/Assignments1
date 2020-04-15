package com.spring.FirstSpringDemo;

public class Account {
	int id;
	String name;
	double balance;
	public Account(double balance, String name, int id) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public Account() {
		super();
	}
	//id
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//balance
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Project: " + name + " - " + id+"-"+balance;
	}



}