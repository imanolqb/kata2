import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        PlayerLoader csvFilePlayerLoader = new CsvFilePlayerLoader(new File("players_allstar.csv"));
        List<Player> playerList = csvFilePlayerLoader.load();
        Map<String, Integer> barchart = new TeamsHistogramCalculator().calculate(playerList);
        for (String team : barchart.keySet()) {
            System.out.println(team + "=" + barchart.get(team));
        }
    }
}
