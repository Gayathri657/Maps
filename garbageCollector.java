import java.util.HashMap;
import java.util.WeakHashMap;

// When we use Hashmap even though the object used in the hashmap became null the hashmap prints all the values
// when we use weakhashmap the objects became null and garbage collector is used it prints null

class gayathri {
    String name = "hsgh";

    public void finalize() {
        System.out.println("garbage collector is used");
    }

    public String toString() {
        return name;
    }
}

class garbageCollectot {
    public static void main(String[] args) {
        gayathri g = new gayathri();
        WeakHashMap<gayathri, Integer> h = new WeakHashMap();
        h.put(g, 11);
        System.out.println(h);
        g = null;
        System.gc();
        System.out.println(h);

    }
}