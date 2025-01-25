package Assignment_3_2;

public class Programmer_task7 {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary > salary) {
            salary = newSalary;
        }
    }

    public static void main(String[] args) {
    }
}
