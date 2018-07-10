package pojo;

public class Substitutes {

		private String name;
		private Integer age;
		private String condition;
		private String playPosition;
		
		public void replace() {
			
		}
		
		public Substitutes() {
			
			name = "";
			age = 30;
			condition = "";
			playPosition = "";
		}

		
		
		
		
		
		public Substitutes(String name, Integer age, String condition, String playPosition) {
			super();
			this.name = name;
			this.age = age;
			this.condition = condition;
			this.playPosition = playPosition;
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
		public String getCondition() {
			return condition;
		}
		public void setCondition(String condition) {
			this.condition = condition;
		}
		public String getPlayPosition() {
			return playPosition;
		}
		public void setPlayPosition(String playPosition) {
			this.playPosition = playPosition;
		}
}
