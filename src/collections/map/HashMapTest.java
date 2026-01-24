package collections.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1001, "John Smith");
        studentMap.put(1002, "Emily Brown");
        studentMap.put(1003, "Michael Johnson");

        for (Map.Entry<Integer, String> map : studentMap.entrySet()){
            System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        }


    }
}
