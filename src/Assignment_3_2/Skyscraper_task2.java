package Assignment_3_2;

public class Skyscraper_task2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

    public Skyscraper_task2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper_task2(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper_task2(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Skyscraper_task2 skyscraper = new Skyscraper_task2();
        Skyscraper_task2 skyscraperTower = new Skyscraper_task2(50);
        Skyscraper_task2 skyscraperSkyline = new Skyscraper_task2("JavaRushDevelopment");
    }
}