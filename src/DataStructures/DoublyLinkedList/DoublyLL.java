package DataStructures.DoublyLinkedList;

public class DoublyLL {
    Node head;
    Node tail;
    public void insertAtStart(int val){
        Node node = new Node(val);
        if(head == null && tail == null){
            head = node;
            tail = node;
        }else{
            node.next= head;
            head.prev = node;
            head = node;
        }
    }

    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null && tail == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev=tail;
            tail = node;
        }
    }

    public void show(){
        Node temp = head;
        if (temp == null){
            System.out.println("No elements present ");
        }else{
            while (temp.next!=null){
                System.out.print(temp.data +" - > ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    public void revShow(){
        Node revTemp = tail;
        if (revTemp == null){
            System.out.println("No elements present ");
        }else {
            while (revTemp.prev!=null){
                System.out.print(revTemp.data +" - > ");
                revTemp = revTemp.prev;
            }
            System.out.println(revTemp.data);
        }

        }

    }

