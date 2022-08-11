package Tree;

public class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;

    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
