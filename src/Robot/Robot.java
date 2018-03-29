package Robot;

public class Robot {
 private int position_x;
 private int position_y;
 private Direction facing_dir;
 
public Robot(int x,int y, Direction facingDirection) {
	position_x=x;
	position_y=y;
	facing_dir=facingDirection;
	
}
public Robot() {
	position_x=0;
	position_y=0;
	facing_dir=new Direction();
	
}

public int getPosition_x() {
	return position_x;
}
public void setPosition_x(int position_x) {
	this.position_x = position_x;
}
public int getPositin_y() {
	return position_y;
}
public void setPositin_y(int positin_y) {
	this.position_y = positin_y;
}

 
}
