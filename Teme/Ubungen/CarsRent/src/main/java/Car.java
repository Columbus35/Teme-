public class Car {

    private int id = 0;
    private String make;
    private String model;
    private int rentalPrice = 0;
    private int year = 0;
    private int mileage = 0;
    private String fuelType;

    public Car(int id, String make, String model, int rentalPrice, int year, int mileage, String fuelType) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id= " + id +
                " make= " + make +
                " model= " + model +
                " rentalPrice= " + rentalPrice +
                " year= " + year +
                " mileage= " + mileage +
                " fuelType= " + fuelType;
    }
}
