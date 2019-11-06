/**
 * This class will show to the user the option in this program
 */
package CCTAir;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Claudinea de Almeida
 * 
 */

public class Menu {
    
    /**default constructor */
    public Menu(){}
    
    /**method to show the options to the user*/
    public static void started(Pilot[] pilot, AirPlane[] airplane, ArrayList<Flight> flight) { // menu 
        /**creating e initialization of the variable option*/
        String continuing="n";
	int option = 0;
	do {
		System.out.println("\n\n                          ###   CCTAir    ###                 ");
		System.out.println("\n                  ==============================================");
		System.out.println("                  |     1 - Display all flights on the system    |");
		System.out.println("                  |     2 - View a particular Flight             |");
		System.out.println("                  |     3 - View all available aircraft          |");
                System.out.println("                  |     4 - View a particular aircraft           |");
                System.out.println("                  |     5 - View all Pilots                      |");
                System.out.println("                  |     6 - View a particular Pilot              |");
                System.out.println("                  |     7 - Create a flight(s)                   |");
		System.out.println("                  |     0 - Quit                                 |");
		System.out.println("                  ==============================================\n");

                
                /**reading by the user the option desired after instance the method Scanner*/
                Scanner sc1 = new Scanner(System.in);
                option = sc1.nextInt();
                
                /**instance of a second scanner*/
	        Scanner sc = new Scanner(System.in);
                
                /**instance of the logic class*/
                Logic logic = new Logic();
                
		System.out.print("\n");
                /**if one of these options is chosen*/
		switch (option) {
		case 1:{
                       /**option 1 will display all the flights*/
                        System.out.println("Display all flights on the system \n");
                        //display all flights
                        System.out.println("--- All Flights ---"); 
                        for(Flight c : flight) {
                            System.out.println(c);
                        } 
                        continuing="n";
			break;
                }
                         
		case 2:{
                         /**option 2 will display a particular flight*/
			System.out.println("View a particular Flight\n");
                        //view a particular flight
                       /**calling the checkflight method     */    
                       logic.CheckFlight(flight);
                        continuing="n";                      

			break;
                }
		case 3:{
                        /**option 3 will display all available Aircraft*/
			System.out.println("View all available aircraft\n");
                         //display all aircraft
                        System.out.println("--- All Aircraft ---"); 
                        /**for loop to display all available Airplane*/
                        for(int i=0;i<airplane.length;i++){
                            if (logic.CheckAirplaneIsAvailable(airplane, i)){
                                System.out.println(airplane[i].toString());
                            }
			}
                        continuing="n";
                        break;
                }
                case 4:{
                       /**option 4 will display a particular Aircraft*/
                        System.out.println("View a particular aircraft\n");
                       /**view a particular aircraft using the method CheckAircraft*/
                        logic.CheckAircraft(airplane);
                        continuing="n";
                        break;
                }
                case 5:{
                       /**option 5 will display all Pilos*/
                        System.out.println("View all Pilots\n");
                         
                         //display all pilots
                        System.out.println("--- All Pilots ---"); 
                        for(int i=0;i<pilot.length;i++){
                           System.out.println(pilot[i].toString()); 
                        }
                        continuing="n";
                        break;
                }
                case 6:{
                        /**option 6 will display a particular Pilot*/
                        System.out.println("View a particular Pilot\n");
                        /**view a particular Pilots using the method CheckPilot*/
                        logic.CheckPilot(pilot); 
                        continuing="n";
                        break;
                }
                case 7:{
                    /**option 7 will create a new Flight*/
                     System.out.println("Create a flight(s)\n");
                     //creating a flight
                     System.out.println("--- How many Flights do you want to create ---"); 
                     int answerquantities = logic.CheckInputInt();
                     /**Using a method CreatingFlight*/
                     logic.CreatingFlight(airplane,flight,answerquantities);
                     continuing="n";

                    break;
                }
                case 0:{
                        System.out.println("Are you sure you wish to close this program? (Yes/No)");
                        String option2 = sc.next();
                        if(option2.equalsIgnoreCase("Yes")){
                            continuing="y";
                            break;
                        }else{
                            continuing="n";
                            break;
                        }
                }
		default:{
			System.out.println("Invalid option!");
			break;
		}
             }
	} while (!continuing.equalsIgnoreCase("y"));
    }
}
