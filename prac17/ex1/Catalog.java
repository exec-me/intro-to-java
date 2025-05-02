package prac17.ex1;

public class Catalog {
    private Node head;
    public void addNode(){
        Node node = new Node();
        node.readAt();
        node.next=null;

        if (head == null){
            head = node;
        }else{
            Node now = head;
            while (now.next != null){
                now = now.next;
            }
            now.next = node;
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
