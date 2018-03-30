import Robot.*;
// class to create a visual interface
public class Table {


	private char dimensions[][];

	public Table (Robot aRobot) {
		dimensions=new char [4][4];
		aRobot=new Robot();
	}
	public Table() {
		dimensions= new char [4][4];	

	}
	public char[][] getDimensions() {
		return dimensions;
	}
	public void setDimensions(char[][] dimensions) {
		this.dimensions = dimensions;
	}
	public void setPosition(int x, int y) {		
		dimensions[x][y]='R';
	}
	public char[][] getPositionRobotOnTable() {

		for ( int i = 0; i < 5; i++ ) {
			for ( int j = 0; j < 5; j++ ) {
				if ( dimensions[i][j] == 'R' ) {
					// Found the correct i,j - print them or return them or whatever
				} 
			}
		}
		return dimensions;
	}
	







}
