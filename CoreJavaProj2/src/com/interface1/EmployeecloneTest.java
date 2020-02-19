
package com.interface1;
class Date1 implements Cloneable 
{
	private int day;
	private int month;
	private int year;
	public Date1(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date1() {
		this.day = 10;
		this.month = 4;
		this.year = 2020;
	}
	@Override
	public String toString() {
		return "Date1 [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public Object clone() { 
		try {
			
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}





class Employee2 implements Cloneable {
	Date1 dob;

	public Employee2(Date1 dob) {
		this.dob = dob;
	}
	public Employee2() {
		
	}
	
	public Date1 getDob() {
		return dob;
	}
	public void setDob(Date1 dob) {
		this.dob = dob;
	}

	public Object clone() { 
		try {
			Employee2 e=(Employee2)super.clone();
			e.setDob((Date1)e.getDob().clone());
			return e;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "Employee2 [dob=" + dob + "]";
	}
	
}

public class EmployeecloneTest {
	public static void main(String args[]) {
		Date1 dt = new Date1(12,8,2019);
		//Date1 dt1 = new Date1(1,8,2019);
		Employee2 e = new Employee2(dt);
		//Employee2 e3 = (Employee)e.clone();
		//System.out.println(e2);
		//Employee2 e2= new Employee2(dt1);
		//(Employee2)e2.clone();
System.out.println("Shallow: " + (e.getDob()==e.getDob()));
		
	}
}
