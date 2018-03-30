
import userCommunication.*;

import java.io.*;
import java.util.*;

import Robot.*;
public class Game {

	private Table aTable;
	private MenuOption option;
	private Robot aRobot;
	private boolean isPlace;

	public Game() {
		aTable= new Table();
		aRobot=new Robot();
		isPlace=false;
	}

	public void loadGameWithUserInput() throws Exception
	{
		try
		{

			processCommand();

		}
		catch(Exception i)
		{
			i.printStackTrace();
		}

	}


	private void processCommand() {

		try {
			String[] command= new String[3];

			while(command[0]!="QUIT") {

				command=getUserCommand();

				switch(command[0].toUpperCase()) {
				case "PLACE":
					if(command.length==2) {
						aRobot.RobotPlace(command[1]);
					}
					else {
						System.out.println("Place ignored, wrong amount of arguments->"+"PLACE X,Y,F");
					}
					break;
				case "MOVE":
					if(command.length==1) {
						aRobot.move();
					}
					break;
				case "LEFT":
					if(command.length==1) {
						aRobot.turnRobot("LEFT");
						System.out.println("OPTION LEFT");
					}
					break;
				case "RIGHT":  
					if(command.length==1) {
						aRobot.turnRobot("RIGHT");

						System.out.println("OPTION RIGHT");
					}
					break;
				case "REPORT":  
					if(command.length==1) {
						System.out.println("OPTION REPORT");
						System.out.println(aRobot.toString());
					}
					break;
				case "QUIT":  
					if(command.length==1) {
						System.out.println("OPTION QUIT");
						quitGame();
					}
					break;
				default: 			
					System.out.println("Invalid option -> "+ command[0].toUpperCase());
					break;
				}

			}
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	private String[] getUserCommand() {
		UserInteraction comm= new UserInteraction();
		printMenu();
		String[] choice=comm.getInput_String("\nEnter Choice: ").split("\\s+");

		return choice;
	}

	private void printMenu() {
		UserInteraction comm= new UserInteraction();
		comm.println("PLACE");
		comm.println("MOVE");
		comm.println("LEFT");
		comm.println("RIGHT");
		comm.println("REPORT");
		comm.println("QUIT");	
	}
	private void quitGame() {
		System.out.println(aRobot.toString());
		System.exit(0);

	}

}