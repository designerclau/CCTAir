/**
 * This is the main class for the CCTAir system. In this class there will be the Pilot, AirPlane and Flight classes.
*  It Will also install Logic and SetUp classes
*  The CCTAir program will register new flights with options chosen by the user.
 */
package CCTAir;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudinea de Almeida
 */

public class CCTAir {

    
    public static void main(String[] args) {
      
        System.out.println("--- Welcome to CCTAir ---");
        
        /**instance of pilot class using array*/
        Pilot[] pilot = new Pilot[20];
        
        /**instance of Airplane class using array*/
        AirPlane[] airplane = new AirPlane[20];
        
        /**instance of Flight class using arraylist*/
        ArrayList<Flight> flight = new ArrayList<Flight>();
        
        /**instance of logic class*/
        Logic logic = new Logic();
        
        /**instance of setup class where it setup initial information into the pogram*/
        SetUp setup = new SetUp();
        System.out.println("--- Setting up Pilots ---"); 
        
        /**setting up the Pilot initial information*/
        pilot=setup.buildPilot(pilot);
        System.out.println("--- Setting up Planes ---"); 
        
        /**setting up the AirPlane initial information, sending pilot array as a parameter*/
        airplane=setup.buildAirPlane(pilot, airplane);
        System.out.println("--- Setting up Flights ---"); 
        
         /**setting up the Flight initial information, sending airplane array as a parameter*/
        flight=setup.buildFlight(airplane,flight);
        
        /**instance of the menu class*/
        Menu menu = new Menu();
        
        /**starting the menu*/
        menu.started(pilot, airplane, flight);
        
       
       
         
       
        
        
      
        
        
        
       
        
         
        
    }
    
}
