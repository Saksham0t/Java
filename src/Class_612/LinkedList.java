package Class_612;
import org.w3c.dom.Node;
public class LinkedList {
    Node head;
     static class Node {
         int data;
         Node next;

         public Node(int d) {
             data = d;
             next = null;
         }
     }
        public static LinkedList insert(LinkedList list,int data){
            Node new_node = new Node(data);
           if(list.head == null){
               list.head = new_node;
           }else{
               Node last = list.head;
               while(last.next != null){
                   last = last.next;
               }
               last.next = new_node;
           }
           return list;
        }
        public static void printList(LinkedList list){
         Node currNode = list.head;
            System.out.print("LinkedList: ");
            while(currNode != null){
                System.out.println(currNode.data + " ");
                currNode = currNode.next;
            }
        }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll = insert(ll,1);
        ll = insert(ll,2);
        ll = insert(ll,3);
        ll = insert(ll,4);
        ll = insert(ll,4);
        ll = insert(ll,6);
        printList(ll);

    }
}
