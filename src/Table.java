import Robot.*;

public class Table {

	private Robot aRobot;
	private int dimensions[][];
	public Table (Robot aRobot) {
		dimensions=new int [4][4];
		this.aRobot=aRobot;
	}
	public Table() {
		aRobot= new Robot();
		dimensions= new int [4][4];	
	}
	public void command(String command) {
		
		
	}
	
	
}
