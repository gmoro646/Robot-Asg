package Robot;

public class Robot {
	private int position_x;
	private int position_y;
	private String adirection;

	public Robot() {
		position_x=9;// sets the values for are an attainable position x
		position_y=9;// sets the values for are an attainable position y
		adirection="Unset";	// checks if the item has been set
	}

	public void setPositions(int x,int y) {
		if (x<5|| y<5) {
			position_x=x;
			position_y=y;

		}
		else {
			System.out.println("The X or Y coordinates provided are not within the table- Try a range 0-4");
		}
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}

	public String getDirection() {
		return adirection;
	}

	public void setDirection(String Direction) {


		if(Direction.equals("WEST") || Direction.equals("EAST") || Direction.equals("SOUTH") || Direction.equals("NORTH")) {
			adirection = Direction;	
		}
		else {
			System.out.println("Direction is not valid");

		}
	}
	public void RobotPlace(String placeRobot) {
		//System.out.println(placeRobot);
		String[] data=placeRobot.split(",");
		try {
			if(data.length==3) {		
				int x= Integer.parseInt(data[0]);
				int y= Integer.parseInt(data[1]);	
				String aDirection=data[2].toUpperCase().trim();
				if (checkValues(x, y, aDirection)) {

					setPositions(x, y);
					setDirection(aDirection);
				}
				else {
					System.out.println("Wrong format after place");
				}
			}
		}catch(Exception e) {
			// DO NOTHING
			System.out.println(e.getMessage());
		}
	}
	private boolean checkValues(int x, int y,String Direction) {
		boolean val=false;
		if ((x<5 && y<5) && (Direction.equals("WEST") || Direction.equals("EAST") || Direction.equals("SOUTH") || Direction.equals("NORTH")))
		{
			val=true;
		}
		return val;

	}
	public String toString() {
		String val= "Pos x:"+ position_x + "\nPos y:" + position_y + "\nDirection:"+adirection;
		return val;
	}


}
