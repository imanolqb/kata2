import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class CsvFilePlayerLoader implements PlayerLoader{
    private final File file;

    public CsvFilePlayerLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Player> load() throws FileNotFoundException {
        return load(new FileReader(file));
    }

    private List<Player> load(FileReader fileReader) {
        try{
            return load(new BufferedReader(fileReader));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private List<Player> load(BufferedReader bufferedReader) throws IOException {
        List<Player> result = new ArrayList<>();
        String line = bufferedReader.readLine();
        while((line = bufferedReader.readLine()) != null) {
            Player player = toPlayer(line);
            result.add(player);
        }
        return result;
    }

    private Player toPlayer(String line) {
        return toPlayer(line.split(";"));
    }

    private Player toPlayer(String[] split) {
        return new Player(
                Integer.parseInt(split[0]),
                split[1],
                split[2],
                split[3],
                Integer.parseInt(split[4]),
                split[5],
                split[6],
                split[7],
                split[8]
        );
    }
}
