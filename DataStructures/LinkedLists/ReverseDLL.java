/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    
    Node temp = head; 
    while (head.next != null) {
        head = head.next;
    }
    
    temp = head;
    while (head != null) {
        head.next = head.prev;
        head = head.next;
    }
    
    head = temp;
    
    return head;
}
