/**
 * The Logic class will be used to validate information for other classes and create a new flight
 */
package CCTAir;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Claudinea de Almeida
 */

public class Logic {
    
     
     
    /**method to create a new flight. It will receive as a parameter, airplane array, flight arraylist and answer of the quantity*/
    public ArrayList<Flight> CreatingFlight(AirPlane[] airplane,ArrayList<Flight> flight, int answerquantity){
            
           
            /**for loop will be executed until the total entered for the user*/
            for(int j=0;j<answerquantity;j++)
            {
                    
                    /**instance of the new flight*/
                    Flight flightnew = new Flight();
                    
                    /**instance of the Scanner*/
                    Scanner sc = new Scanner(System.in);
     
                    /**display message to the user */
                    System.out.println("--- Creating a flight ---"); 
                    System.out.println("--- Type the Origin of the flight ---"); 
                    
                    /**checking if the value is valid*/                                   
                    String answerOrigin=CheckInput();
                    
                    /**setting the origin of the flight*/
                    flightnew.setOrigin(answerOrigin);         
                    
                 
                    
                    /**displaying message to the user */
                    System.out.println("--- Type the Destiny of the flight ---"); 
                    
                    /**checking if the value is valid*/                                   
                    String answerdestiny=CheckInput();
                    
                    /**setting the destination of the flight*/
                    flightnew.setDestination(answerdestiny);

                    
                    
                    /**displaying message to the user */
                    System.out.println("--- Type the Departure time of the flight ---"); 
                    
                    /**receiving the departure time of the flight typed by the user and checking if is valid*/
                    String answerdeparture = CheckInput();

                    /**displaying message to the user */
                    System.out.println("--- Type the Arrival time of the flight ---"); 
                    
                    /**receiving the arrival time of the flight typed by the user and checking if is valid*/
                    String answerarrival = CheckInput();

                    /**setting the schedule of the flight with departure and arrival typed by the user*/
                    flightnew.schedule(answerdeparture,answerarrival);

                    /**displaying message to the user */
                    System.out.println("--- Type the date (dd/mm/aaaa) of the flight ---"); 
                    /**receiving the date of the flight typed by the user and checking if is valid*/
                    String answerdate = CheckInput();
                    /**setting the date of the flight typed by the user*/
                    flightnew.setDateofflight(answerdate);

                    /**listing Airplanes available*/
                     for(int i=0;i<airplane.length;i++){
                            if (airplane[i].getIsAvailable()){
                                System.out.println(" Identification: "+i+" "+airplane[i].toString()); 
                            }
                     }
                    /**choosing the desired flight*/
                    System.out.println("--- Type the Plane identification number to the flight ---"); 
                    /**receiving the Airplane of the flight typed by the user*/
                    int answerplane = CheckInputInt();
                         
                    /**setting the Airplane of the flight typed by the user */
                    flightnew.setAircraft(airplane[Integer.valueOf(answerplane)]); 
                    /**setting the Airplane as not available*/
                    airplane[Integer.valueOf(answerplane)].setIsAvailable(false); 
                    
                    /**calculing the numver of the flight*/
                    String numberofflight = Integer.toString(j+1);
                    /**displaying message to the user*/
                    System.out.println("--- Flight "+numberofflight+" created ---");
                    /**displaying the options of the flight to the user*/
                    System.out.println(flightnew.printFlight());
                    
                    
                    /** add the flight to ArrayList*/
                     flight.add(j, flightnew);
                  
            }
            
           /**return the arraylist*/
           return flight;
  
   }
    
    /** checking that text is valid*/
    public String CheckInput(){
        
        /**instance of the Scanner*/
        Scanner sc = new Scanner(System.in);
       
        /**declare the variable*/
        boolean answer=false;
                                        
        String answerOrigin="";
        while (!answer){
            /**receiving the origin of the flight typed by the user*/
            answerOrigin = sc.nextLine();

            if (answerOrigin.isEmpty()){
                System.out.println("--- The value is null. Please type again ---");  
            }else{
                answer=true;
            }
       }
        return answerOrigin;
    }
    
    
    /** checking that text is valid*/
    public int CheckInputInt(){
        
        /**instance of the Scanner*/
        Scanner sc = new Scanner(System.in);
       
        /**declare the variable*/
        boolean answer=false;
                                        
        int answertyped=0;
        while (!answer){
            /**receiving the origin of the flight typed by the user*/
            answertyped = sc.nextInt();

            if (answertyped<=0){
                System.out.println("--- The value is invalid. Please type again ---");  
            }else{
                answer=true;
            }
       }
        return answertyped;
    }
    
    /**method to check if the Airplane is available   */
    public boolean CheckAirplaneIsAvailable(AirPlane[] airplane, int i){
        /**if airplane received by parameter is not available, return false, else return true*/
        if (!airplane[i].getIsAvailable()){
            return false;
        }else{
            return true;
        }
        
     }
    
    /**method to check the destination of the flight*/
    public void CheckFlight(ArrayList<Flight> flight){
        
        /**instance of the Scanner*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Type the Destination ---"); 
        String answerdestination = CheckInput();

        /**for loop to check the arraylist flight, if destination is equal the answer typed by the user it will be print*/
        for(int i=0;i<flight.size();i++){
           if (flight.get(i).getDestination().equals(answerdestination))
           {
               System.out.println(flight.get(i).printFlight());
           }

       }

    }
    
    /**method to check the Airplane*/
    public void CheckAircraft(AirPlane[] airplane){
        /**instance of the Scanner*/
        Scanner sc = new Scanner(System.in);
        
        /**reading by the user*/
        System.out.println("--- Type the Aircraft Make ---"); 
        String answeraircraft = sc.nextLine();

        /**for loop to check the Airplane array, if make is equal the answer typed by the user it will be print*/
         for(int i=0;i<airplane.length;i++){
             if (airplane[i].getMake().equalsIgnoreCase(answeraircraft)){
                 System.out.println(airplane[i].toString()); 
             }
        }
    }
    
    
     /**method to check the Pilot*/
     public void CheckPilot(Pilot[] pilot){
         /**instance of the Scanner*/
        Scanner sc = new Scanner(System.in);
         /**reading by the user*/
        System.out.println("--- Type the Pilots Name ---"); 
        String answerpilot = sc.nextLine();

        /**for loop to check the Pilot array, if name is equal the answer typed by the user it will be print*/
        for(int i=0;i<pilot.length;i++){
             if (pilot[i].getName().equalsIgnoreCase(answerpilot)){
                 System.out.println(pilot[i].toString()); 
             }

        }
     }
     
     
     
}
