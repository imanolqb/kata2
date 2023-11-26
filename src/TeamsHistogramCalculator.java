import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamsHistogramCalculator implements BarchartCalculator{

    @Override
    public Map<String, Integer> calculate(List<Player> playerList) {
        Map<String, Integer> result = new HashMap<>();
        for(Player player : playerList) {
            String team = player.getTeam();
            result.put(team, result.getOrDefault(team,0)+1);
        }
        return result;
    }
}
