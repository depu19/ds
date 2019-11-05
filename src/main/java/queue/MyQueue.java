
package queue;

/**
 * Class for MyQueue.
 */
public class MyQueue<T> {

  private Node<T> head;
  private Node<T> tail;

  public void enqueue(T data) {
    Node<T> node = new Node<>(data,null);
    if ( tail == null){
        head = tail = node;
    }
    else {
      tail.next= node;
      tail = node;
    }
  }

  public T dequeue() {
    T data = null;
    if (head.next == null){
      data = head.data;
      head = tail = null;
      return data;
    }
    else {
      data = head.data;
      Node<T> node =  head.next;
      head = node;
    }
    return data;

  }

  public boolean isEmpty() {
    return head == null && tail == null;
  }

  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }
  }

}
