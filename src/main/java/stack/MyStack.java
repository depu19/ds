/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */
package stack;

/**
 * Class for MyStack.
 */
public class MyStack<T> {

  private Node<T> top;

  public void push(T data){
    Node<T> node = new Node<>(data,null);
    if(top == null ) {
      top = node;
    }
    else {
      node.next = top;
      top = node;
    }
  }

  public T pop()
  {
    Node<T> temp = top;
    if(top != null){
      top = top.next;
      return temp.data;
    }
    return null;
  }

  public T peek(){
    if(top != null){
      return top.data;
    }
    return null;
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
