package com.java.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
	private String name;
	private int id;
	private List<Mark> marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		String str1= name+"\t"+id+"\n";
		for(Mark m:marks)
		{
			// str1+=m;shortcut
			str1= str1+m;
			str1+="\n";
		}
		
		
		return str1;
	}

	public class Mark implements Comparable 
	{
		String subject;
		int marks;
       
		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public int compareTo(Object markobj) {
			Mark m = (Mark) markobj;
			return this.getMarks() - m.getMarks();

		}

		@Override
		public String toString() {
			String str = subject + "\t"+ marks;
			return str;
		}
	}

	public static void main(String[] args) {
		
		SortStudent s1= new SortStudent();
		s1.setId(1);
		s1.setName("sanchita");
		
		
		Mark m1= s1.new Mark();
		m1.setSubject("Phy");
		m1.setMarks(60);
		
		Mark m2= s1.new Mark();
		m2.setSubject("Chem");
		m2.setMarks(23);
		
		Mark m3= s1.new Mark();
		m3.setSubject("Bio");
		m3.setMarks(98);
		List<Mark> marklist= new ArrayList<>();
		marklist.add(m1);
		marklist.add(m2);
		marklist.add(m3);
		
		s1.setMarks(marklist);
		
		SortStudent s2= new SortStudent();
		s2.setId(2);
		s2.setName("shyam");
		
		
		Mark m4= s2.new Mark();
		m4.setSubject("Phy");
		m4.setMarks(99);
		
		Mark m5= s1.new Mark();
		m5.setSubject("Chem");
		m5.setMarks(87);
		
		Mark m6= s1.new Mark();
		m6.setSubject("Bio");
		m6.setMarks(60);
		List<Mark> marklist1= new ArrayList<>();
		marklist1.add(m4);
		marklist1.add(m5);
		marklist1.add(m6);
		
		s2.setMarks(marklist1);
		
		List<SortStudent> student= new ArrayList<>();
		student.add(s1);
		student.add(s2);
		
		
		
		for(SortStudent s:student)
		{
			List<Mark> mark=s.getMarks();
			Collections.sort(mark);
			System.out.println(s);
		}

	}

}
