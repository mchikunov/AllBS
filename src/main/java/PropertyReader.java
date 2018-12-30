import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PropertyReader {
    private static final String workDir = System.getProperty("user.home");
    public static String read(String param) throws IOException {

        String out  = "no such parameter";
        String delim ="=";
        String[] kv = new String[2];

        FileReader fr = null;
        try {
            fr = new FileReader(".\\src\\main\\confDb.properties");
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                int i=0;
                for (String retval : scan.nextLine().split(delim, 2)){
                    kv[i]=retval;
                    i++;
                }
                if (kv[0].equals(param)) out=kv[1];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fr.close();
        }

        return out;
    }
}