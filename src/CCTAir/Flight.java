/**
 * The Flight class was created to use the Flight object. This class will be instance by other classes during program execution.
 */
package CCTAir;

/**
 *
 * @author Claudinea de Almeida
 */


public class Flight {
    
    /**attributes creation and initialization*/
    private String origin;
    private String destination;
    private String departuretime;
    private String arrivaltime;
    private String dateofflight;
    private AirPlane aircraft;
    
   /**constructor default*/
    public Flight(){}
    
    /**constructor with parameters*/
    public Flight(String origin,String destination,String dateofflight,AirPlane aircraft)
    {
        
        this.origin=origin;
        this.destination=destination;
        this.dateofflight=dateofflight;
        this.aircraft=aircraft;
    }
    
    /**method to schedule time to arrive of the Flight*/
    public void schedule(String arrivalTime) 
    {
        this.arrivaltime=arrivalTime;
    }
    /**method to schedule time to arrive and departure of the Flight  */      
    public void schedule(String arrivalTime, String departureTime){
        this.arrivaltime=arrivalTime;
        this.departuretime=departureTime;
    } 

    /**return the origin of the fligh*/
    public String getOrigin() 
    {
        return origin;
    }
    
    /**set the origin of the fligh*/
    public void setOrigin(String origin) 
    {
        this.origin = origin;
    }

    /**return the destination of the fligh*/
    public String getDestination() 
    {
        return destination;
    }

    /**setting the destination of the fligh*/
    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    /**return the departure time of the fligh*/
    public String getDeparture() 
    {
        return departuretime;
    }

    /**return the arrival time of the fligh*/
    public String getArrival() 
    {
        return arrivaltime;
    }
    
    /**return the date of the fligh*/
    public String getDateofflight() 
    {
        return dateofflight;
    }

    /**setting the origin of the fligh*/
    public void setDateofflight(String dateofflight)
    {
        this.dateofflight = dateofflight;
    }

    /**returning the Airplane for this fligh*/
    public AirPlane getAircraft() 
    {
        return aircraft;
    }

     /**setting the AirPlane to the fligh*/
    public void setAircraft(AirPlane aircraft) 
    {
        this.aircraft = aircraft;
    }
    

/** This method will print the information in the fallowing format 
*Flight Information: 
* Date: insert date of flight
* From: insert origin to insert destination 
* Flight time: insert departure time to insert arrival time                   
*
*Plane Information:
* Aircraft : insert make insert model 
* Capacity: ___ seats 
* Pilot: _____ */

    public String printFlight() 
    {
        
        String flight = "Flight Information:" + "\n"+"Date: " + dateofflight +"\n"+"From: " + origin + " to " + destination + "\n"+ "Flight time: " + departuretime + " to " + arrivaltime +  "\n";
        
        String plain  = "Plane Information:" + "\n"+ aircraft.printPlaine() + "\n";
     
        return flight+"\n"+plain;
    }

    
    /**return the string with the attributes, it will be used to display the information in screem.*/
    @Override
    public String toString() 
    {
        return "Flight{" + "origin=" + origin + ", destination=" + destination + ", departuretime=" + departuretime + ", arrivaltime=" + arrivaltime + ", dateofflight=" + dateofflight + ", aircraft=" + aircraft + '}';
    }


}
