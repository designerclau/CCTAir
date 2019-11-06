/**
 * The AirPlane class was created to use the Plane object. This class will be instance by other classes during program execution.
 */
package CCTAir;

/**
 *
 * @author Claudinea de Almeida
 */


public class AirPlane {
    
    /**creating and initialization of attributes*/
   
    
    private String make;
    private String model;
    private int capacity;
    private int minimumrating;
    private Pilot pilot;
    private boolean isavailable = true;
    
    
    
   /**constructor default*/
    public AirPlane(){}
    
    
   /**constructor with parameter
     * @param make
     * @param model
     * @param capacity
     * @param pilot*/
    public AirPlane(String make, String model, int capacity, Pilot pilot)
    {
        this.make=make;
        this.model=model;
        this.capacity=capacity;
        this.pilot=pilot;
        this.isavailable=false;
    }
    
    /**return if the AirPlane is available
     * @return isavailable*/
    public boolean getIsAvailable()
    {
        return this.isavailable;
    }
    
    /**set as available or not available to the AirPlane
     *@param isavailable*/
    public void setIsAvailable(boolean isavailable)
    {
        this.isavailable=isavailable;
    }
    
   /** return a string with the make of the airplane
     * @return  make */
    public String getMake()
    {
        return this.make;
    }
    
    /**set a Maker of the Airplan
     * @param make*/
    public void setMake(String make)
    {
        this.make=make;
    }
    
    /**return a number being the airplane’s mode
     * @return model*/ 
    public String getModel()
    {
        return this.model;
    }
    
    /**set a model of the Airplane
     * @param model*/
    public void setModel(String model)
    {
        this.model = model;
    }
    
    /**return (at a minimum) the pilot’s name
     * @return pilot */
    public Pilot getPilot()
    {
        return this.pilot;
    }
    
    /**return a number being the capacity of the airplane.
     * @return  capacity*/ 
    public int capacity()
    {
        return this.capacity;
    }
    
    /**set the capacity of seats in the AirPlane
     * @param capacity*/
    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }
    
    /**assign the Pilot to the AirPlane
     * @param pilot*/
    public void assignPilot(Pilot pilot)
    {
        this.pilot=pilot;
    }

    /**return the minimum rating for the pilot to be able to fly with the Airplane
     * @return minimumrating*/
    public int getMinimumrating() 
    {
        return minimumrating;
    }

    /**Sets the minimum rating for the pilot to be able to fly with the Airplane
     * @param minimumrating*/
    public void setMinimumrating(int minimumrating) 
    {
        this.minimumrating = minimumrating;
    }

    /**return the string with the attributes, it will be used to display the information in screem
     * @return text*/
    @Override
    public String toString() 
    {
        return "AirPlane{" + "make=" + make + ", model=" + model + ", capacity=" + capacity + ", minimumrating=" + minimumrating + ", pilot=" + pilot + '}';
    }

    
   /** This method will print the information in the fallowing format 
   *    Aircraft : insert make insert model 
   *    Capacity: ___ seats 
   *   Pilot: ____    
     * @return print*/    
    public String printPlaine() {
        return "Aircraft: " + make + " " + model + "\nCapacity: " + capacity + " seats"+"\n" + pilot.printPilot();
    }
    
    
}
