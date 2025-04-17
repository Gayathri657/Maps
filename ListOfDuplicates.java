import java.util.List;
import java.util.HashMap;
import java.util.Collection;

class ListOfDuplicates {
    List<Integer> l = List.of(1, 2, 7, 9, 3, 2, 1, 9);
    HashMap<Integer, Integer> hp = new HashMap<>();
    int frequency = 0;

    boolean processList() {
        boolean b = false;
        for (int i : l) {
            frequency = hp.getOrDefault(i, 0);
            hp.put(i, frequency + 1);
        }
        System.out.println(hp);

        Collection<Integer> s = hp.values();
        for (Integer i : s) {
            if (i >= 2) {
                b = true;
            }
        }
        return b;
    }

}

class Main2 {
    public static void main(String[] args) {
        ListOfDuplicates x = new ListOfDuplicates();
        System.out.println("Does the list have any Duplicates???");
        System.out.println(x.processList());
    }
}