package DataStructures.LinkedList;

public class LinkedListImple {
    Node head;

    public void insertAtFirst(int value){
           Node node =new Node(value);
           if(head != null){
               node.next = head;
               head = node;
           }else {
               head = node;
           }
    }

    public void insertAtEnd(int value){
        Node node = new Node(value);
        Node temp = head;
        if(temp!=null){
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
        }else {
            head= node;
        }
    }

    public void deleteAtFirst(){
        if(head == null){
            System.out.println("no elements are there");
        }else if(head.next == null){
            head=null;
        }else {
            Node node = head;
            head = node.next;
        }
    }

    public void deleteAtEnd(){
        Node temp = head;
        if (temp == null){
            System.out.println("no elements are present to delete");
        }else if(temp.next == null){
            head = null;
        }else {
            while (temp.next.next!=null){
                temp = temp.next;
            }
            temp.next=null;
        }
    }

    public void insertAtPos(int pos, int value){
        if(pos > length()){
            System.out.println("Cannot insert the element "+value+ " at the position "+pos);
        }else {
            Node node = new Node(value);
            if (pos == 1){
                node.next=head;
                head= node;
            }else {
                int i=1;
                Node temp = head;
                while (i!=pos-1){
                    temp= temp.next;
                    i++;
                }
                node.next =temp.next;
                temp.next=node;
            }
        }
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        if (pos > length()) System.out.println("cannot delete the elememt as the pos is higher than the length");
        else{
            int i =1;
            while (i<pos-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;

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

    public int length(){
        Node temp = head;
        int i = 1;
        if(temp==null) return 0;
        else if(temp.next==null) return 1;
        else {
            while (temp.next!=null){
                temp = temp.next;
                i++;
            }
            return i;
        }
    }
}
