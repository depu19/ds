
package linkedlist;

/**
 * Class for MyLinkedList.
 */
public class MyLinkedList<T> {

  private Node<T> head;

  public void addFirst(T data) {
    Node<T> node = new Node<>(data, null);
    if (head == null) {
      head = node;
    } else {
      node.next = head;
      head = node;
    }
  }

  public T removeFirst() {
    if (head != null ) {
      if(head.next == null) {
        Node<T> node = head;
        head = null;
        return node.data;
      }
      else {
        Node<T> node = head;
        head = head.next;
        return node.data;
      }
    }
    return null;
  }


  public T get(int index) {
    Node<T> node  = head;
    int i = 1;
    while(node!=null && i<index){
        node = node.next;
      i++;
    }
      return node.data;
  }


  public void print(){
    Node<T> node = head;
    while (node!=null){
      System.out.println(node.data);
      node = node.next;
    }
  }


  private static class Node<T> {

    private T data;
    private Node<T> next;

    Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }

  }

}
