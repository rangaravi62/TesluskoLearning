package DataStructuresMain.DoublyLinkedList;

public class DoublyLinkedList<T> {
        Node<T> head = null;
        Node<T> tail = null;
        public void insertAtStart(T data){
            Node<T> new_node = new Node<>(data);
            if (head==null){
                head= new_node;
                tail=new_node;
            }else {
                head.prev=new_node;
                new_node.next = head;
                head = new_node;
            }
        }

        public void printLL() {
            Node temp = head;
            if (head == null) System.out.println("No elements are present in the linked list");
            else {
                while (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println(temp.data);
            }
        }

        public void revPrintLL() {
            Node temp = tail;
            if (tail == null) System.out.println("No elements are present in the linked list");
            else {
                while (temp.prev != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.prev;
                }
                System.out.println(temp.data);
            }
        }

    public void insertAtEnd(T data) {
            Node new_node = new Node<>(data);
            if (tail == null){
                tail = new_node;
                head = new_node;
            }else {
                tail.next=new_node;
                new_node.prev=tail;
                tail= new_node;
            }
    }

    public void insertAtPos(int pos, T data) {
            if (pos <= length()+1){
                Node<T> new_node = new Node<>(data);
                Node<T> temp = head;
                int i = 0;
                pos--;
                while (i<pos-1){
                    temp=temp.next;
                    i++;
                }
                 new_node.next= temp.next;
                 new_node.prev = temp;
                 temp.next.prev =new_node;
                 temp.next= new_node;

            }else System.out.println("Pos is much larger than the size of linked list");

    }

    public int length(){
            Node temp = head;
            int size= 0;
            while (temp!=null){
                temp = temp.next;
                size++;
            }
            return size;

    }

    public void deleteAtStart() {
            if (head== null) System.out.println("No elements are present in the list to delete ");
            else {
                head = head.next;
                head.prev = null;
            }
    }

    public void deleteAtEnd() {
        if (tail== null) System.out.println("No elements are present in the list to delete ");
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteAtPos(int pos) {
            if(pos <=length()) {
                if((head == tail) && pos == 1){
                    head= null;
                    tail= null;
                }else {
                Node temp = head;
                pos--;
                int i = 0;
                while (i < pos - 1) {
                    temp = temp.next;
                    i++;
                }

                if (temp.prev == null) {
                    head = temp.next;
                    head.prev = null;
                } else {
                    temp.next = temp.next.next;
                    if (temp.next == null) tail = temp;
                    else temp.next.prev = temp;
                }
            }
    }
}
}
