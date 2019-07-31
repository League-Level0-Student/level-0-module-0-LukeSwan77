package _05_greeter;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint1 {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is my favorite color too!");
	Robot jeff = new Robot();
	jeff.penDown();
	jeff.setSpeed(100);
	for(int i = 0; i < 3; i++) {
		jeff.move(100);
		jeff.turn(120);
	}
}
}
