import edu.duke.FileResource;

/**
 * This is the class that controls Kiva's actions. Implement the <code>run()</code>
 * method to deliver the pod and avoid the obstacles.
 *
 * This is starter code that may or may not work. You will need to update the code to
 * complete the project.
 */
import KivaCommand;

public class RemoteControl extends RemoteControl{
    
     
    KeyboardResource keyboardResource;


    
    public RemoteControl() {
   
        
       keyboardResource = new KeyboardResource();   
       
        }
        
   public class KivaCommandTester {
    
public void testForward() {
   
        KivaCommand command = KivaCommand.FORWARD();
        System.out.println(command);
        System.out.println(command.getDirectionKey());
   }
public void testTurnLeft() {
        KivaCommand command = KivaCommand.TURN_LEFT();
        System.out.println(command);
        System.out.println(command.getDirectionKey());
   }
public void testTurnRight() {
        KivaCommand command = KivaCommand.TURN_RIGHT();
        System.out.println(command);
        System.out.println(command.getDirectionKey());
   }
public void testTake() {
        KivaCommand command = KivaCommand.TAKE();
        System.out.println(command);
        System.out.println(command.getDirectionKey());
   }
public void testDrop(){
     KivaCommand command = KivaCommand.DROP();
      System.out.println(command);
        System.out.println(command.getDirectionKey());
    }
    
  
}
    
 

    /**
     * The controller that directs Kiva's activity. Prompts the user for the floor map
     * to load, displays the map, and asks the user for the commands for Kiva to execute.
     *
     * [Here's the method you'll execute from within BlueJ. It may or may not run successfully
     * as-is, but you'll definitely need to add more to complete the project.]
     */
    public void run() {
        
        System.out.println("Please select a map file.");
        
        FileResource fileResource = new FileResource();
 
        String inputMap = fileResource.asString();
        FloorMap floorMap = new FloorMap(inputMap);
        System.out.println(floorMap);

        System.out.println("Please enter the directions for the Kiva Robot to take.");
        String directions = keyboardResource.getLine();
        System.out.println("Directions that you typed in: " + directions);
        
        
        
       
        
    }
       
}



