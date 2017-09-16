import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		Color blue = new Color(0, 0, 255);
		Robot Robot = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String Color = JOptionPane.showInputDialog("Do you want red, green, or blue?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (Color.equalsIgnoreCase("Red")) {
			Robot.setPenColor(red);
		} else if (Color.equalsIgnoreCase("Green")) {
			Robot.setPenColor(green);
		} else if (Color.equalsIgnoreCase("Blue")) {
			Robot.setPenColor(blue);
		}
		// 2. set the pen width to 10
		Robot.setPenWidth(10);
		// 1. make the Robot draw a shape
		Robot.setSpeed(100);
		Robot.penDown();
		for (int i = 0; i < 4; i++) {

			Robot.move(100);
			Robot.turn(90);
		}
	}

}
