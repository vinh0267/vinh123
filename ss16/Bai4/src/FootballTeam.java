public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    // Add other getters and setters as needed

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}';
    }
}
