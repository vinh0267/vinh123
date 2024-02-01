import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public static void sort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }
            Collections.swap(teams, i, maxIndex);
        }
    }
}
