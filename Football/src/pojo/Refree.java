package pojo;

public class Refree {
	private String name;
	private Integer age;
	private String designation;
	private String gender;
	
	public void judgement() {
		
	}
	
	public Refree() {
		
		name = "";
		age = 30;
		designation = "";
		gender = "";
	}
	
	
	
	public Refree(String name, Integer age, String designation, String gender) {
		
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
