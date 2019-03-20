import java.util.ArrayList;
import java.util.Collections;

public class Monitoring {

    ArrayList<Observatory> observatoryList = new ArrayList<Observatory>();

    public Observatory largestAverageColourValue(){
        ArrayList<Double>averageRay = new ArrayList<>();
        for (Observatory observatory:observatoryList){
            averageRay.add(observatory.averageColourValue());
        }
        //get the index of the max value in the averageRay and then get the Observatory at that position
        Observatory largestAverage = observatoryList.get(averageRay.indexOf(Collections.max(averageRay)));
        return largestAverage;
    }

    public int largestEverColourValue(){
        ArrayList<Integer>largeRay = new ArrayList<>();
        for (Observatory observatory:observatoryList){
            largeRay.add(observatory.largestColourValue());
        }
        return Collections.max(largeRay);
    }

    //list of all “galamsey” recorded with colour value greater than a given/arbitrary number
    public ArrayList<Galamsey> galamseyList(int arbitraryNumber) {
        ArrayList<Galamsey> GalamseyArr = new ArrayList<Galamsey>();
        for (Observatory observatory : observatoryList)
            for (Galamsey galamsey : observatory.getEventsArr())
                if (galamsey.getColourValue() > arbitraryNumber) {
                    GalamseyArr.add(galamsey);
                }


    return GalamseyArr;
    }

}
