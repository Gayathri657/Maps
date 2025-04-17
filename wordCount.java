import java.util.LinkedHashMap;

public class wordCount {
    String s;

    wordCount(String s) {
        this.s = s;
    }

    public void print() {
        int a = 0;
        int frequency = 0;
        LinkedHashMap<String, Integer> hm = new LinkedHashMap();
        String[] sb = s.split(" ");
        for (String i : sb) {
            frequency = hm.getOrDefault(i, 0);
            hm.put(i, frequency + 1);
        }
        System.out.println(hm);
    }
}

class Main10 {
    public static void main(String[] args) {
        wordCount wc = new wordCount("This is Gayathri Hope you are doing good what are you upto");
        wc.print();

    }
}