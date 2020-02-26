package com.collections;

import com.classandobjects.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class DOB {
	private int day;
	private int month;
	private int year;

	public DOB(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "" + day + "/" + month + "/" + year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object d) {
		DOB dob = (DOB) d;
		if(this.year>dob.year)
			return false;
		else if(this.year<dob.year)
			return false;
		else if (this.year==dob.year && this.month > dob.month)
			return false;
		else if (this.year==dob.year && this.month < dob.month)
			return true;
		else if (this.year==dob.year && this.month == dob.month && this.day > dob.day)
			return false;
		else if (this.year==dob.year && this.month == dob.month && this.day < dob.day)
			return true;
		else
			return true;
	}
	@Override
	public int hashCode()
	{
		return 10;
	}
}



public class EmployeeMap 
{

	public static void main(String args[])
	{
		
			HashMap<DOB, String> hm=new HashMap<>();
			hm.put(new DOB(5, 2, 1997), "ABC");
			hm.put(new DOB(10, 7, 1996), "DEF");
			hm.put(new DOB(5, 2, 1997), "DEF");
			Iterator<DOB> i=hm.keySet().iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println(hm.get(new DOB(5, 2, 2000)));




		}

		}

