package DataStructures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class TestingLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.show();
        list.delete();
        list.show();

        

    }
}
