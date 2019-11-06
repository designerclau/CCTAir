/**
 * The Pilot class was created to use the Pilot object. This class will be instance by other classes during program execution.
 */

package CCTAir;

/**
 *
 * @author Claudinea de Almeida
 * 
 */


public class Pilot {
    
    /**attribute creation and initialization */
    private String name;
    private int rating;
    private String kindofplain;

    /**constructor default */
    public Pilot(){}
    
    /**constructor with parameters */
    public Pilot(String name, int rating, String kindofplain)
    {
        this.name=name;
        this.rating=rating;
        this.kindofplain=kindofplain;
        
    }
    
    /**return the name of the Pilot */
    public String getName() 
    {
        return name;
    }

    /**set the name of the Pilot */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**return the rating of the Pilot */
    public int getRating() {
        return rating;
    }

    /**set the rating of the Pilot */
    public void setRating(int rating) {
        this.rating = rating;
    }

     /**return the Kind of plain of the Pilot */
    public String getKindofplain() {
        return kindofplain;
    }

    /**set the Kind of plain of the Pilot */
    public void setKindofplain(String kindofplain) {
        this.kindofplain = kindofplain;
    }

    
    /**return the string with the attributes, it will be used to display the information in screem. */
    @Override
    public String toString() {
        return "Pilot{" + "name=" + name + ", rating=" + rating + ", kindofplain=" + kindofplain + '}';
    }
    
    
    /**method used to print the name of the pilot */
    public String printPilot() {
        return "Pilot: " + name;
    }
    
    
}
