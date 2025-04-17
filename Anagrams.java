import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Anagrams {
    String[] names;

    Anagrams(String[] names) {
        this.names = names;
    }

    void process() {

        List<Map<Character,Integer>> ll = new ArrayList<>();
        List<String[]> ll1 = new ArrayList<>();

        for (String i : names) {
            HashMap<Character, Integer> nm = new HashMap<>();
            for (int j = 0; j < i.length(); j++) {
                Character key = i.charAt(j);
                int frequency = nm.getOrDefault(key, 0) + 1;
                nm.put(key, frequency);
            }
            ll.add(nm);
            Iterator it=ll.iterator();
            while(it.hasNext())
            {
                
            }
        }
        System.out.println(ll);
    }

}

class Main3 {
    public static void main(String[] args) {
        Anagrams a = new Anagrams(new String[] { "eat", "ate", "tea", "tan", "nat", "bat" });
        a.process();
    }
}