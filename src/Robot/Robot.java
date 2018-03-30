package Robot;

public class Robot {
	private int position_x;
	private int position_y;
	private String adirection;
	private boolean isPlaced;

	public Robot() {
		position_x=9;// sets the values for are an attainable position x
		position_y=9;// sets the values for are an attainable position y
		adirection="Unset";	// checks if the item has been set
		isPlaced=false;
	}

	public void setPositions(int x,int y) {
		if ((x<5 && y<5) &&(x>=0 && y>=0) ){
			position_x=x;
			position_y=y;
			this.isPlaced=true;
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
		String val="****Robot was never placed***";
		if(isPlaced==true) {
			val= "Pos x:"+ position_x + "\nPos y:" + position_y + "\nDirection:"+adirection;}
		return val;
	}
	public void turnRobot(String Direction) {
		if(isPlaced==true) {
			if(Direction.equals("RIGHT")) {
				turnRight();
			}
			else if (Direction.equals("LEFT")) {
				turnLeft();
			}
		}
		else {
			System.out.println("****Robot was never placed***");
		}
	}
	private void turnRight() {

		if(this.adirection.equals("WEST")) {
			setDirection("NORTH");
		}
		else if(this.adirection.equals("NORTH")) {
			setDirection("EAST");
		}
		else if(this.adirection.equals("EAST")) {
			setDirection("SOUTH");
		}
		else if(this.adirection.equals("SOUTH")) {
			setDirection("WEST");
		}
	}
	private void turnLeft() {

		if(this.adirection.equals("WEST")) {
			setDirection("SOUTH");
		}
		else if(this.adirection.equals("NORTH")) {
			setDirection("WEST");
		}
		else if(this.adirection.equals("EAST")) {
			setDirection("NORTH");
		}
		else if(this.adirection.equals("SOUTH")) {
			setDirection("EAST");
		}
	}
	public void move() {

		if(isPlaced==true) {
			//(this.position_x<=4 && this.position_x>=0)  && (this.position_y<=4 && this.position_y>=0)) {

			if(this.adirection.equals("WEST") && this.position_x !=0 ) {
				//this.position_x=this.position_x-1;
				setPosition_x(this.position_x-1);
			}
			else if(this.adirection.equals("EAST")&& this.position_x !=4 ) {
				//this.position_x=this.position_x+1;
				setPosition_x(this.position_x+1);
			}
			else if(this.adirection.equals("NORTH")&& this.position_y !=4 ) {
				//this.position_y=this.position_y+1;
				setPosition_y(this.position_y+1);
			}

			else if(this.adirection.equals("SOUTH")&& this.position_y !=0 ) {
				//this.position_y=this.position_y-1;
				setPosition_y(this.position_y-1);
			}
			else {
				System.out.println("Unable to move, hitting the wall");
			}

		}else {
			System.out.println("****Robot was never placed***");
		}

	}

}


