package prac17.ex3;

public class Catalog {
    private Node head;
    public void addNode(){
        Node node = new Node();
        node.readAt();

        if (head == null){
            head = node;
            node.next = head;
        }else{
            Node now = head;
            while (now.next != head){
                now = now.next;
            }
            now.next = node;
            node.next = head;
        }
    }
    public void printC(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node now = head;
        do {
            now.printAt();
            System.out.println();
            now = now.next;
        } while (now != head);

    }
}
