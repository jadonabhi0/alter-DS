package LinkedList;/*
    @author jadon
*/

public class Client
{

    public static void main(String[] args) {

        List<Integer> list = new List<Integer>();
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(9);
        list.printList();
        list.reverseRecursive();
        list.printList();

    }


}
