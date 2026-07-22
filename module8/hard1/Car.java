public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean isNew;
    private double price;
    private boolean isAvailable;


    public Car(String brand, String model, int year, boolean isNew, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isNew = isNew;
        this.price = price;
        this.isAvailable = true; // по умолчанию — в наличии
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
}
