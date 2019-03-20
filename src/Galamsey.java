public class Galamsey {

    private String vegetationColour;
    private int colourValue, position, year;


    //Constructor
    public Galamsey(String vegetationColour, int colourValue, int position, int year){
        this.vegetationColour = vegetationColour;
        this.colourValue = colourValue;
        this.position = position;
        this.year = year;
    }

    public Galamsey() {

    }

    //Accessor and Getter methods

    public String getVegetationColour() {
        return vegetationColour;
    }

    public void setVegetationColour(String vegetationColour) {
        this.vegetationColour = vegetationColour;
    }

    public int getColourValue() {
        return colourValue;
    }

    public void setColourValue(int colourValue) {
        this.colourValue = colourValue;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Auxiliary Method
    public String getInformation(){
        return "Vegetation colour " + getVegetationColour() +
                "\nColour value " + getColourValue() +
                "\nPosition" + getPosition() +
                "\nYear" + getYear();

    }
}
