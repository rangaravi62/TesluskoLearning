package DataStructuresMain.DsaProb;

import DataStructuresMain.LinkedList.LinkedList;
import DataStructuresMain.LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEleAtStart(1);
        list.insertEleAtStart(2);
        list.insertEleAtEnd(3);
        list.printLL();
        list.reverseLL();
        list.printLL();

    }

}
