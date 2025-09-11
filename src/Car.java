public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    //So I had a problem, I thought that this constructor wasn't private when actually it's package-private
     Car(CarBuilder builder) {
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.color = builder.getColor();
        this.year = builder.getYear();
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + color + " " + year;
    }
}