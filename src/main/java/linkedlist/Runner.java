
package linkedlist;

/**
 * Class for Runne.
 */
public class Runner {

  public static void main(String[] args) {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addFirst("Deepa");
    linkedList.addFirst("Shaz");
    linkedList.addFirst("Muzimil");
    linkedList.addFirst("Rashmi");
    linkedList.addFirst("Rashmi5");
    linkedList.print();
    System.out.println(linkedList.get3(1));
  }
}
