package pojo;

public class Player {
	private Integer age;
	private String name;
	private String gender;
	private Integer jercyno;
	
	public void kick() {
		System.out.println("kick");
	}
	
	
	
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
