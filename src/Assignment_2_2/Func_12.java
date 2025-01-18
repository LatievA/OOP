package Assignment_2_2;

public class Func_12 {
    public static String city = "Tokyo";
    public static double population = 34.5;
    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }
    public static void printCityPopulation(String cityName, double cityPopulation){
        System.out.println("The population of the city " + cityName + " is " + cityPopulation + " million people.");
        System.out.println("While the most populous city " + cityName + " has a population of " + cityPopulation + " million people.");
    }
}
