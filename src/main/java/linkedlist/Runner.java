/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */
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
    linkedList.print();
    System.out.println(linkedList.get(5));
  }
}
