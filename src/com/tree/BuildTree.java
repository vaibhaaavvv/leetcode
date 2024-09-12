package com.tree;

import com.sun.source.tree.BinaryTree;

public class BuildTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;
    static int index = -1;

    private Node buildTree(int[] nodes) {
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void main(String[] args) {
        BuildTree binaryTree = new BuildTree();
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node rootNode = binaryTree.buildTree(nodes);
        if (rootNode !=null)
            System.out.println(rootNode.data);
    }
}
