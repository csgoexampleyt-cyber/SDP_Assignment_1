public class Main {
    public static void main(String[] args) {
        Car ToyotaCorollaBlack2024 = new CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("Black")
                .setYear(2024)
                .build();
        System.out.println(ToyotaCorollaBlack2024);
    }
}
