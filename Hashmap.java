import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;

//In Map keys must be unique, values can be duplicated
//only in Hashmap and LinkedHashmap keys as null value are allowed
//TreeMap only allows value as null
//Hashtable does not allow any null values neither key nor value.
//Every data is considered as an Entry
class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "Gayathri");
        hm1.put(2, "hdgh");
        hm1.put(3, "dgfg");
        hm1.put(null, "1"); // null values are allowed
        hm1.put(null, "1");
        hm1.put(0, "gfy");
        System.out.println(hm1);
        LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<>();
        hm2.put(1, "Gayathri");
        hm2.put(2, "hdgh");
        hm2.put(3, "dgfg");
        hm2.put(null, "1");
        hm2.put(5, null);
        hm2.put(0, "gfy");
        System.out.println(hm2);
        TreeMap<Integer, String> hm3 = new TreeMap<>();
        hm3.put(1, "Gayathri");
        hm3.put(2, "hdgh");
        hm3.put(3, "dgfg");
        hm3.put(5, null);
        hm3.put(0, "gfy");
        System.out.println(hm3);
        Hashtable<Integer, String> hm4 = new Hashtable();
        hm4.put(1, "Gayathri");
        hm4.put(2, "hdgh");
        hm4.put(3, "dgfg");
        hm4.put(5, "bgfgh");
        hm4.put(8, null);
        hm4.put(0, "gfy");
        System.out.println(hm4);
    }
}
