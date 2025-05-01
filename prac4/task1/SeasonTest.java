package prac4.task1;

public class SeasonTest {
    public static void printSeasonMessage(Season season) {
        System.out.print("I love ");
        System.out.print(season.getName() + "\n");
    }

    public static void main(String[] args) {
        Season favorite = Season.AUTUMN;

        System.out.println("Fav. season:");

        System.out.printf("Name: %s, Avg. temp.: %.1f°C, Description: %s%n",
                favorite.getName(), favorite.getAverageTemperature(), favorite.getDescription());

        System.out.println("\nFav. season message:");
        printSeasonMessage(favorite);

        System.out.println("\nAll seasons:");
        for (Season season : Season.values()) {
            System.out.printf("Name: %s, Avg. temp.: %.1f°C, Description: %s%n",
                    season.getName(), season.getAverageTemperature(), season.getDescription());
        }
    }
}

