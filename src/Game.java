
import userCommunication.*;

import java.io.*;
import java.util.*;

import Robot.*;
public class Game {
	
	Table aTable;
	MenuOption option;
	Robot aRobot;

	public Game() {
		aTable= new Table();
	}
	/*
	public void loadFile(String fileName) throws IOException
    {
  
        try
        {
            //Scanner fileInput= new Scanner(new File(fileName));
           // String UserLine= fileInput.nextLine();
           // Scanner myUser= new Scanner(UserLine);
            Scanner userInput= new Scanner(System.in);
            String input=userInput.nextLine();
            //player=factory.buildFromStream(myUser, world);
            while (input!="QUIT") 
            {
            	
                Entity tempEntity=null;
                String aLine= "";
                Scanner info;
                aLine=fileInput.nextLine();
                info= new Scanner(aLine);
                tempEntity=(factory.buildFromStream(info, world));
                // adds the objects of moving entity into the array list  
                if (tempEntity instanceof  MovingEntity){enemies.add((MovingEntity)tempEntity);}
            }
        }
        catch( IOException i)
        {
            i.printStackTrace();
        }

    }
	
	*/
	public void loadGameWithUserInput(String fileName) throws Exception
    {
        try
        {
        	String input=getUserCommand();
            
            while (input!="QUIT") 
            {
            process
            	
            }
            
          
        }
        catch(Exception i)
        {
            i.printStackTrace();
        }

    }
	private String getUserCommand() {
		UserInteraction comm= new UserInteraction();
		return comm.getInput_String("Enter Command:");
	}
	private void processCommand(String command) {
		
		
		switch(command) {
         case 1:  monthString = "January";
                  break;
         case 2:  monthString = "February";
                  break;
         case 3:  monthString = "March";
                  break;
         case 4:  monthString = "April";
                  break;
         case 5:  monthString = "May";
                  break;
         case 6:  monthString = "June";
                  break;
         case 7:  monthString = "July";
                  break;
         case 8:  monthString = "August";
                  break;
         case 9:  monthString = "September";
                  break;
         case 10: monthString = "October";
                  break;
         case 11: monthString = "November";
                  break;
         case 12: monthString = "December";
                  break;
         default: monthString = "Invalid option";
                  break;
     }
     System.out.println(monthString);
 }
		option 
		
		
		
		}
		
		
	}
}
