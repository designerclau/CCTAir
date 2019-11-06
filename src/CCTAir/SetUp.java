/**
 * The SetUp class was created to enter initial values ​​for Pilots, Airplane and Flights.
 */
package CCTAir;

/**
 *
 * @author Claudinea de Almeida
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class SetUp {
 
     /**Arrays with pre information to be used bellow */
    String[] name = {"Billy","Bob","Dave","Jane","Mary","Joe","Chris"};
    String[] surname = {"McQueen","Andrews","Caine","Gahan","Scully","Victory","Bale"};
    String[] model ={"747","A340","KR-860","R101","CRJ-100","195"};
    String[] types1 ={"Turbo propor","Piston"};
    String[] types2 ={"Light Jet","Regional Jet"};
    String[] types3 = {"Narrow Body","Wide Body"};
    String[] makes ={"Boeing","Airbus","Embraer","Bombardier"};
    String[] capacities ={"4","10","100","200","350","500"};
    String[] rating ={"1","2","3","4","5","6","7","8","9","10"};
    String[] original={"Dublin","Paris","Madrid","Lisbon"};
    String[] destin={"London","Tokio","Roma","Washington"};
    String[] depart={"10:10","12:30","18:50","20:00","23:50"};
    String[] arrive={"11:10","13:30","6:50","8:00","11:50"};
    String[] dateof ={"05/11/2019","10/12/2019","20/12/2019","03/01/2020","05/01/2020","15/01/2020","08/02/2020"};
     
     /**random method to generate random values */
    Random generate = new Random();
    
     /**instance of logic class */
    Logic logic = new Logic();
    
    
     /**method create to build Pilots and insert into the array */
    public Pilot[] buildPilot(Pilot[] pilot)  
    {
        
         /**for loop to insert information into the pilot array */
        for(int i=0;i<pilot.length;i++ ) 
       {
            /**instance of new pilot */
            pilot[i] = new Pilot();
            
             /**generate a name of the pilot using the arrays up */
            pilot[i].setName(name[generate.nextInt(name.length)]+" "+
                          surname[generate.nextInt(surname.length)]);
             /**generate a rating of the pilot using the arrays up */
            pilot[i].setRating(Integer.valueOf(rating[generate.nextInt(rating.length)]));
            
             /** checking rating of the pilot using arrays up to generate values */
            if (pilot[i].getRating()> 7){
                 pilot[i].setKindofplain(types3[generate.nextInt(types3.length)]);
            }else if(pilot[i].getRating()>=5 && pilot[i].getRating()<= 7){
                 pilot[i].setKindofplain(types2[generate.nextInt(types2.length)]);
            }else{
                 pilot[i].setKindofplain(types1[generate.nextInt(types1.length)]);
            }

             /**printing in the screem the string of pilot created */
            System.out.println(pilot[i].toString());
              
       } 
        /** return the pilot array */
        return pilot;
    }
    
    /**method create to build AirPlane and insert into the array */
    public AirPlane[] buildAirPlane(Pilot[] pilot, AirPlane[] airplane)  
    {
       
         /**for loop to insert information into the Airplane array */
        for(int i=0;i<airplane.length;i++ ) 
       {
            /** instance of new AirPlane   */ 
            airplane[i] = new AirPlane();
            
            /**generate a male of the AirPlane using the arrays up */
            airplane[i].setMake(makes[generate.nextInt(makes.length)]);
            /**generate a Model of the AirPlane using the arrays up */
            airplane[i].setModel(model[generate.nextInt(model.length)]);
            /**generate a Capacity of the AirPlane using the arrays up */
            airplane[i].setCapacity(Integer.valueOf(capacities[generate.nextInt(capacities.length)]));
            
            /**checking the capacity of the plane and the minumum rating allowed */
            if (airplane[i].capacity()>=350)
            {
                 airplane[i].setMinimumrating(8);
            }else if(airplane[i].capacity()>=100 && airplane[i].capacity()<=200)
            {
                 airplane[i].setMinimumrating(5);
            }else{
                 airplane[i].setMinimumrating(1);
            }
             /**setting AirPlane as available */
            airplane[i].setIsAvailable(true);
        
              
       }
        /**pilot validation of minimum rating to the Airplane */
       for(int i=0;i<airplane.length;i++ )
       {
           
            /**getting minimumrating from the Airplane and input into a local variable */
           int minumum=airplane[i].getMinimumrating();
           
            /**for loop to check all pilots array */
           for(int j=0;j<pilot.length;j++ ) 
           {
                
                /**checking if pilot rating is bigger or equal to the minimum rating */
                if (pilot[j].getRating()>= minumum)
                {
                     /**if it is true the pilot is assign to the AirPlane */
                     airplane[i].assignPilot(pilot[j]);
                }

         }
            /**printing in the screem the string of AirPlane created */
           System.out.println(airplane[i].toString());   
       }
     
        /** return the Airplane array */
       return airplane; 
    
    }
    
    /** Setup flights */
    public ArrayList<Flight> buildFlight(AirPlane[] airplane,ArrayList<Flight> flight)  
    {
       
        /** for loop to setup 11 flights */
        for(int i=0;i<=11;i++ ) 
       {
          
           /**instance of new Flight   */         
           Flight flightnew = new Flight();
           /**generate a origin of the Flight using the arrays up */
           flightnew.setOrigin(original[generate.nextInt(original.length)]);
           /**generate a destination of the Flight using the arrays up */
           flightnew.setDestination(destin[generate.nextInt(destin.length)]);
           /**generate a departure and arrival time of the Flight using the arrays up */
           flightnew.schedule(depart[generate.nextInt(depart.length)],arrive[generate.nextInt(arrive.length)]);
           /**generate a date of the Flight using the arrays up */
           flightnew.setDateofflight(dateof[generate.nextInt(dateof.length)]);
           
           /**checking if the AirPlane is available */
           boolean result = logic.CheckAirplaneIsAvailable(airplane, i);
           if (result == true){
               flightnew.setAircraft(airplane[i]);
               airplane[i].setIsAvailable(false);
           }
               
           /**Add the flight to the ArrayList */
           flight.add(flightnew);
           
       } 
        /** Printing the flight inserted*/
       for(Flight c : flight) {
           System.out.println(c);
        }  
       
        /** return the flight*/
       return flight; 
    }
   
}
