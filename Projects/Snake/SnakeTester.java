import java.awt.Rectangle;

public class SnakeTester
{
	//this class can be used to test our Snake class
	//I have only provided one test so far...
	public static void main(String[] args) {
		
		String result;
		try {
			if((result =runTestOne()).length() != 0) {
				System.out.println("Failed test one: " + result);
				return;
			}
		}
		catch(Exception e) {
			System.out.println("Error in creating a Snake and asking it for its currentHead()!");
			e.printStackTrace();
			return;
		}
		
		try {
			if((result = runTestTwo()).length() != 0) {
				System.out.println("Failed test two: " + result);
				return;
			}
		}
		catch(Exception e) {
			System.out.println("Error in creating a Snake and asking it to turn different directions!");
			e.printStackTrace();
			return;
		}
		
		try {
			if((result = runTestThree()).length() != 0) {
				System.out.println("Failed test three: " + result);
				return;
			}
		}
		catch(Exception e) {
			System.out.println("Error in creating a Snake and asking it where its next head will be!");
			e.printStackTrace();
			return;
		}
		
		try {
			if((result = runTestFour()).length() != 0) {
				System.out.println("Failed test four: " + result);
				return;
			}
		}
		catch(Exception e) {
			System.out.println("Error in creating a Snake and asking it to do several move operations!");
			e.printStackTrace();
			return;
		}
		
		try {
			if((result = runTestFive()).length() != 0) {
				System.out.println("Failed test five case " + result);
				return;
			}
		}
		catch(Exception e) {
			System.out.println("Error in creating a Snake, asking it to do several move operations, and then checking for intersections!");
			e.printStackTrace();
			return;
		}
		
		System.out.println("Tests completed");
	}
	
	//returns true if the snake is created correctly
	public static String runTestOne() {
		
		Snake s = new Snake(50, 100, 0, 25);
		Rectangle r = s.currentHead();
		Rectangle goal = new Rectangle(50, 100, 25, 25);
		
		if(r == null)
				return "currentHead() is returning null... that shouldn't happen...";
		if(!goal.equals(r))
			return "Snake created with new Snake(50, 100, 0, 25) should have a head rectangle with the following data: " + goal + ", but currentHead() returns a rectangle with this data: " + r;
		
		return "";
	}
	
	//returns true if the snake changes directions correctly
	public static String runTestTwo() {
		
		Snake s = new Snake(50, 50, 0, 25);
		
		int[][] changesAndResults = new int[][] {
				
				{0, 0},	//this means if you try to change to direction 0, you will end up in 0
				{180, 0},
				{90, 90},
				{90, 90},
				{270, 90},
				{180, 180},
				{180, 180},
				{0, 180},
				{270, 270},
				{270, 270},
				{90, 270},
				{0, 0},
				{270, 270},
				{180, 180},
				{90, 90},
				{0, 0}
		};
		
		int index = 0;
		for(int[] test: changesAndResults) {
			int currentDirection = s.getDirection();
			s.changeDirection(test[0]);
			if(s.getDirection() != test[1])
			{
				return "Snake had direction of" + currentDirection + "˚ and was told to turn to direction " + test[0] + "˚.  The snake ended up facing " + s.getDirection() + "˚ but should have been facing " + test[1] + "˚";
			}
			index++;
		}
		
		return "";
	}
	
