import java.util.*;

public class Observatory {

    private String observatoryName, countryName;
    private int startingYear;
    private int observatoryArea;
    private ArrayList <Galamsey> eventsArr = new ArrayList<Galamsey>();

    //Constructor

    public Observatory(String observatoryName, String countryName, int startingYear, int observatoryArea, ArrayList<Galamsey> eventsArr) {

        this.observatoryName = observatoryName;
        this.countryName = countryName;
        this.startingYear = startingYear;
        this.observatoryArea = observatoryArea;
        this.eventsArr = eventsArr;
    }

    //Getters and Setters


    public String getObservatoryName() {
        return observatoryName;
    }

    public void setObservatoryName(String observatoryName) {
        this.observatoryName = observatoryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public int getObservatoryArea() {
        return observatoryArea;
    }

    public void setObservatoryArea(int observatoryArea) {
        this.observatoryArea = observatoryArea;
    }

    public ArrayList<Galamsey> getEventsArr() {
        return eventsArr;
    }

    public void setEventsArr(ArrayList<Galamsey> eventsArr) {
        this.eventsArr = eventsArr;
    }

    //Inherited method

   /*
    * Method to return largest galamsey colour value
    * recorded at the observatory
    */
    public int largestColourValue(){
        //get the values of the events
        ArrayList<Integer>intRay = new ArrayList<Integer>();
        for (Galamsey event: eventsArr) {
            intRay.add(event.getColourValue()); //adding the event's colour value to the list
        }
        return Collections.max(intRay); //returns the largest colour value
    }

    /*
     *Method to return average galamsey colour value recorded
     * at the observatory
     */

    public double averageColourValue(){
        ArrayList<Integer> intRay = new ArrayList<Integer>();
        for (Galamsey event: eventsArr) {
            intRay.add(event.getColourValue()); //adding the event's colour value to the list
        }
        int sum = 0;
        for(int w:intRay){
            sum = sum+w;
        }
        double average = sum/intRay.size();
        return average;

    }


    //ArrayList.stream(intRay).average();
    /*OptionalInt average = intRay
            .stream()
            .mapToDouble(a -> a)
            .average();
*/

    /*
     * List of all galamsey recorded at the observatory w/
     * colour value greater than a given/arbitrary number
     */
}
