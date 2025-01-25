package Assignment_3_2;

public class Car_task10 {
    private String model;
    private int year;

    public Car_task10(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (model == null ? 0 : model.hashCode());
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args) {
        Car_task10 lamborghini = new Car_task10("Lamborghini", 2020);
        Car_task10 lamborghini1 = new Car_task10("Lamborghini", 2020);
        Car_task10 ferrari = new Car_task10("Ferrari", 2020);
        Car_task10 ferrari1 = new Car_task10("Ferrari", 2020);
        Car_task10 bugatti = new Car_task10("Bugatti", 2020);
        Car_task10 bugatti1 = new Car_task10("Bugatti", 2020);

        System.out.println(ferrari.hashCode() == ferrari.hashCode());  // true
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());  // true
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());  // true
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());  // true
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());  // false
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());  // false
    }
}