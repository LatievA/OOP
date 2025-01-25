package Assignment_3_2;

public class Building_task5 {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building_task5 building = new Building_task5();
        building.initialize("Restaurant");
        building.initialize("Barbershop");
    }
}
