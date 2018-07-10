package pojo;

public class Ground {
	private Integer sides;
	private String condition;
	private Integer playersPlaying;
	private Integer volunteersPresent;
	
	public void game() {
		
		
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
