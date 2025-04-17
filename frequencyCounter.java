import java.util.HashMap;

public class frequencyCounter {

    String name;

    frequencyCounter(String name) {
        this.name = name;
    }

    public void print() {
        int a = 0;
        HashMap<String, Integer> hp = new HashMap();

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            int frequency = 0;

            boolean ch = temp.toString().contains(String.valueOf(name.charAt(i)));
            if (name.charAt(i) != 0) {
                frequency++;
                a = frequency;
                temp.append(name.charAt(i));
            }
            if (ch == true) {
                a++;
            }
            hp.put(String.valueOf(name.charAt(i)), a);
            frequency = 0;
        }

        System.out.println(hp);
    }
}

class Main7 {
    public static void main(String[] args) {
        frequencyCounter fc = new frequencyCounter("Hgfjhwegjhfgrej");
        fc.print();

    }
}
