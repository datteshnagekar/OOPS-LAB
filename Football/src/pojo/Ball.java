package pojo;

public class Ball {
	
	private Integer size;
	private String pattern;
	
	public void shot() {
		System.out.println("ok");
		
	}
	
	//constructor function
	//non paramaterised function
public Ball() {
		
		size = 12;
		pattern = "";
		System.out.println("creating object");
	}
	
	
	//paramaterized function
public Ball(Integer size, String pattern) {
		
		this.size = size;
		this.pattern = pattern;
	}
	
	
	public Integer getSize() {
		return size;
	}
	

	public void setSize(Integer size) {
		this.size = size;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
