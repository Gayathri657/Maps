import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class FindfirstNonrepeating {
    String name;

    FindfirstNonrepeating(String name) {
        this.name = name;
    }

    LinkedHashMap<Character, Integer> nm = new LinkedHashMap<>();

    public Character process() {
        for (int i = 0; i < name.length(); i++) {
            Character key = name.charAt(i);
            int frequency = nm.getOrDefault(key, 0);
            nm.put(key, frequency + 1);
        }
        Character x = null;

        for (Map.Entry<Character, Integer> i : nm.entrySet()) {
            if (i.getValue() == 1) {
                x = i.getKey();
                break;
            }
        }
        return x;
    }

}

class Main4 {
    public static void main(String[] args) {
        FindfirstNonrepeating f = new FindfirstNonrepeating("gefyfyu4t3reyghwdwhgf");
        System.out.println(f.process());

    }
}
