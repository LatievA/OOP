package Assignment_3_2;

public class CarConcern_task4 {

    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern_task4(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern_task4(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "";
    }

    public CarConcern_task4(String model) {
        this.model = model;
        this.year = 0; // Default year
        this.color = "";

    }
}