package OOP_part2;

public class Iphone_task9 {
    private String model;
    private String color;
    private int price;

    public Iphone_task9(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!(obj instanceof Iphone_task9))
            return false;

        Iphone_task9 other = (Iphone_task9) obj;

        // Compare the fields
        return this.model.equals(other.model) &&
                this.color.equals(other.color) &&
                this.price == other.price;
    }

    public static void main(String[] args) {
        Iphone_task9 iphone1 = new Iphone_task9("X", "Black", 999);
        Iphone_task9 iphone2 = new Iphone_task9("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
