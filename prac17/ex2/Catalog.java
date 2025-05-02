package prac17.ex2;


public class Catalog {
    private Node head;
    private Node tail;

    public void addNode(){
        Node node = new Node();
        node.readAt();
        node.next=null;

        if (head == null){
            head = node;
            tail = node;
            node.prev=null;
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }
    public void printC(){
        Node now = head;
        while (now != null){
            now.printAt();
            now = now.next;
        }
    }
}
