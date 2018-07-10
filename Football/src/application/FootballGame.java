package application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// either data member static members are type to class
		//
		Player goalkeeper = new Player();
		
		Player striker = new Player("Omkar", 45, "unmarried");
		striker.setGender("male");
		System.out.println("Striker:" + striker.getName() + striker.getAge() + striker.getGender());
		
		
		goalkeeper.setAge(50);
		goalkeeper.setGender("male");
		System.out.println("goalkeeper-->" + goalkeeper.getAge() + goalkeeper.getGender());
		
		
	}

}
