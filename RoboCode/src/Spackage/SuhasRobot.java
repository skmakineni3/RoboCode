package Spackage;
import robocode. *;
import java.awt.Color;
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
/**
* SuhasRobot - a robot by (Suhas Makineni)
*/
public class SuhasRobot {
	/**
	* run: SuhasRobot's default behavior
	*/
	public void run() {
		// Initialization of the robot should be put here
		setColors(Color.pink,Color.orange,Color.green); // body,gun,radar
		// Robot main loop
	while(true) {
	int count = 18;
	int t = 10;
	for (int i = 0; i < count; i += 10) { // spins in a circle and shoots
		turnGunRight(t);	
		fire(1);
	}
	turnRight(100); //turns right
	ahead(100); //movees forward
	turnGunRight(10);
	fire(1);
	//moves back
	back(100);
	turnGunRight(180);
	}
}
	
	public void onScannedRobot(ScannedRobotEvent e) {
	// Replace the next line with any behavior you would like
	if (isTeammate(e.getName()) == false) {//checks if the robot is my teammate

	fire(100);
	}
	}
	/**
	* onHitByBullet: What to do when you're hit by a bullet
	*/
	public void onHitByBullet(HitByBulletEvent e) {
	// Replace the next line with any behavior you would like 
		fire(100);
	}
	/**
	* onHitWall: What to do when you hit a wall
	*/
	public void onHitWall(HitWallEvent e) {
	// if hit a wall moves ahead and back to get off wall and turns right
	ahead(100);
	turnRight(60);
	back(50);
	turnRight(60);
	}
	}

