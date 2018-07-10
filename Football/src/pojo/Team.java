package pojo;

public class Team {

	private String name;
	private Integer total;
	private String gender;
	
	public void play() {
		
	}
	
	public Team() {
		
		name = "";
		total = 23;
		gender = "";
	}
	
	
	
	public Team(String name, Integer total, String gender) {
		super();
		this.name = name;
		this.total = total;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
