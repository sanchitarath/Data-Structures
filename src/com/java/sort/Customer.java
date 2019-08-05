package com.java.sort;
import java.lang.*;
import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	private Integer customerId;
	private String customerName;
	private Double salary;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return customerId + "\t" + customerName + "\t" + salary;
	}
	


	@Override
	public int compareTo(Customer o) {
		
		return this.customerId-o.getCustomerId();
	}
	
	public class NameCompare implements Comparator<Customer>
	{

		@Override
		public int compare(Customer o1, Customer o2) {
			
			return o1.getCustomerName().compareTo(o2.getCustomerName());
		}
		
	}
	public class SalaryCompare implements Comparator<Customer>
	{

		@Override
		public int compare(Customer o1, Customer o2) {
			// TODO Auto-generated method stub
			if(o1.getSalary()>o2.getSalary()) return -1;
			if(o1.getSalary()<o2.getSalary()) return 1;
			return 0;
		}
		
	}
	
	public class CustomerSorting implements Comparator<Customer>
	{
		

		@Override
		public int compare(Customer o1, Customer o2) {
			
			return Comparator.comparing(Customer::getCustomerName)
		              .thenComparing(Customer::getSalary)
		              .compare(o1, o2);
			
//			TODO STUPID code, remove below
//			int NameComparison= o1.getCustomerName().compareTo(o2.getCustomerName());
//			int SalaryComparison=o1.getSalary().compareTo(o2.getSalary());
//			// TODO Auto-generated method stub
//			
//			if(NameComparison==0)
//			{
//				return SalaryComparison;
//			}
//			return NameComparison;
		}
		
	}
	
}