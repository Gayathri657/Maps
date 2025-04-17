import java.util.LinkedHashMap;

public class frequencyCount2 {
    String name;

    frequencyCount2(String name) {
        this.name = name;
    }

    public void print() {
        LinkedHashMap<Character, Integer> lp = new LinkedHashMap<>();
        int i = 0;
        int frequency = 0;
        for (i = 0; i < name.length(); i++) {
            Character key = name.charAt(i);
            frequency = lp.getOrDefault(key, 0);
            lp.put(key, frequency + 1);
        }
        System.out.println(lp);
    }

}

class Main1 {
    public static void main(String[] args) {
        frequencyCount2 f = new frequencyCount2("Jhsvdhjevhfvrtrvfr");
        f.print();

    }
}
