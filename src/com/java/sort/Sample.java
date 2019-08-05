package com.java.sort;

import java.util.ArrayList;

import java.util.Collections;

import com.java.sort.Customer.CustomerSorting;
import com.java.sort.Customer.NameCompare;
import com.java.sort.Customer.SalaryCompare;


public class Sample {
public static void main(String[] args) {
	
	ArrayList<Customer> custlist=new  ArrayList<>();
	Customer cust1=new Customer();
	cust1.setCustomerId(1);
	cust1.setCustomerName("Sanchita");
	cust1.setSalary(25000.00);
	Customer cust2=new Customer();
	cust2.setCustomerId(12);
	cust2.setCustomerName("Shyam");
	cust2.setSalary(300000.00);
	Customer cust3=new Customer();
	cust3.setCustomerId(3);
	cust3.setCustomerName("Ankita");
	cust3.setSalary(125000.00);
	Customer cust4=new Customer();
	cust4.setCustomerId(4);
	cust4.setCustomerName("Pratima");
	cust4.setSalary(425000.00);
	Customer cust5=new Customer();
	cust5.setCustomerId(5);
	cust5.setCustomerName("Pratima");
	cust5.setSalary(425000.00);
	
	custlist.add(cust1);
	custlist.add(cust2);
	custlist.add(cust3);
	custlist.add(cust4);
	custlist.add(cust5);
	
 
	Collections.sort(custlist);
	System.out.println("After sorting according to ID");
	for (Customer customer : custlist) 
	{
		System.out.println(customer.getCustomerId() +"\t"+customer.getCustomerName()+"\t"+customer.getSalary());
	}
	
	NameCompare name=cust1.new NameCompare();
	Collections.sort(custlist,name);
	
	System.out.println("After sorting according to Name");
	
	for (Customer customer : custlist) 
	{
		System.out.println(customer.getCustomerId() +"\t"+customer.getCustomerName()+"\t"+customer.getSalary());
	}
	
	SalaryCompare salary=cust1.new SalaryCompare();
	//Collections.sort internally calls compare method and uses merge sort concept(Sorting lists)
	//Arrays.sort is for sorting primitive data types and uses quick sort
	Collections.sort(custlist,salary);
	
	System.out.println("After sorting according to salary");
	
	for (Customer customer : custlist) 
	{
		System.out.println(customer.getCustomerId() +"\t"+customer.getCustomerName()+"\t"+customer.getSalary());
	}
	
	CustomerSorting cust=cust1.new CustomerSorting();
	Collections.sort(custlist, cust);
    System.out.println("After sorting according to name and if same then salary");
	
//	for (Customer customer : custlist) 
//	{
//		System.out.println(customer);
//	}
	
	custlist.stream().forEach(System.out::println);
	custlist.stream().sorted(name);
	
}
}