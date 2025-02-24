package linkedList;

class Node{
  int data;
  Node next;

  public Node(int data){
      this.data=data;
      next=null;
  }
}

public class LinkedList {

    Node head =null;
 public void add(int data){

     Node current = head;

     Node newNode = new Node(data);

     if (head == null){
         head = newNode;
     } else {
         while (current.next != null)
             current= current.next;
         current.next= newNode;
     }
 }


    public void printLinkedList() {

     Node current = head;

     while (current != null){

         System.out.print(current.data + " ");
         current=current.next;
     }

        System.out.println();
    }
}
