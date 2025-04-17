import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

//Since map is not part of collection we can't use iterator interface
//We can access only values or only keys or just an entry;
//When we access just key which gives Set  or values which gives us collection type then we can tranverse through the collection,Set using iterator
//Map has inner static interface Entry

public class Retreving {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "Gayathri");
        hm1.put(2, "hdgh");
        hm1.put(3, "dgfg");
        hm1.put(null, "1"); // null values are allowed
        hm1.put(null, "1");
        hm1.put(0, "gfy");

        Collection<String> values = hm1.values();
        Iterator<String> itr = values.iterator();
        System.out.println("Values are : ");
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
        Set<Integer> set = hm1.keySet();
        Iterator<Integer> itr1 = set.iterator();
        System.out.println("Keys are : ");
        while (itr1.hasNext()) {
            Integer i = itr1.next();
            System.out.println(i);
        }
        Set entry = hm1.entrySet();
        Iterator itr2 = entry.iterator();
        while (itr2.hasNext()) {
            Map.Entry pair = (Entry) itr2.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());

        }

    }
}
