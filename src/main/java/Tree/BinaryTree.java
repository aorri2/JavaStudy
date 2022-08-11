package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    public void bfs(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            traverse(queue);
        }
    }

    private void traverse(Queue<Node> queue){
        Node poll = queue.poll();
        if(poll != null){
            System.out.print(poll.getValue()+" ");
            getChild(queue, poll.getLeft());
            getChild(queue, poll.getRight());
        }
    }

    private void getChild(Queue<Node> queue, Node child){
        if(child != null){
            queue.add(child);
        }
    }

    public static void main(String[] args) {
        final Node rightChildToRight = new Node(6, new Node(8), new Node(9));
        final Node rightChild = new Node(3, rightChildToRight, new Node(7));
        final Node leftChild = new Node(2, new Node(4), new Node(5));
        final Node root = new Node(1, leftChild, rightChild);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.dfs(root);
    }
}
