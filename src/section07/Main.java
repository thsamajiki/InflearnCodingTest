package section07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value; // 노드 값
        left = right = null; // 왼쪽/오른쪽 자식 노드의 번짓수
    }
}

public class Main {
    Node root;

    public void DFS(Node root) {
        if (root == null) { // root가 말단 노드에 있으면 종료
            return;
        } else {
            DFS(root.left);
            DFS(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.DFS(tree.root);
    }
}