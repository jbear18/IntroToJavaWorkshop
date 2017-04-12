package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot robo=new Robot("mini");
	robo.move(125);
	robo.penDown();
	robo.move(123);
	robo.setPenColor(Color.green);
	robo.penDown();
	robo.setSpeed(10);
	robo.turn(180);
	robo.move(141);
}
}