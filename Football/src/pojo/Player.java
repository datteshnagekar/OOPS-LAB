package pojo;

public class Player {
	private Integer age;
	private String name;
	private String gender;
	private Integer jercyno;
	private String status;
	
	
	
	//
	public void kick() {
		System.out.println("kick");
	}
	
	//constructor function
	//constructor instantaion or creating a object
	//only a class can create its own object no one else \can create a object on behalf of class
	public Player()
	{
		age = 0;
		name = "";
		System.out.println("creating object");
	}
	
	
	//this means self refrencing
	public Player(String name, Integer age, String status)
	{
		this.name = name;
		this.age = age;
		this.status = status;
	}
	
	//getters and setters
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getJercyno() {
		return jercyno;
	}



	public void setJercyno(Integer jercyno) {
		this.jercyno = jercyno;
	}



}
