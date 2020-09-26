
/**
 * Write a description of class CarModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarModel
{
    // Instance variables
    private String brand;
    private String type;
    private String fuel;
    private double kilometrePrLitre;
    
    // Constructor
    public CarModel(String carBrand, String carType, String carFuel, double carKMPrL) {
        brand = carBrand;
        type = carType;
        fuel = carFuel;
        kilometrePrLitre = carKMPrL;
    }
    
    public CarModel() {
        brand = "";
        type = "";
        fuel = "";
        kilometrePrLitre = 0;
    }
    
    // Mutator methods
    public void setBrand(String carBrand) {
        brand = carBrand;
    }
    
    public void setType(String carType) {
        type = carType;
    }
    
    public void setCarFuel(String carFuel) {
        fuel = carFuel;
    }
    public void setKMPrL(double carKMPrL) {
        kilometrePrLitre = carKMPrL;
    }
    
    // Accessor methods
    public void getCarModelDetail() {
        System.out.println("This is detail about the car model");
        System.out.println("##################################");
        System.out.println("The brand of the car is " + brand);
        System.out.println("The type of the car is " + type);
        System.out.println("The car uses " + fuel + " as fuel");
        System.out.println("The car goes " + kilometrePrLitre + " KM pr litre");
        System.out.println();
    }
    
    public int getOwnerTax() {
        int ownerTax;
        ownerTax = 0;
        if(fuel == "gas") {
            if(kilometrePrLitre < 10) {
               ownerTax = 5000; 
            } else if(kilometrePrLitre == 10 || kilometrePrLitre <= 15) {
                ownerTax = 3500;
            } else if(kilometrePrLitre > 15) {
                ownerTax = 1200;
            }
        } else if(fuel == "diesel") {
            ownerTax = 3500;
        }
        return ownerTax;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getType() {
        return type;
    }
    
    public String getFuel() {
        return fuel;
    }
    
    public double getKMPrL() {
        return kilometrePrLitre;
    }
}
