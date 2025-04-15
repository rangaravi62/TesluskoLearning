package DataStructuresMain.LinkedList;

public class LLTest {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insertEleAtStart(2);
        ll.deleteAtIndex(1);
        ll.insertEleAtStart(2);
        ll.insertEleAtStart(7);
        ll.insertEleAtStart(3);
        ll.insertEleAtStart(2);
        ll.insertEleAtStart(5);
        ll.insertEleAtEnd(5);
        ll.deleteAtIndex(6);
//        ll.deleteAtIndex(4);



        ll.printLL();

    }
}
