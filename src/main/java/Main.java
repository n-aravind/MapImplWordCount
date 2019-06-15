import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String sentence = "Now is the time for all good men to come to the aid of their country";
        Map<String,Integer> myMap = new TreeMap<String, Integer>();

        for (String word : sentence.split(" ")){
            Integer count = myMap.get(word);
            myMap.put(word.toLowerCase(),(count == null)?1:count +1 );
        }

        System.out.println(myMap);
    }
}
