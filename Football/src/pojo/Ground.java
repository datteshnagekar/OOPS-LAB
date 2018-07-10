package pojo;

public class Ground {
	private Integer sides;
	private String condition;
	private Integer playersPlaying;
	private Integer volunteersPresent;
	
	public void game() {
		
		
	}
	
public Ground() {
		
		sides = 2;
		condition = "";
		playersPlaying = 23;
		volunteersPresent = 10;
	}
	
	
	
	
	
	
	public Ground(Integer sides, String condition, Integer playersPlaying, Integer volunteersPresent) {
		
		this.sides = sides;
		this.condition = condition;
		this.playersPlaying = playersPlaying;
		this.volunteersPresent = volunteersPresent;
	}








	public Integer getSides() {
		return sides;
	}
	public void setSides(Integer sides) {
		this.sides = sides;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Integer getPlayersPlaying() {
		return playersPlaying;
	}
	public void setPlayersPlaying(Integer playersPlaying) {
		this.playersPlaying = playersPlaying;
	}
	public Integer getVolunteersPresent() {
		return volunteersPresent;
	}
	public void setVolunteersPresent(Integer volunteersPresent) {
		this.volunteersPresent = volunteersPresent;
	}
}
