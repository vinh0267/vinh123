import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();


        teams.add(new FootballTeam(1, "Team A", 11, 20));
        teams.add(new FootballTeam(2, "Team B", 11, 15));
        teams.add(new FootballTeam(3, "Team C", 11, 25));
        teams.add(new FootballTeam(4, "Team D", 11, 18));


        System.out.println("Before sorting:");
        teams.forEach(System.out::println);

        // Bubble Sort
        BubbleSort.sort(teams);
        System.out.println("\nAfter Bubble Sort:");
        teams.forEach(System.out::println);

        // Selection Sort
        SelectionSort.sort(teams);
        System.out.println("\nAfter Selection Sort:");
        teams.forEach(System.out::println);

    }
}
