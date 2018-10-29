package POJO;

import java.io.Serializable;

public class Student implements Serializable{

	private int rollno;
	private String name;
	private String class_name;
	
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
	
	//constructor
	public Student(int rollno, String name, String class_name) {
		super();
		this.rollno = rollno;
		this.name = name; 
		
		
		this.class_name = class_name;
	}
	
	

	
	
	

	
	
	
	
	
}
