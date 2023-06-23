package DataStructuresMain.LinkedList;

public class LinkedList<T> {
    Node<T> head;

    public void printLL(){
        Node<T> temp = head;
        while (temp!= null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int length(){
        Node temp = head;
        int size = 0;
        while (temp!= null){
            temp= temp.next;
            size++;
        }
        return size;
    }

     public void insertEleAtStart(T data){
         Node<T> new_node = new Node<>(data);
         if (head == null) head = new_node;
         else {
             new_node.next = head;
             head = new_node;
         }
     }

     public void insertEleAtEnd(T data){
        Node<T> new_node = new Node<>(data);
        Node<T> temp = head;
        if (temp==null) temp = new_node;
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void insertAtPos(int pos, T data){
        Node new_node = new Node<>(data);
        Node temp = head;
        if (pos <= length()){
            pos--;
            int i = 0;
            while (i<pos-1){
                temp=temp.next;
                i++;
            }
            new_node.next =  temp.next;
            temp.next= new_node;
        }
    }

    public void deleteAtStart(){
        if (head == null) System.out.println("No elements in the list to delete ");
        else {
            head= head.next;
        }
    }

    public void deleteAtEnd(){
        if (head == null) System.out.println("No elements in the list to delete ");
        else {
            Node temp = head;
            while (temp.next.next!=null){
                temp = temp.next;
            }
            temp.next= null;
        }
    }

    public void deleteAtPos(int pos){
        if (head == null) System.out.println("No elements in the list to delete ");
        else if(pos<=length()){
            Node temp = head;
            pos--;
            int i =0;
            while (i<pos-1){
                temp=temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }else System.out.println("pos value is larger than the length of the linked list");

    }






}
