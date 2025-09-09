public class Main {
    public static void main(String[] args) {
        //Creating CarBuilder
        Car car = new CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("Black")
                .setYear(2024)
                .build();
        System.out.println(car);
    }
}
