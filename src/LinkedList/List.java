package LinkedList;
/*
    @author jadon
 */

public class List<E> {

// Node class
   private class Node<E>{
       E data;
       Node next;

       /**
        * constructor of Node class.
        * @param data
        */
       public Node(E data){
           this.data = data;
           this.next = null;
       }
   }

   private Node head;

   // constructor of List class.
   public List(){
       this.head = null;
   }



    /**
     * @return the last node of the list;
     */
   private Node getLastNode(){
       if (head == null) return null;
       else {
           Node temp = head;
           while (temp.next != null) temp = temp.next;
           return temp;
       }
   }

   // add the element at last
   public void add(E data){
       if (head == null) head = new Node<>(data);
       else {
           Node temp = getLastNode();
           temp.next = new Node<>(data);
       }
   }

   // print the list
   public void printList(){
       Node list = head;
       while (list != null){
           System.out.print(list.data+"->");
           list = list.next;
       }
       System.out.println(list);


   }

    @Deprecated
   public void reverse(){
       Node ahead = null, prev = null, cur = head;
       while(cur != null){
           ahead = cur.next;
           cur.next = prev;
           prev = cur;
           cur = ahead;
       }
       head = prev;
   }

   private Node reverseRecursive_(Node node) {
       if (node == null || node.next == null) return node;
       Node newHead = reverseRecursive_(node.next);
       node.next.next = node;
       node.next = null;
       return newHead;

   }

   public void reverseRecursive(){
       Node temp = head;
       reverseRecursive_(temp);
   }



   public boolean createCycle(E val){
       Node temp = head;
       Node prev = null;
       Node matchNode = null;
       boolean flag = false;
       while(temp != null){

           if (temp.data == val) {
               matchNode = temp;
               flag = true;
           }
           prev = temp;
           temp = temp.next;
       }
       if (flag){
           prev.next = matchNode;
           return true;
       }
       return false;
   }

    /**
     * @author
     * @return
     */
   public boolean hasCycle(){
       Node slow = head;
       Node fast = head;

       while (fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if (slow == fast) break;
       }
       return slow == fast ? true : false;

    }



}

