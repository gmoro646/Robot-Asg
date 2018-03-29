
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
					//System.out.println(aRobot.toString());
					//command = "PLACE";
					break;
				case "MOVE":  
					System.out.println("OPTION MOVE");

					break;
				case "LEFT":  
					System.out.println("OPTION LEFT");
					break;
				case "RIGHT":  
					System.out.println("OPTION RIGHT");
					break;
				case "REPORT":  
					System.out.println("OPTION REPORT");
					System.out.println(aRobot.toString());
					break;
				case "QUIT":  
					System.out.println("OPTION QUIT");
					quitGame();
					break;
				default: 			
					System.out.println("Invalid option -> "+ command[0].toUpperCase());
					//command=getUserCommand().toUpperCase().trim();
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

		System.exit(0);

	}
	private boolean checkPlaceString(String value) {
		boolean val=true;
		if (value==null) {
			val=false;
		}
		return val;	
	}
}