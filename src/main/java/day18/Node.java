package day18;

public class Node {
    private int value;
    private Node lefrChild;
    private Node rightChild;


    public Node(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLefrChild() {
        return lefrChild;
    }

    public void setLefrChild(Node node) {
        lefrChild = node;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node node) {
        rightChild = node;
    }

    @Override
    public String toString() {
        return "value=" + value;

    }
}

