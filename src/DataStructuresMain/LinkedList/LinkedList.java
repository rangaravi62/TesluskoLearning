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
        if (pos <= length()+1){
            pos--; // if index starts from 0 this is required , for 1 it is not required
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

//    public void deleteAtPos(int pos){
//        if (head == null) System.out.println("No elements in the list to delete ");
//        else if(pos<=length()){
//            Node temp = head;
//            pos--; // if index starts from 0 this is required , for 1 it is not required
//            int i =0;
//            while (i<pos-1){
//                temp=temp.next;
//                i++;
//            }
//            temp.next = temp.next.next;
//        }else System.out.println("pos value is larger than the length of the linked list");
//
//    }


    public  void deleteAtIndex(int index){
        Node temp = head;
        if(length() > 0){
            if(index == 0){
                head = head.next;
            }else if(index + 1 == length()){
                while(temp.next.next!=null){
                    temp =temp.next;
                }
                temp.next= null;
            }else if(index+1 <= length()){
                int pos =0;
                while(pos < length()){
                    if(pos == index-1){
                        System.out.println("pos ->"+pos);
                        break;
                    }else{
                        temp = temp.next;
                        pos++;
                    }
                }
                temp.next = temp.next.next;
            }

        }
    }

    public void reverseLL(){
        Node prev = null;
        Node current = head;
        Node next ;

        while (current!=null){
            next = current.next;
            current.next=prev;
            prev= current;
            current=next;
        }
        head = prev;
    }

    public void middleOfLL(){
        Node sptr= head;
        Node fptr = head;
        while (fptr!=null && fptr.next!=null){ //if i place fptr!=null second it will throw NPE
            sptr = sptr.next;
            fptr=fptr.next.next;
        }
        System.out.println("middle is : "+sptr.data);
    }






}
