package collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EntryInterfaceTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");


//        for (Map.Entry<Integer,String> entry : map.entrySet()){
//            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//        }


        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
        System.out.println();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
        System.out.println();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

    }


}
