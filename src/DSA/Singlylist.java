class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Singlylinkedlist{

    Node head;

    void insertatbeginning(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertatend(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    void delete(int key){

        if(head == null) return;

        if(head.data == key){
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != key){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
}

public class Singlylist{

    public static void main(String args[]){

        Singlylinkedlist list = new Singlylinkedlist();

        list.insertatbeginning(30);
        list.insertatbeginning(20);
        list.insertatbeginning(10);

        list.insertatend(40);

        list.display();

        list.delete(30);

        list.display();
    }
}