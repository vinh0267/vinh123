import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void sort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    Collections.swap(teams, j, j + 1);
                }
            }
        }
    }
}
