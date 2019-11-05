
package queue;

import stack.MyStack;

/**
 * Class for Runner.
 */
public class Runner {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.enqueue("hello1");
    queue.enqueue("hello2");
    queue.enqueue("hello3");
    queue.enqueue("hello4");
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());
    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());
  }

}
