
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    //Instance variables
    private int tripCounter;
    private String colour;
    private String registrationNumber;
    private int costPrice;
    private int salesPrice;
    private CarModel carModel;
    
    //Constructor
    public Car(int carTripCounter, String carColour, String carRegistrationNumber, int carCostPrice){
        tripCounter = carTripCounter;
        colour = carColour;
        registrationNumber = carRegistrationNumber;
        costPrice = carCostPrice;
        salesPrice = 0;
    }
    
    //Mutator Methods
    public void setCarModel(CarModel newCarModel) {
        carModel = newCarModel;
    }
    
    public void setTripCounter(int carTripCounter) {
        tripCounter = carTripCounter;
    }
    
    public void setColour(String carColour) {
        colour = carColour;
    }
    
    public void setRegNumber(String regNumber) {
        registrationNumber = regNumber;
    }
    
    public void setCostPrice(int carCostPrice) {
        costPrice = carCostPrice;
    }
    
    public void setSalesPrice(int carSalesPrice) {
        salesPrice = carSalesPrice;
    }
    
    
    //Accessor Methods
    public void ordinaryOrLuxury() {
        if(salesPrice < 500000) {
            System.out.println("It's an ordinary car");
        } else {
            System.out.println("Hurrey it's an luxury car");
        }
    }
    
    public void carDetails() {
        System.out.println("Here are the details about the car");
        System.out.println("##################################");
        System.out.println("The car has driven " + tripCounter + "km");
        System.out.println("The car is " + colour);
        System.out.println(registrationNumber + " is the registration number of the car");
        System.out.println("~~~~~~~~~~Price information~~~~~~~~~~");
        System.out.println("The car is priced at " + costPrice + " DKK from new");
        System.out.println("The car is sold at " + salesPrice + " DKK");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        ordinaryOrLuxury();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        carModel.getCarModelDetail();
    }
    
    public CarModel getCarModel() {
        return carModel;
    }
    
    public int getTripCounter() {
        return tripCounter;
    }
    
    public String getColour() {
        return colour;
    }
    
    public String getRegNumber() {
        return registrationNumber;
    }
    
    public int getCostPrice() {
        return costPrice;
    }
    
    public int getSalesPrice() {
        return salesPrice;
    }
    
    
}
