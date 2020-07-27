import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Main {
    private String result;
    private LinkedHashMap map = new LinkedHashMap<String, Double>();
    private Matcher m;
    private Pattern p;

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public String parseData(){
        String[] lines = result.split("##");

        int i = 0;
        while(lines.length <= i){
            String currentLine = lines[i];
            p = Pattern.compile("/name:/gi");
            m = p.matcher(currentLine);

            while(m.find()){
                p = Pattern.compile("(?<=name:+)", i);
            }
        }
        return "";
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);
    }
}
