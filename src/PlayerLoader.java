import java.io.FileNotFoundException;
import java.util.List;

public interface PlayerLoader {
    List<Player> load() throws FileNotFoundException;
}
