package section07;

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Main {
    Node root;

    public void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();

            System.out.print(level + " : ");
            for (int i = 0; i < len; i++) {
                Node currentNode = q.poll();
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }

            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left  = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left  = new Node(6);
        tree.root.right.right = new Node(7);

        tree.BFS(tree.root);
    }
}