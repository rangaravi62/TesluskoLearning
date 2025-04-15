package DataStructuresMain.DsaProb;

import DataStructuresMain.LinkedList.LinkedList;

public class MiddleOfLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEleAtStart(1);
        list.insertEleAtStart(2);
        list.insertEleAtEnd(3);
        list.insertEleAtEnd(4);
        list.printLL();
        list.middleOfLL();
    }
}
