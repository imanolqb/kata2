public class Player {
    private final int year;
    private final String name;
    private final String position;
    private final String height;
    private final int weight;
    private final String team;
    private final String selection;
    private final String draft;
    private final String nationality;

    public Player(int year, String name, String position, String height, int weight, String team, String selection, String draft, String nationality) {
        this.year = year;
        this.name = name;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.team = team;
        this.selection = selection;
        this.draft = draft;
        this.nationality = nationality;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getTeam() {
        return team;
    }

    public String getSelection() {
        return selection;
    }

    public String getDraft() {
        return draft;
    }

    public String getNationality() {
        return nationality;
    }

    public String toString(){
        return "Player{" +
                "Year=" + year +
                ", name=" + name +
                ", position=" + position +
                ", height=" + height +
                ", weight=" + weight +
                ", team=" + team +
                ", selection type=" + selection +
                ", NBA Draft Status=" + draft +
                ", nationality=" + nationality +
                "}";
    }
}