	//returns true if the snake calculates the next head location correctly
	public static String runTestThree() {
		
		Snake s;
		Rectangle goal;
		
		s = new Snake(60, 60, 0, 30); //0 is EAST
		goal = new Rectangle(90, 60, 30, 30);
		if(!s.nextHead().equals(goal))
			return "Snake was created with new Snake(60, 60, 0, 30) - meaning the head is at (60,60) with a direction of 0˚ (East) and a block size of 30.  The result of nextHead() should be " + goal + ", but the actual result is " + s.nextHead();

		s = new Snake(60, 60, 90, 30);
		goal = new Rectangle(60, 30, 30, 30);
		if(!s.nextHead().equals(goal))
			return "Snake was created with new Snake(60, 60, 90, 30) - meaning the head is at (60,60) with a direction of 90˚ (North) and a block size of 30.  The result of nextHead() should be " + goal + ", but the actual result is " + s.nextHead();
		
		s = new Snake(60, 60, 180, 30);
		goal = new Rectangle(30, 60, 30, 30);
		if(!s.nextHead().equals(goal))
			return "Snake was created with new Snake(60, 60, 180, 30) - meaning the head is at (60,60) with a direction of 180˚ (West) and a block size of 30.  The result of nextHead() should be " + goal + ", but the actual result is " + s.nextHead();
		
		s = new Snake(60, 60, 270, 30);
		goal = new Rectangle(60, 90, 30, 30);
		if(!s.nextHead().equals(goal))
			return "Snake was created with new Snake(60, 60, 270, 30) - meaning the head is at (60,60) with a direction of 270˚ (South) and a block size of 30.  The result of nextHead() should be " + goal + ", but the actual result is " + s.nextHead();
		
		return "";
	}
	
	
	//returns true if the snake updates the head correctly when moving east
	public static String runTestFour() {
		
		Snake s = new Snake(50, 50, 0, 25); //0 is EAST
		s.move(false);
		Rectangle goal;
		
		goal = new Rectangle(75, 50, 25, 25);
		if(!s.currentHead().equals(goal))
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) the currentHead should be " + goal + ", but the actual result is " + s.currentHead();
		else if(s.getDirection() != 0)
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) the direction shoulds till be 0, but the actual direction becomes " + s.getDirection();
		
		s.move(true);
		goal = new Rectangle(100, 50, 25, 25);
		if(!s.currentHead().equals(goal))
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) and then move(true) the currentHead should be " + goal + ", but the actual result is " + s.currentHead();
		if(s.getBody().size() != 2)
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) and then move(true) the size of the body list should be 2, but your list size is " + s.getBody().size();
		goal = new Rectangle(75, 50, 25, 25);
		if(!s.getBody().get(1).equals(goal))
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) and then move(true) the second part of the body should be " + goal + ", but the actual result is " + s.getBody().get(1);
		
		s.move(true);
		if(s.getBody().size() != 3)
			return "Snake was told to move(false), then move(true), then move(true) - after those three commands the number of body parts should be 3, but your body list has " + s.getBody().size() + "body parts";
		goal = new Rectangle(75, 50, 25, 25);
		if(!s.getBody().get(2).equals(goal))
			return "Snake was created with new Snake(50, 50, 0, 25) - meaning the head is at (50,50) with a direction of 0˚ (East) and a block size of 25.  After calling move(false) and then move(true) and then move(true) again, the third body part should be " + goal + ", but the actual result is " + s.getBody().get(2);
		
		return "";
	}
	
	//returns true if the snake checks if it intersects with itself correctly
	public static String runTestFive() {
		
		Snake s = new Snake(50, 50, 0, 25); //0 is EAST
		s.move(true);
		s.move(true);
		s.move(true);
		s.move(true);
		
		if(s.intersectsSelf())
			return "Snake was told to move(true) 4 times... and for some reason intersectsSelf() is return true when it should return false!";
		
		s.changeDirection(90);
		s.move(true);
		
		if(s.intersectsSelf())
			return "After move(true), left hand turn, move(true), intersectsSelf() is returning true when it should return false!";
		
		s.changeDirection(180);
		s.move(true);
		
		if(s.intersectsSelf())
			return "After move(true), left hand turn, move(true), left hand turn, move(true), intersectsSelf() is returning true when it should return false!";
		
		s.changeDirection(270);
		s.move(true);
				
		if(!s.intersectsSelf())
			return "After being told to move(true) in the East direction 4 times, turn North and move(true), turn West and move(true), and turn South and move(true), the intersectsSelf() method should be returning true, but instead it is returning false!";
		
		return "";
	}

}