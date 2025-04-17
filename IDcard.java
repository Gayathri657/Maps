import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;

public class IDcard {
    String name;
    Character section;
    int roll;

    IDcard(int roll, String name, Character section) {
        this.roll = roll;
        this.name = name;
        this.section = section;
    }

    public String toString() {
        return "Rollno : " + roll + " " + "Name : " + " " + name + " " + "Section : " + section;
    }
}

class main5 {
    public static void main(String[] args) {
        IDcard id = new IDcard(1, "gsafds", 'A');
        IDcard id1 = new IDcard(2, "gfash", 'B');
        IDcard id2 = new IDcard(3, "jshadj", 'C');

        HashMap<Integer, IDcard> h = new HashMap<>();
        h.put(11, id);
        h.put(12, id1);
        h.put(13, id2);
        Set<Map.Entry<Integer, IDcard>> pairs = h.entrySet();
        Iterator<Map.Entry<Integer, IDcard>> i = pairs.iterator();
        System.out.println("Enter the id card : ");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        while (i.hasNext()) {
            Map.Entry pair = i.next();
            Integer key = (Integer) pair.getKey();
            if (x == key) {
                System.out.println("Details of the student with id " + key + " " + "are" + " " + pair.getValue());
            }

        }

    }
}
