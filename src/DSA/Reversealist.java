class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;

    }
}

class Listreverse{

    Node head;
    void reverse(){
        Node prev = null;
        Node curr= head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next= prev;
            prev=curr;
            curr = next;
            
        }
        head = prev;
        
    }


    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
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


}

class Reversealist{
    public static void main(String[] args){
        Listreverse list = new Listreverse();
        list.insertatend(40);
        list.insertatend(20);
        list.insertatend(10);

        list.display();
        list.reverse();
        System.out.println();
        list.display();



    }
}