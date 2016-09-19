package com.karaf.connect;

import java.util.Scanner;

public class Solution {
	private static class Node {
		Node left, right;
		int data;

		Node(int newData) {
			left = right = null;
			data = newData;
		}

	}

	private static Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {

			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return (node);
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Node _root;
		int root_i = 0, root_cnt = 0, root_num = 0;
		System.out.println("Total Count to create a BST ...");
		root_cnt = in.nextInt();
		_root = null;
		System.out.println("Enter Numbers to create BST...");
		for (root_i = 0; root_i < root_cnt; root_i++) {
			root_num = in.nextInt();
			if (root_i == 0)
				_root = new Node(root_num);
			else
				insert(_root, root_num);
		}
		System.out.println("Enter Count of numbers to search in BST...");
		int q = in.nextInt();
		System.out.println("Enter numbers to search in BST...");
		for (int i = 0; i < q; i++) {
			int _x = in.nextInt();
			System.out.println(isPresent(_root, _x));
		}
		return;
	}

	private static int isPresent(Node root, int val) {

		/*
		 * For your reference
		 * 
		 * class Node {
		 * 
		 * Node left, right; int data; Node(int newData) { left = right = null;
		 * data = newData; } }
		 */
		if (root == null)

            return 0;

      else

            return search(root, val);
	}
	
	private static int search(Node root, int value) {

        if (value == root.data)

              return 1;

        else if (value < root.data) {

              if (root.left == null)

                    return 0;

              else

                    return search(root.left,value);

        } else if (value > root.data) {

              if (root.right == null)

                    return 0;

              else

                    return search(root.right,value);

        }

        return 0;

  }
	

}