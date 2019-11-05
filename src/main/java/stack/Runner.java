
package stack;

/**
 * Class for Runner.
 */
public class Runner {

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push("hello1");
    stack.push("hello2");
    stack.push("hello3");
    System.out.println(stack.peek());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

}
