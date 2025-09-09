public class CarBuilder {
    private String brand;
    private String model;
    private String color;
    private int year;

//Setters
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

//Build method
    public Car build() {
        return new Car(brand, model, color, year);
    }
}
