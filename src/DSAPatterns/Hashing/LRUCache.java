package DSAPatterns.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int capacity = 0;

    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node  = map.get(key);
            Node delNode = deleteNode(node);
            Node insertedNode = insertAfterHead(delNode);
            return insertedNode.value;
        } else return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            int val = node.value;
            Node delNode = deleteNode(node);
            delNode.value = value;
            Node insertedNode = insertAfterHead(delNode);
            map.put(key,insertedNode);
        } else {
            if(map.size() == capacity) {
                Node tailPrev = tail.prev;
                deleteNode(tailPrev);
                map.remove(tailPrev.key);
            }
            Node newNode = new Node(key,value);
            Node insertedNode = insertAfterHead(newNode);
            map.put(key,insertedNode);
        }
    }

    private Node deleteNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        return node;
    }

    private Node insertAfterHead (Node node) {
        Node headAfter = head.next;

        head.next = node;
        node.prev = head;

        node.next = headAfter;
        headAfter.prev = node;
        return node;
    }

    public void printNodes() {
        Node temp = head;
        while (temp != null) {
            if (temp.prev == null || temp.next == null)  {
                temp = temp.next;
                continue;
            }
            System.out.print(temp.key + "   ");
            temp = temp.next;
        }
        System.out.println("Map Size -> " + map.size());
    }

    public static void main(String[] args) {
        LRUCache cache  = new LRUCache(5);
        cache.put(1,2);
        cache.put(3,4);
        cache.put(5,6);
        System.out.println("Get Value -> " + cache.get(1));

        cache.printNodes();
    }

}

class Node {
    int key;
    int value;
    Node prev;
    Node next;
    Node () {
        key =  -1;
        value = -1;
        prev = null;
        next = null;
    }
    Node(int key, int value) {
        this.key = key;
        this.value = value;
        next = prev = null;
    }

}


