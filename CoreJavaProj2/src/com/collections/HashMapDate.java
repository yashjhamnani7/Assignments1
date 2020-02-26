package com.collections;


import java.util.HashMap;
import java.util.Iterator;

class Date
{
private int day;
private int month;
private int year;
public Date(int day, int month, int year) {
super();
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

public boolean equals(Object ob)
{
Date d2=(Date)ob;
if(this.day==d2.day&&this.month==d2.month)
return true;
else
return false;
}

@Override
public int hashCode()
{
return 12;
}
@Override
public String toString() {
return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}



}

public class HashMapDate {

public static void main(String[] args) {
HashMap<Date, String> ht = new HashMap<>();
ht.put(new Date(12,3,2019), "Anand");
ht.put(new Date(23,6,2018), "Bipin");
ht.put(new Date(5,11,2011), "Chandan");
ht.put(new Date(5,11,2010), "Dawood");

Iterator<Date> itr = ht.keySet().iterator();
while(itr.hasNext()) {
Date d = itr.next();
System.out.println(d);
}
String s=ht.get(new Date(5,11,2012));
System.out.println("Call ="+s);



}

}