/*
 * Copyright (c) 2018 JCPenney Co. All rights reserved.
 */

package bst;

/**
 * Class for BinarySearchTree.
 */
public class BinarySearchTree<T extends Comparable> {

  private Node<T> root;

  public void add(T t) {
    Node<T> node = new Node<>(t, null, null);
    if (root == null) {
      root = node;
    } else {
      insert(t, node, root);
    }

  }

  private void insert(T t, Node<T> node, Node<T> traverseNode) {

    if (traverseNode.data.compareTo(t) == 1) {
      //left
      if (traverseNode.leftNode == null) {
        traverseNode.leftNode = node;
      } else {
        insert(t,node,traverseNode.leftNode);
      }
    } else {
      //right
      if (traverseNode.rightNode == null) {
        traverseNode.rightNode = node;
      } else {
        insert(t,node,traverseNode.rightNode);
      }
    }

  }


  private static class Node<T> {

    private T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T data, Node<T> leftNode, Node<T> rightNode) {
      this.data = data;
      this.leftNode = leftNode;
      this.rightNode = rightNode;
    }
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
        "root=" + root +
        '}';
  }
}
